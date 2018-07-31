package com.travel.jobs;

import com.alibaba.fastjson.JSON;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.travel.dao.PetInfoMapper;
import com.travel.entity.PetInfo;
import lombok.extern.slf4j.Slf4j;
import model.dto.DynamicJobDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.Objects;

/**
 * @Description:生成旅行job
 * @Author: 990016
 * @Date 2018/7/31 15:25
 */
@Slf4j
public class DynamicTravelJob implements SimpleJob {


    @Autowired
    private PetInfoMapper petInfoMapper;

    /**
     * step 1: 到达地点,检查是否存在猫或者是老鼠
     * step 2: 如果是猫的话，存在老鼠则抓捕,如果同个用户的老鼠数量足以抵抗猫的话，则猫被抓捕，奖励用户一半的老鼠
     * 如果是老鼠，发现猫的话则重新规划路线
     * step 3: 检查天气状况
     * step 4: 随机时间创建停留job
     *
     * @param shardingContext
     */
    @Override
    public void execute(ShardingContext shardingContext) {
        if (StringUtils.isEmpty(shardingContext.getJobParameter())) {
            log.error("旅行job参数为空");
            return;
        }
        DynamicJobDTO jobDTO = JSON.parseObject(shardingContext.getJobParameter(), DynamicJobDTO.class);
        if(Objects.isNull(jobDTO)){
            log.error("旅行job参数为空");
            return;
        }
    }
}
