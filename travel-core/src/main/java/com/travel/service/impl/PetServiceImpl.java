package com.travel.service.impl;

import com.alibaba.fastjson.JSON;
import com.travel.dao.AddressInfoMapper;
import com.travel.dao.PrivateEventRecordMapper;
import com.travel.entity.*;
import common.config.SysConfig;
import com.travel.dao.CaptureRecordMapper;
import com.travel.dao.PetInfoMapper;
import com.travel.service.PetService;
import lombok.extern.slf4j.Slf4j;
import model.dto.DynamicJobDTO;
import model.dto.StayPetDTO;
import model.enums.PetStatus;
import model.enums.PetType;
import model.enums.PrivateEventType;
import model.request.BeatPetRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.text.MessageFormat;
import java.util.*;

import static java.util.stream.Collectors.*;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/31 17:38
 */
@Slf4j
@Service
public class PetServiceImpl implements PetService {

    @Autowired
    private PetInfoMapper petInfoMapper;

    @Autowired
    private CaptureRecordMapper captureRecordMapper;

    @Autowired
    private PrivateEventRecordMapper privateEventRecordMapper;

    @Autowired
    private CaptureRecordMapper captureRecordMapper;

    @Autowired
    private AddressInfoMapper addressInfoMapper;

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
                        beatCat(dto, entry.getValue());
                        return;
                    }
                }
            }
        }
    }

    private Boolean beatCat(DynamicJobDTO cat, List<StayPetDTO> mouses) {
        BeatPetRequest response = new BeatPetRequest();
        response.setWeakPetId(cat.getPetId());
        int index = new Random(System.currentTimeMillis()).nextInt(mouses.size());
        StayPetDTO stayPetDTO = mouses.get(index);
        response.setStrongPetId(stayPetDTO.getPetId());
        response.setAddressUid(cat.getNextAddressUid());
        return beatPet(response);
    }

    /**
     * 抓捕
     *
     * @param request
     * @return
     */
    @Override
    public Boolean beatPet(BeatPetRequest request) {

        AddressInfo addressInfo = addressInfoMapper.selectByPrimaryKey(request.getAddressUid());
        if (Objects.isNull(addressInfo)) {
            log.error("找不到地点:" + JSON.toJSONString(request));
            return false;
        }

        PetInfo strongPet = petInfoMapper.selectByPrimaryKey(request.getStrongPetId());
        if (Objects.isNull(strongPet)) {
            log.error("找不到宠物信息:" + JSON.toJSONString(request));
            return false;
        }
        PetInfo weakPet = petInfoMapper.selectByPrimaryKey(request.getWeakPetId());
        if (Objects.isNull(weakPet)) {
            log.error("找不到宠物信息:" + JSON.toJSONString(request));
            return false;
        }

        //更改被抓宠物状态
        PetInfo weakRecord = new PetInfo();
        weakRecord.setId(request.getWeakPetId());
        weakRecord.setStatus(PetStatus.END.code);
        weakRecord.setIsArrested(true);
        weakRecord.setUpdatedTm(new Date());
        petInfoMapper.updateByPrimaryKeySelective(weakRecord);


        //更改抓捕宠物状的态
        PetInfo strongRecord = new PetInfo();
        strongRecord.setId(request.getStrongPetId());
        strongRecord.setUpdatedTm(new Date());
        if (strongPet.getPetType().equals(PetType.CAT.code)) {
            //TODO: 猫抓捕老鼠后的逻辑
        } else if (strongPet.getPetType().equals(PetType.MOUSE.code)) {
            strongRecord.setCattrapTotal(strongRecord.getCattrapTotal() + 1);
        }
        petInfoMapper.updateByPrimaryKeySelective(strongRecord);

        //插入抓捕记录
        CaptureRecord captureRecord = new CaptureRecord();
        captureRecord.setStrongPetId(request.getStrongPetId());
        captureRecord.setWeakPetId(request.getStrongPetId());
        captureRecord.setAddressUid(request.getAddressUid());
        captureRecord.setDescription(MessageFormat.format("{0}在{1}抓到了{2}", strongPet.getNickname(), addressInfo.getAddress(), weakPet.getNickname()));
        captureRecord.setCreatedTm(new Date());
        captureRecordMapper.insertSelective(captureRecord);

        //插入被抓宠物的私人事件
        PrivateEventRecord eventStrongRecord = new PrivateEventRecord();
        eventStrongRecord.setPetId(weakPet.getId());
        eventStrongRecord.setCreatedTm(new Date());
        eventStrongRecord.setEventType(PrivateEventType.event_100.code);
        eventStrongRecord.setEventDesc(PrivateEventType.event_100.value);
        eventStrongRecord.setUserId(weakPet.getUserId());
        privateEventRecordMapper.insertSelective(eventStrongRecord);

        //插入抓捕宠物的私人事件
        PrivateEventRecord eventWeakRecord = new PrivateEventRecord();
        eventWeakRecord.setPetId(strongPet.getId());
        eventWeakRecord.setCreatedTm(new Date());
        eventWeakRecord.setEventType(PrivateEventType.event_200.code);
        eventWeakRecord.setEventDesc(PrivateEventType.event_200.value);
        eventWeakRecord.setUserId(strongPet.getUserId());
        privateEventRecordMapper.insertSelective(eventWeakRecord);

        return true;
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
