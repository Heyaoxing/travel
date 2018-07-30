package com.travel.model;

import java.util.Date;

public class ExcludeRoute {
    /**
     * 
     */
    private Integer id;

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
     * 创建时间
     */
    private Date createdTm;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 目的地
     * @return name 目的地
     */
    public String getName() {
        return name;
    }

    /**
     * 目的地
     * @param name 目的地
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 纬度
     * @return latitude 纬度
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 纬度
     * @param latitude 纬度
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 经度
     * @return longitude 经度
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 经度
     * @param longitude 经度
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 详细地址
     * @return address 详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 详细地址
     * @param address 详细地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 省
     * @return province 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 城市
     * @return city 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 城市
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 区县
     * @return area 区县
     */
    public String getArea() {
        return area;
    }

    /**
     * 区县
     * @param area 区县
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * 全景图id
     * @return street_id 全景图id
     */
    public String getStreetId() {
        return streetId;
    }

    /**
     * 全景图id
     * @param streetId 全景图id
     */
    public void setStreetId(String streetId) {
        this.streetId = streetId == null ? null : streetId.trim();
    }

    /**
     * 地图地区uid
     * @return address_uid 地图地区uid
     */
    public String getAddressUid() {
        return addressUid;
    }

    /**
     * 地图地区uid
     * @param addressUid 地图地区uid
     */
    public void setAddressUid(String addressUid) {
        this.addressUid = addressUid == null ? null : addressUid.trim();
    }

    /**
     * 创建时间
     * @return created_tm 创建时间
     */
    public Date getCreatedTm() {
        return createdTm;
    }

    /**
     * 创建时间
     * @param createdTm 创建时间
     */
    public void setCreatedTm(Date createdTm) {
        this.createdTm = createdTm;
    }
}