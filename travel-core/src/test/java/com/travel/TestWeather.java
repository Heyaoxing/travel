package com.travel;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import common.utils.HttpClientUtil;
import model.dto.WeatherDTO;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/8/1 11:12
 */
public class TestWeather {

    public static void main(String[] args) {
        String host = "https://jisutqybmf.market.alicloudapi.com";
        String path = "/weather/query";
        String method = "GET";
        String appcode = "b9769dc2da5448d8a3f97cbad013dbfc";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("city", "淮安");
        querys.put("citycode", "citycode");
        querys.put("cityid", "cityid");
        querys.put("ip", "ip");
        querys.put("location", "location");
        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            JSONObject jsonObject = HttpClientUtil.doGet(host, path, method, headers, querys);

            System.out.println(jsonObject.get("status").toString().equals("0"));
            WeatherDTO weatherDTO = JSON.parseObject(jsonObject.get("result").toString(), WeatherDTO.class);
            System.out.println(weatherDTO.getCity());
        } catch (Exception e) {
            System.out.println("++++++++异常");
            e.printStackTrace();
        }
    }
}
