package model.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/8/1 16:31
 */
@Setter
@Getter
public class BeatPetRequest  implements Serializable {

    /**
     * 主动抓捕的宠物id
     */
    private long strongPetId;

    /**
     * 被抓的宠物id
     */
    private long weakPetId;

    /**
     * 抓捕地uid
     */
    private String addressUid;
}
