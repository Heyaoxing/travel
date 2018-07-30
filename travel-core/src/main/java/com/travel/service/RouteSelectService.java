package com.travel.service;

import com.travel.dto.PlaceSearchDto;
import com.travel.dto.RidingDTO;
import com.travel.dto.RouteInfoDTO;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/30 16:24
 */
public interface RouteSelectService {


    /**
     * 前往下一个目的地
     * @param record
     * @return
     */
    Boolean nextTravel(RouteInfoDTO record);


    /**
     * 获取附近地点(随机不重复)
     *
     * @return
     */
     PlaceSearchDto getRound(double latitude,double longitude);

}
