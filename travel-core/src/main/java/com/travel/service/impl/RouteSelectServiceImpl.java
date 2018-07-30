package com.travel.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.travel.dao.ExcludeRouteMapper;
import com.travel.dao.RouteInfoMapper;
import com.travel.dto.PlaceSearchDto;
import com.travel.dto.RidingDTO;
import com.travel.dto.RouteInfoDTO;
import com.travel.model.ExcludeRoute;
import com.travel.model.ExcludeRouteExample;
import com.travel.model.RouteInfo;
import com.travel.model.RouteInfoExample;
import com.travel.service.RouteSelectService;
import common.SysConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.text.MessageFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/30 16:24
 */
@Slf4j
@Service
public class RouteSelectServiceImpl implements RouteSelectService {


    @Autowired
    private RouteInfoMapper routeInfoMapper;

    @Autowired
    private ExcludeRouteMapper excludeRouteMapper;


    /**
     * 前往下一个目的地
     * @param record
     * @return
     */
    @Override
    public Boolean nextTravel(RouteInfoDTO record) {
        if (Objects.isNull(record)) {
            return false;
        }
        PlaceSearchDto placeSearchDto = getRound(record.getLatitude(), record.getLongitude());
        if (Objects.isNull(placeSearchDto)) {
            return false;
        }
        RidingDTO ridingDTO = getRiding(record,placeSearchDto);
        if (Objects.isNull(ridingDTO)) {
            return false;
        }

        RouteInfo routeInfo=new RouteInfo();
        routeInfo.setAddress(placeSearchDto.getAddress());
        routeInfo.setAddressUid(placeSearchDto.getUid());
        routeInfo.setArea(placeSearchDto.getArea());
        routeInfo.setCity(placeSearchDto.getCity());
        routeInfo.setCreatedTm(new Date());
        routeInfo.setDistance(ridingDTO.getDistance());
        routeInfo.setDuration(ridingDTO.getDuration());
        routeInfo.setLatitude(placeSearchDto.getLocation().getLat());
        routeInfo.setLongitude(placeSearchDto.getLocation().getLng());
        routeInfo.setName(placeSearchDto.getName());
        routeInfo.setProvince(placeSearchDto.getProvince());
        routeInfo.setStreetId(placeSearchDto.getStreet_id());
        routeInfo.setRouteId(record.getId());
        routeInfoMapper.insertSelective(routeInfo);
        log.info("前往下一个地点成功!");
        return true;
    }



    /**
     * 自行车路径规划
     *
     * @return
     */
    private RidingDTO getRiding(RouteInfoDTO origin,PlaceSearchDto destination ) {
        String url = MessageFormat.format(SysConfig.BAIDURIDING, origin.getLatitude(), origin.getLongitude(), destination.getLocation().getLat(), destination.getLocation().getLng());
        JSONObject jsonObject = util.HttpClientUtils.httpGet(url);
        try {
            JSONObject result = JSON.parseObject(jsonObject.get("result").toString());
            RidingDTO riding = JSON.parseObject(result.getJSONArray("routes").get(0).toString(), RidingDTO.class);
            return riding;
        } catch (Exception e) {
            if(jsonObject.get("status").toString().equals("2001")){
                log.info("没有骑行方案");
                ExcludeRoute excludeRoute=new ExcludeRoute();
                excludeRoute.setAddress(destination.getAddress());
                excludeRoute.setAddressUid(destination.getUid());
                excludeRoute.setArea(destination.getArea());
                excludeRoute.setCity(destination.getCity());
                excludeRoute.setCreatedTm(new Date());
                excludeRoute.setLatitude(destination.getLocation().getLat());
                excludeRoute.setLongitude(destination.getLocation().getLng());
                excludeRoute.setName(destination.getName());
                excludeRoute.setProvince(destination.getProvince());
                excludeRoute.setStreetId(destination.getStreet_id());
                excludeRouteMapper.insertSelective(excludeRoute);
            }
            log.error("自行车路径规划失败：" + e);
        }
        return null;
    }

    /**
     * 获取附近地点(随机不重复)
     *
     * @return
     */
    @Override
    public PlaceSearchDto getRound(double latitude, double longitude) {
        try {
            String url = MessageFormat.format(SysConfig.BAIDUMAPPLACESEARCHAPI, "景点", latitude, longitude);
            JSONObject jsonObject = util.HttpClientUtils.httpGet(url);
            List<PlaceSearchDto> dtos = JSON.parseArray(jsonObject.get("results").toString(), PlaceSearchDto.class);
            if (!CollectionUtils.isEmpty(dtos) && dtos.size() > 0) {
                int index = select(dtos);
                log.info("可选择的地点有{},选择下标:{}",dtos.size(),index);
                if (index >= 0) {
                    PlaceSearchDto dto = dtos.get(index);
                    log.info("前往目的地：" + JSON.toJSONString(dto));
                    return dto;
                }
            }
        } catch (Exception e) {

            log.error("获取附近地点数据失败：" + e);
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
        if (dtos.size() <= 0){
            return -1;
        }
        int index = new Random(System.currentTimeMillis()).nextInt(dtos.size());
        String uid = dtos.get(index).getUid();
        RouteInfoExample example = new RouteInfoExample();
        example.createCriteria().andAddressUidEqualTo(uid);
        long count = routeInfoMapper.countByExample(example);
        ExcludeRouteExample excludeRouteExample=new ExcludeRouteExample();
        excludeRouteExample.createCriteria().andAddressUidEqualTo(uid);
        long exclude= excludeRouteMapper.countByExample(excludeRouteExample);
        if (count > 0||exclude>0) {
            dtos.remove(index);
            return select(dtos);
        }else{
            return index;
        }
    }
}
