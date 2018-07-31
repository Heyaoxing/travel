package model.dto;

import lombok.Getter;
import lombok.Setter;
import model.enums.PetType;

import java.io.Serializable;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/31 17:45
 */
@Getter
@Setter
public class StayPetDTO implements Serializable{
    /**
     *
     */
    private Long petId;

    /**
     *
     */
    private Long userId;

    /**
     * 类型
     1：猫
     2：老鼠
     */
    private PetType petType;
}
