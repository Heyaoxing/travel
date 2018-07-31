package com.travel.service;

import model.dto.StayPetDTO;

import java.util.List;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/31 17:37
 */
public interface PetService {

    /**
     * 获得该地点在留详情
     * @param addressUid
     * @return
     */
    List<StayPetDTO> getStayPet(String addressUid);
}
