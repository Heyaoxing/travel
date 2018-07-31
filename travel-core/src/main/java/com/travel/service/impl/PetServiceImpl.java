package com.travel.service.impl;

import com.travel.config.SysConfig;
import com.travel.dao.CaptureRecordMapper;
import com.travel.dao.PetInfoMapper;
import com.travel.entity.CaptureRecordExample;
import com.travel.entity.PetInfo;
import com.travel.entity.PetInfoExample;
import com.travel.service.PetService;
import model.dto.DynamicJobDTO;
import model.dto.StayPetDTO;
import model.enums.PetStatus;
import model.enums.PetType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/31 17:38
 */
public class PetServiceImpl implements PetService {

    @Autowired
    private PetInfoMapper petInfoMapper;

    @Autowired
    private CaptureRecordMapper captureRecordMapper;

    /**
     * 猫旅行到达处理
     *
     * @param dto
     */
    public void catTravelArriveProcess(DynamicJobDTO dto) {
        List<StayPetDTO> stayPetDTOS = getStayPet(dto.getNextAddressUid());
        if (!CollectionUtils.isEmpty(stayPetDTOS)) {
            Map<Long, List<StayPetDTO>> map = stayPetDTOS.stream().filter(p -> p.getPetType().equals(PetType.MOUSE)).collect(groupingBy(StayPetDTO::getUserId));
            if (Objects.nonNull(map) && map.size() > 0) {
                for (Map.Entry<Long, List<StayPetDTO>> entry : map.entrySet()) {
                    if (entry.getValue().size() > SysConfig.needMouseNum) {

                        beatCat(dto,entry.getValue());
                        return;
                    }
                }
            }
        }
    }

    private void beatCat(DynamicJobDTO cat, List<StayPetDTO> mouses) {

    }

    /**
     * 获得该地点在留详情
     *
     * @param addressUid
     * @return
     */
    @Override
    public List<StayPetDTO> getStayPet(String addressUid) {
        List<StayPetDTO> list = new ArrayList<>();
        if (StringUtils.isEmpty(addressUid)) {
            return list;
        }
        PetInfoExample example = new PetInfoExample();
        example.createCriteria().andIsArrestedEqualTo(false).andStatusEqualTo(PetStatus.ARRIVED.code).andAddressUidEqualTo(addressUid);
        List<PetInfo> petInfos = petInfoMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(petInfos)) {
            petInfos.forEach(p -> {
                StayPetDTO stayPetDTO = new StayPetDTO();
                stayPetDTO.setPetId(p.getId());
                stayPetDTO.setPetType(PetType.getByCode(p.getPetType()));
                stayPetDTO.setUserId(p.getUserId());
            });
        }
        return list;
    }
}
