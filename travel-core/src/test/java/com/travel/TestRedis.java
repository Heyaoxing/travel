package com.travel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/8/1 14:27
 */
@RunWith ( SpringJUnit4ClassRunner.class ) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringBootTest ( classes = TravelCoreApplication.class ) // 指定我们SpringBoot工程的Application启动类
public class TestRedis {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void set() {
        redisTemplate.opsForValue().set("asd", "dss");
    }
}
