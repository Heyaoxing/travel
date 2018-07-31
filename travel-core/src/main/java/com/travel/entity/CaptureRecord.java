package com.travel.entity;

import java.util.Date;

public class CaptureRecord {
    /**
     * 
     */
    private Long id;

    /**
     * 主动抓的宠物id
     */
    private Long strongPetId;

    /**
     * 被抓的宠物id
     */
    private Long weakPetId;

    /**
     * 抓捕地区uid
     */
    private String addressUid;

    /**
     * 抓捕描述
     */
    private String description;

    /**
     * 创建时间
     */
    private Date createdTm;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 主动抓的宠物id
     * @return strong_pet_id 主动抓的宠物id
     */
    public Long getStrongPetId() {
        return strongPetId;
    }

    /**
     * 主动抓的宠物id
     * @param strongPetId 主动抓的宠物id
     */
    public void setStrongPetId(Long strongPetId) {
        this.strongPetId = strongPetId;
    }

    /**
     * 被抓的宠物id
     * @return weak_pet_id 被抓的宠物id
     */
    public Long getWeakPetId() {
        return weakPetId;
    }

    /**
     * 被抓的宠物id
     * @param weakPetId 被抓的宠物id
     */
    public void setWeakPetId(Long weakPetId) {
        this.weakPetId = weakPetId;
    }

    /**
     * 抓捕地区uid
     * @return address_uid 抓捕地区uid
     */
    public String getAddressUid() {
        return addressUid;
    }

    /**
     * 抓捕地区uid
     * @param addressUid 抓捕地区uid
     */
    public void setAddressUid(String addressUid) {
        this.addressUid = addressUid == null ? null : addressUid.trim();
    }

    /**
     * 抓捕描述
     * @return description 抓捕描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 抓捕描述
     * @param description 抓捕描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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