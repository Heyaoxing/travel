package com.travel.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.travel.dao.RouteInfoMapper;
import com.travel.dto.PlaceSearchDto;
import com.travel.dto.RouteInfoDTO;
import com.travel.model.RouteInfo;
import com.travel.model.RouteInfoExample;
import com.travel.service.RouteSelectService;
import common.SysConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.text.MessageFormat;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/30 16:24
 */
@Slf4j
public class RouteSelectServiceImpl implements RouteSelectService {


    @Autowired
    private RouteInfoMapper routeInfoMapper;


    public void nextTravel(RouteInfoDTO record) {
        if (Objects.isNull(record)) {return;}

        PlaceSearchDto placeSearchDto = getRound(record.getLatitude(), record.getLongitude());
        if(Objects.isNull(placeSearchDto)){return;}



    }

    /**
     * 获取附近地点(随机不重复)
     *
     * @return
     */
    @Override
    public PlaceSearchDto getRound(double latitude, double longitude) {
        try{
            String url = MessageFormat.format(SysConfig.BAIDUMAPPLACESEARCHAPI, "景点", latitude, longitude);
            JSONObject jsonObject = util.HttpClientUtils.httpGet(url);
            List<PlaceSearchDto> dtos = JSON.parseArray(jsonObject.get("results").toString(), PlaceSearchDto.class);
            if (!CollectionUtils.isEmpty(dtos) && dtos.size() > 0) {
                int index = select(dtos);
                if (index >= 0) {
                    PlaceSearchDto dto = dtos.get(index);
                    log.info("前往目的地：" + JSON.toJSONString(dto));
                    return dto;
                }
            }
        }catch (Exception e){
            log.error("获取附近地点数据失败："+e);
        }
        return null;
    }

    /**
     * 选择没去过的地点下标
     *
     * @param dtos
     * @return
     */
    private int select(List<PlaceSearchDto> dtos) {
        if (dtos.size() <= 0)
            return -1;
        int index = new Random(System.currentTimeMillis()).nextInt(dtos.size());
        String uid = dtos.get(index).getUid();
        RouteInfoExample example = new RouteInfoExample();
        example.createCriteria().andAddressUidEqualTo(uid);
        long count = routeInfoMapper.countByExample(example);
        if (count > 0) {
            dtos.remove(index);
            return select(dtos);
        }
        return index;
    }
}
