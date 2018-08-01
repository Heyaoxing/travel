package com.travel.entity;

import java.util.Date;

public class PetInfo {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long userId;

    /**
     * 父代id
     */
    private Long parentPetId;

    /**
     * 第几代
     */
    private Integer generation;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 类型             1：猫             2：老鼠
     */
    private Byte petType;

    /**
     * 得到下雨数
     */
    private Integer receiveRainNum;

    /**
     * 累计抓捕老鼠数
     */
    private Integer mousetrapTotal;

    /**
     * 累计抓到猫的数量
     */
    private Integer cattrapTotal;

    /**
     * 抓捕老鼠数
     */
    private Integer mousetrapNum;

    /**
     * 状态             100：路途中             200：到达地点             300：异常             400：结束
     */
    private Integer status;

    /**
     * 状态描述
     */
    private String statusDesc;

    /**
     * 是否被捕             0:否             1:是
     */
    private Boolean isArrested;

    /**
     * 创建时间
     */
    private Date createdTm;

    /**
     * 更新时间
     */
    private Date updatedTm;

    /**
     * 当前所在地uid
     */
    private String addressUid;

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
     * 父代id
     * @return parent_pet_id 父代id
     */
    public Long getParentPetId() {
        return parentPetId;
    }

    /**
     * 父代id
     * @param parentPetId 父代id
     */
    public void setParentPetId(Long parentPetId) {
        this.parentPetId = parentPetId;
    }

    /**
     * 第几代
     * @return generation 第几代
     */
    public Integer getGeneration() {
        return generation;
    }

    /**
     * 第几代
     * @param generation 第几代
     */
    public void setGeneration(Integer generation) {
        this.generation = generation;
    }

    /**
     * 昵称
     * @return nickname 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 昵称
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 类型             1：猫             2：老鼠
     * @return pet_type 类型             1：猫             2：老鼠
     */
    public Byte getPetType() {
        return petType;
    }

    /**
     * 类型             1：猫             2：老鼠
     * @param petType 类型             1：猫             2：老鼠
     */
    public void setPetType(Byte petType) {
        this.petType = petType;
    }

    /**
     * 得到下雨数
     * @return receive_rain_num 得到下雨数
     */
    public Integer getReceiveRainNum() {
        return receiveRainNum;
    }

    /**
     * 得到下雨数
     * @param receiveRainNum 得到下雨数
     */
    public void setReceiveRainNum(Integer receiveRainNum) {
        this.receiveRainNum = receiveRainNum;
    }

    /**
     * 累计抓捕老鼠数
     * @return mousetrap_total 累计抓捕老鼠数
     */
    public Integer getMousetrapTotal() {
        return mousetrapTotal;
    }

    /**
     * 累计抓捕老鼠数
     * @param mousetrapTotal 累计抓捕老鼠数
     */
    public void setMousetrapTotal(Integer mousetrapTotal) {
        this.mousetrapTotal = mousetrapTotal;
    }

    /**
     * 累计抓到猫的数量
     * @return cattrap_total 累计抓到猫的数量
     */
    public Integer getCattrapTotal() {
        return cattrapTotal;
    }

    /**
     * 累计抓到猫的数量
     * @param cattrapTotal 累计抓到猫的数量
     */
    public void setCattrapTotal(Integer cattrapTotal) {
        this.cattrapTotal = cattrapTotal;
    }

    /**
     * 抓捕老鼠数
     * @return mousetrap_num 抓捕老鼠数
     */
    public Integer getMousetrapNum() {
        return mousetrapNum;
    }

    /**
     * 抓捕老鼠数
     * @param mousetrapNum 抓捕老鼠数
     */
    public void setMousetrapNum(Integer mousetrapNum) {
        this.mousetrapNum = mousetrapNum;
    }

    /**
     * 状态             100：路途中             200：到达地点             300：异常             400：结束
     * @return status 状态             100：路途中             200：到达地点             300：异常             400：结束
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态             100：路途中             200：到达地点             300：异常             400：结束
     * @param status 状态             100：路途中             200：到达地点             300：异常             400：结束
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 状态描述
     * @return status_desc 状态描述
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * 状态描述
     * @param statusDesc 状态描述
     */
    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc == null ? null : statusDesc.trim();
    }

    /**
     * 是否被捕             0:否             1:是
     * @return is_arrested 是否被捕             0:否             1:是
     */
    public Boolean getIsArrested() {
        return isArrested;
    }

    /**
     * 是否被捕             0:否             1:是
     * @param isArrested 是否被捕             0:否             1:是
     */
    public void setIsArrested(Boolean isArrested) {
        this.isArrested = isArrested;
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

    /**
     * 当前所在地uid
     * @return address_uid 当前所在地uid
     */
    public String getAddressUid() {
        return addressUid;
    }

    /**
     * 当前所在地uid
     * @param addressUid 当前所在地uid
     */
    public void setAddressUid(String addressUid) {
        this.addressUid = addressUid == null ? null : addressUid.trim();
    }
}