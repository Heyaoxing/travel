package com.travel.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/27 19:11
 */
@Setter
@Getter
public class Location implements Serializable {
    private double lat;
    private double lng;
}
