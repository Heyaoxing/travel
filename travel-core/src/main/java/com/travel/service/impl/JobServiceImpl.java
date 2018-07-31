package com.travel.service.impl;

import com.alibaba.fastjson.JSON;
import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.dangdang.ddframe.job.lite.api.JobScheduler;
import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import com.travel.jobs.DynamicStayJob;
import com.travel.jobs.DynamicTravelJob;
import model.request.CreateJobRequest;
import com.travel.service.JobService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/31 15:46
 */
@Slf4j
@Service
public class JobServiceImpl implements JobService {
    @Autowired
    private ZookeeperRegistryCenter regCenter;

    /**
     * 创建旅行job
     *
     * @param request
     * @return
     */
    @Override
    public Boolean createTravelJob(CreateJobRequest request) {
        Boolean result = false;
        try {
            JobCoreConfiguration jobCoreConfiguration = JobCoreConfiguration.newBuilder(request.getJobName(), request.getCron(), request.getShardingTotalCount()).description(request.getDescript()).build();
            SimpleJobConfiguration simpleJobConfiguration = new SimpleJobConfiguration(jobCoreConfiguration, DynamicTravelJob.class.getCanonicalName());
            JobScheduler jobScheduler = new JobScheduler(regCenter, LiteJobConfiguration.newBuilder(simpleJobConfiguration).build());
            jobScheduler.init();
            result = true;
        } catch (Exception e) {
            log.error("创建旅行job异常:{},参数为:{}", e, JSON.toJSONString(request));
        }
        return result;
    }

    /**
     * 创建停留job
     *
     * @param request
     * @return
     */
    @Override
    public Boolean createStayJob(CreateJobRequest request) {
        Boolean result = false;
        try {
            JobCoreConfiguration jobCoreConfiguration = JobCoreConfiguration.newBuilder(request.getJobName(), request.getCron(), request.getShardingTotalCount()).description(request.getDescript()).build();
            SimpleJobConfiguration simpleJobConfiguration = new SimpleJobConfiguration(jobCoreConfiguration, DynamicStayJob.class.getCanonicalName());
            JobScheduler jobScheduler = new JobScheduler(regCenter, LiteJobConfiguration.newBuilder(simpleJobConfiguration).build());
            jobScheduler.init();
            result = true;
        } catch (Exception e) {
            log.error("创建停留job异常:{},参数为:{}", e, JSON.toJSONString(request));
        }
        return result;
    }
}
