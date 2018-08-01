package model.dto;

import lombok.Getter;
import lombok.Setter;
import model.enums.PetType;

import java.io.Serializable;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/31 16:45
 */
@Setter
@Getter
public class DynamicJobDTO implements Serializable{
    /**
     * 是否下雨
     */
    private Boolean isRain;

    /**
     * 用户id
     */
    private Long userId;
    /**
     * 宠物id
     */
    private Long petId;




    /**
     * 上一个地点id
     */
    private String previousAddressUid;

    /**
     * 到达地点id
     */
    private String nextAddressUid;

    /**
     * 宠物类型
     */
    private PetType petType;
}
