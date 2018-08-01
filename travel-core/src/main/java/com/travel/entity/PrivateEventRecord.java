package com.travel.entity;

import java.util.Date;

public class PrivateEventRecord {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long petId;

    /**
     * 
     */
    private Long userId;

    /**
     * 事件类型             100：被捕             200：抓到宠物
     */
    private Integer eventType;

    /**
     * 事件描述
     */
    private String eventDesc;

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
     * 
     * @return pet_id 
     */
    public Long getPetId() {
        return petId;
    }

    /**
     * 
     * @param petId 
     */
    public void setPetId(Long petId) {
        this.petId = petId;
    }

    /**
     * 
     * @return user_id 
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId 
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 事件类型             100：被捕             200：抓到宠物
     * @return event_type 事件类型             100：被捕             200：抓到宠物
     */
    public Integer getEventType() {
        return eventType;
    }

    /**
     * 事件类型             100：被捕             200：抓到宠物
     * @param eventType 事件类型             100：被捕             200：抓到宠物
     */
    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    /**
     * 事件描述
     * @return event_desc 事件描述
     */
    public String getEventDesc() {
        return eventDesc;
    }

    /**
     * 事件描述
     * @param eventDesc 事件描述
     */
    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc == null ? null : eventDesc.trim();
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