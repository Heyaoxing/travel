package model.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/30 17:05
 */
@Setter
@Getter
public class RouteInfoDTO implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     * 出发地轨迹id
     */
    private Long routeId;

    /**
     * 目的地
     */
    private String name;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 省
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 区县
     */
    private String area;

    /**
     * 全景图id
     */
    private String streetId;

    /**
     * 地图地区uid
     */
    private String addressUid;

    /**
     * 路段距离
     */
    private Integer distance;

    /**
     * 路段耗时
     */
    private Integer duration;

    /**
     * 创建时间
     */
    private Date createdTm;

    /**
     * 更新时间
     */
    private Date updatedTm;

}
