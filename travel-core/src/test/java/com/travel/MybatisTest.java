package com.travel;

import com.travel.dao.RouteInfoMapper;
import com.travel.entity.RouteInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/30 15:08
 */
@RunWith (SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringBootTest (classes = TravelCoreApplication.class) // 指定我们SpringBoot工程的Application启动类
public class MybatisTest {
    @Autowired
    private RouteInfoMapper routeInfoMapper;

    @Test
    public void insertTest(){
        RouteInfo routeInfo=new RouteInfo();
        routeInfo.setAddress("测试");
        routeInfoMapper.insertSelective(routeInfo);
    }
}
