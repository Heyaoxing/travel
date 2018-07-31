package com.travel.jobs;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.travel.dao.RouteInfoMapper;
import model.dto.RouteInfoDTO;
import com.travel.entity.RouteInfo;
import com.travel.entity.RouteInfoExample;
import com.travel.service.ResourceService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/27 16:28
 */
//@ElasticJobConf (name = "TravelJob",cron = "0/60 * * * * ?" ,shardingItemParameters = "0=0,1=1")
public class TravelJob implements SimpleJob {

    @Autowired
    private RouteInfoMapper routeInfoMapper;

    @Autowired
    private ResourceService routeSelectService;
    @Override
    public void execute(ShardingContext context) {
        RouteInfoExample example=new RouteInfoExample();
        example.setOrderByClause(" id desc");
        example.setLimitEnd(1);
        RouteInfo routeInfo=getRoute(example);
        RouteInfoDTO routeInfoDTO=new RouteInfoDTO();
        BeanUtils.copyProperties(routeInfo,routeInfoDTO);
        routeSelectService.nextTravel(routeInfoDTO);
    }

    private  RouteInfo getRoute(RouteInfoExample example){
        List<RouteInfo> routeInfos= routeInfoMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(routeInfos)){
            RouteInfo record=new RouteInfo();
            record.setParentRouteId(0L);
            record.setLatitude(22.526216);
            record.setLongitude(113.92562);
            routeInfoMapper.insertSelective(record);
            return getRoute(example);
        }else{
            return routeInfos.get(0);
        }

    }


}
