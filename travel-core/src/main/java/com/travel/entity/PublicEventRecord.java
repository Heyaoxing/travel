package com.travel.entity;

import java.util.Date;

public class PublicEventRecord {
    /**
     * 
     */
    private Long id;

    /**
     * 事件类型
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
     * 事件类型
     * @return event_type 事件类型
     */
    public Integer getEventType() {
        return eventType;
    }

    /**
     * 事件类型
     * @param eventType 事件类型
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