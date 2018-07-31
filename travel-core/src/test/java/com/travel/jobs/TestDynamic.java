package com.travel.jobs;

import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.dangdang.ddframe.job.lite.api.JobScheduler;
import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
import com.travel.TravelCoreApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;

import java.util.UUID;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/31 15:15
 */
@RunWith (SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringBootTest (classes = TravelCoreApplication.class) // 指定我们SpringBoot工程的Application启动类
public class TestDynamic {

    @Autowired
    private ZookeeperRegistryCenter regCenter;

    @Test
    public void createJob() throws InterruptedException {
        String cron = "0/2 * * * * ?";
        System.out.println("【定时任务执行的时间】cron="+cron);
        int shardingTotalCount = 1;
        String jobName = UUID.randomUUID().toString();
        JobCoreConfiguration jobCoreConfiguration = JobCoreConfiguration.newBuilder(jobName, cron, shardingTotalCount).jobParameter("hello hyx").build();
        SimpleJobConfiguration simpleJobConfiguration = new SimpleJobConfiguration(jobCoreConfiguration, DynamicTravelJob.class.getCanonicalName());
        JobScheduler jobScheduler = new JobScheduler(regCenter, LiteJobConfiguration.newBuilder(simpleJobConfiguration).build());
        jobScheduler.init();
        Thread.sleep(1000*60);
    }
}
