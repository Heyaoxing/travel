package model.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/30 17:25
 */
@Setter
@Getter
public class RidingDTO implements Serializable {
    /**
     * 方案距离
     */
    private Integer distance;
    /**
     * 线路耗时
     */
    private Integer duration;
}
