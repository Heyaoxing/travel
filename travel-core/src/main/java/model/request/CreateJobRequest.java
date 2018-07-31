package model.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/31 15:47
 */
@Setter
@Getter
public class CreateJobRequest implements Serializable{
    private String cron;
    private String jobName;
    /**
     * 描述
     */
    private String descript;
    private int shardingTotalCount = 1;

}
