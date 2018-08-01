package com.travel.service;

import model.dto.PlaceSearchDTO;
import model.dto.RouteInfoDTO;
import model.dto.WeatherDTO;

/**
 * @Description: 资源服务
 * @Author: 990016
 * @Date 2018/7/30 16:24
 */
public interface ResourceService {


    /**
     * 前往下一个目的地
     *
     * @param record
     * @return
     */
    Boolean nextTravel(RouteInfoDTO record);


    /**
     * 获取附近地点(随机不重复)
     *
     * @return
     */
    PlaceSearchDTO getRound(double latitude, double longitude);

    /**
     * 获取天气信息
     *
     * @param cityName
     * @return
     */
    WeatherDTO getWeather(String cityName);

}
