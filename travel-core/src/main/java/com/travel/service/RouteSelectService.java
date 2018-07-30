package com.travel.service;

import com.travel.dto.PlaceSearchDto;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/30 16:24
 */
public interface RouteSelectService {

    /**
     * 获取附近地点(随机不重复)
     *
     * @return
     */
     PlaceSearchDto getRound(double latitude,double longitude);
}
