package com.travel.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.travel.dao.ExcludeRouteMapper;
import com.travel.dao.RouteInfoMapper;
import common.utils.HttpClientUtil;
import model.dto.PlaceSearchDTO;
import model.dto.RidingDTO;
import model.dto.RouteInfoDTO;
import com.travel.entity.ExcludeRoute;
import com.travel.entity.ExcludeRouteExample;
import com.travel.entity.RouteInfo;
import com.travel.entity.RouteInfoExample;
import com.travel.service.ResourceService;
import common.config.SysConfig;
import lombok.extern.slf4j.Slf4j;
import model.dto.WeatherDTO;
import model.enums.POITag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.text.MessageFormat;
import java.util.*;

/**
 * @Description: 资源服务
 * @Author: 990016
 * @Date 2018/7/30 16:24
 */
@Slf4j
@Service
public class ResourceServiceImpl implements ResourceService {


    @Autowired
    private RouteInfoMapper routeInfoMapper;

    @Autowired
    private ExcludeRouteMapper excludeRouteMapper;


    /**
     * 前往下一个目的地
     *
     * @param record
     * @return
     */
    @Override
    public Boolean nextTravel(RouteInfoDTO record) {
        if (Objects.isNull(record)) {
            return false;
        }
        PlaceSearchDTO placeSearchDto = getRound(record.getLatitude(), record.getLongitude());
        if (Objects.isNull(placeSearchDto)) {
            return false;
        }
        RidingDTO ridingDTO = getRiding(record, placeSearchDto);
        if (Objects.isNull(ridingDTO)) {
            return false;
        }

        RouteInfo routeInfo = new RouteInfo();
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
        routeInfo.setParentRouteId(record.getId());
        routeInfoMapper.insertSelective(routeInfo);
        log.info("前往下一个地点成功!");
        return true;
    }


    /**
     * 自行车路径规划
     *
     * @return
     */
    private RidingDTO getRiding(RouteInfoDTO origin, PlaceSearchDTO destination) {
        String url = MessageFormat.format(SysConfig.BAIDURIDINGAPI, origin.getLatitude(), origin.getLongitude(), destination.getLocation().getLat(), destination.getLocation().getLng());
        JSONObject jsonObject = HttpClientUtil.httpGet(url);
        try {
            JSONObject result = JSON.parseObject(jsonObject.get("result").toString());
            RidingDTO riding = JSON.parseObject(result.getJSONArray("routes").get(0).toString(), RidingDTO.class);
            return riding;
        } catch (Exception e) {
            if (jsonObject.get("status").toString().equals("2001")) {
                log.info("没有骑行方案");
                ExcludeRoute excludeRoute = new ExcludeRoute();
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
    public PlaceSearchDTO getRound(double latitude, double longitude) {
        try {
            String url = MessageFormat.format(SysConfig.BAIDUMAPPLACESEARCHAPI, POITag.POI_06.value, latitude, longitude);
            JSONObject jsonObject = HttpClientUtil.httpGet(url);
            List<PlaceSearchDTO> dtos = JSON.parseArray(jsonObject.get("results").toString(), PlaceSearchDTO.class);
            if (!CollectionUtils.isEmpty(dtos) && dtos.size() > 0) {
                int index = select(dtos);
                log.info("可选择的地点有{},选择下标:{}", dtos.size(), index);
                if (index >= 0) {
                    PlaceSearchDTO dto = dtos.get(index);
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
    private int select(List<PlaceSearchDTO> dtos) {
        if (dtos.size() <= 0) {
            return -1;
        }
        int index = new Random(System.currentTimeMillis()).nextInt(dtos.size());
        String uid = dtos.get(index).getUid();
        RouteInfoExample example = new RouteInfoExample();
        example.createCriteria().andAddressUidEqualTo(uid);
        long count = routeInfoMapper.countByExample(example);
        ExcludeRouteExample excludeRouteExample = new ExcludeRouteExample();
        excludeRouteExample.createCriteria().andAddressUidEqualTo(uid);
        long exclude = excludeRouteMapper.countByExample(excludeRouteExample);
        if (count > 0 || exclude > 0) {
            dtos.remove(index);
            return select(dtos);
        } else {
            return index;
        }
    }

    /**
     * 获取天气信息
     *
     * @param cityName
     * @return
     */
    @Override
    public WeatherDTO getWeather(String cityName) {
        if(StringUtils.isEmpty(cityName)){
            return null;
        }

        String url = SysConfig.WEATHERAPI;
        String method = "GET";
        String appcode = "b9769dc2da5448d8a3f97cbad013dbfc";
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("city", cityName);
        querys.put("citycode", "citycode");
        querys.put("cityid", "cityid");
        querys.put("ip", "ip");
        querys.put("location", "location");
        try {
            JSONObject jsonObject = HttpClientUtil.doGet(url, "", method, headers, querys);
            if (jsonObject.get("status").toString().equals("0")) {
                WeatherDTO weatherDTO = JSON.parseObject(jsonObject.get("result").toString(), WeatherDTO.class);
                return weatherDTO;
            }
            log.error("天气预报接口异常:{}", jsonObject.get("msg").toString());
        } catch (Exception e) {
            System.out.println("获取天气信息异常:" + e.getStackTrace());
        }
        return null;
    }
}
