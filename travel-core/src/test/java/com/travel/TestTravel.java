package com.travel;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import model.dto.PlaceSearchDto;
import org.springframework.util.CollectionUtils;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/27 17:28
 */
public class TestTravel {


    public static void  main(String[] args){
        double[] location=new double[]{39.909652,116.404177};
        double[] Destination=getRound(location);
    }

    static int time=50;
    static StringBuilder sb=new StringBuilder();
    static HashSet<String> travel=new HashSet<String>(10);
    /**
     * 获取附近地点(随机)
     * @return
     */
    private static double[] getRound(double[] location){
        String url= MessageFormat.format("http://api.map.baidu.com/place/v2/search?query=景点&location={0},{1}&radius=2000&output=json&ak=jvVeiWBf1Ez7Ink7Xt3cXjexcCUPcWpE",location[0],location[1]);
        JSONObject jsonObject= util.HttpClientUtils.httpGet(url);
        List<PlaceSearchDto> dtos= JSON.parseArray(jsonObject.get("results").toString(),PlaceSearchDto.class);
        if(!CollectionUtils.isEmpty(dtos)&&dtos.size()>0){
            int index=select(dtos);
            if(index==-1||time<=0){
                System.out.println(sb.toString());
                System.out.println("结束");
                travel.clear();
            }else{
                PlaceSearchDto dto= dtos.get(index);
                double[] doubles=new double[]{dto.getLocation().getLat(),dto.getLocation().getLng()};
                sb.append(MessageFormat.format("前往:{0},地点为:{1}\n",dto.getName(),dto.getAddress()));
                time--;
                getRound(doubles);
            }
        }
        return null;
    }

    private static int select(List<PlaceSearchDto> dtos){
        if(dtos.size()<=0)
            return -1;
        int index=new Random(System.currentTimeMillis()).nextInt(dtos.size());
        if(travel.add(dtos.get(index).getUid())){
            return index;
        }else{
            dtos.remove(index);
            return select(dtos);
        }
    }
//    private static double[] getDestination(double[] location){
//        String url= MessageFormat.format("http://api.map.baidu.com/place/v2/search?query=景点&location={0},{1}&radius=2000&output=json&ak=jvVeiWBf1Ez7Ink7Xt3cXjexcCUPcWpE",location[0],location[1]);
//
//    }
}
