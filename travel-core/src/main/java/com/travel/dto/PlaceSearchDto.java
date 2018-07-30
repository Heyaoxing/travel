package com.travel.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/27 18:11
 */
@Setter
@Getter
public class PlaceSearchDto implements Serializable {
    private String name;
    private Location location;
    private String address;
    private String province;
    private String city;
    private String area;
    private String detail;
    private String uid;
    private String street_id;

}
