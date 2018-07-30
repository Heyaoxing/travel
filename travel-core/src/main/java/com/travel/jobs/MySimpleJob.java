package com.travel.jobs;

import com.cxytiandi.elasticjob.annotation.ElasticJobConf;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.travel.dao.RouteInfoMapper;
import com.travel.model.RouteInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/27 16:28
 */
@ElasticJobConf (name = "MySimpleJob",cron = "0/5 * * * * ?" ,shardingItemParameters = "0=0,1=1")
public class MySimpleJob implements SimpleJob {

    @Autowired
    private RouteInfoMapper routeInfoMapper;

    @Override
    public void execute(ShardingContext context) {
        System.out.println("hello");

    }
}
