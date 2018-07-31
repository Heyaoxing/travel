package com.travel.entity;

import java.util.Date;

public class UserInfo {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Byte role;

    /**
     * 创建时间
     */
    private Date createdTm;

    /**
     * 更新时间
     */
    private Date updatedTm;

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
     * @return role 
     */
    public Byte getRole() {
        return role;
    }

    /**
     * 
     * @param role 
     */
    public void setRole(Byte role) {
        this.role = role;
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

    /**
     * 更新时间
     * @return updated_tm 更新时间
     */
    public Date getUpdatedTm() {
        return updatedTm;
    }

    /**
     * 更新时间
     * @param updatedTm 更新时间
     */
    public void setUpdatedTm(Date updatedTm) {
        this.updatedTm = updatedTm;
    }
}