package com.travel;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import common.utils.HttpClientUtil;
import model.dto.PlaceSearchDTO;
import model.dto.RidingDTO;
import org.springframework.util.CollectionUtils;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/27 17:28
 */

public class TestTravel {


    public static void main(String[] args) {
        //double[] location=new double[]{39.909652,116.404177};
        //getRiding();

        List<Integer> nums = Lists.newArrayList(1,1,null,2,3,4,null,5,6,7,8,9,10);
//        System.out.println("sum is:"+nums.stream().filter(num -> num != null).
//        distinct().mapToInt(num -> num * 2).
//        peek(p-> {
//            p=p+100;
//            System.out.println(p);
//        }).skip(2).limit(4).sum());

        nums.stream().filter(p->p!=null).map(p->{return p+10;}).peek(p->{System.out.println(p);}).collect(Collectors.toList());
    }

    static int time = 50;
    static StringBuilder sb = new StringBuilder();
    static HashSet<String> travel = new HashSet<String>(10);

    /**
     * 获取附近地点(随机)
     *
     * @return
     */
    private static double[] getRound(double[] location) {
        String url = MessageFormat.format("http://api.map.baidu.com/place/v2/search?query=景点&location={0},{1}&radius=2000&output=json&ak=jvVeiWBf1Ez7Ink7Xt3cXjexcCUPcWpE", location[0], location[1]);
        JSONObject jsonObject = HttpClientUtil.httpGet(url);
        List<PlaceSearchDTO> dtos = JSON.parseArray(jsonObject.get("results").toString(), PlaceSearchDTO.class);
        if (!CollectionUtils.isEmpty(dtos) && dtos.size() > 0) {
            int index = select(dtos);
            if (index == -1 || time <= 0) {
                System.out.println(sb.toString());
                System.out.println("结束");
                travel.clear();
            } else {
                PlaceSearchDTO dto = dtos.get(index);
                double[] doubles = new double[]{dto.getLocation().getLat(), dto.getLocation().getLng()};
                sb.append(MessageFormat.format("前往:{0},地点为:{1}\n", dto.getName(), dto.getAddress()));
                time--;
                getRound(doubles);
            }
        }
        return null;
    }

    private static int select(List<PlaceSearchDTO> dtos) {
        if (dtos.size() <= 0)
            return -1;
        int index = new Random(System.currentTimeMillis()).nextInt(dtos.size());
        if (travel.add(dtos.get(index).getUid())) {
            return index;
        } else {
            dtos.remove(index);
            return select(dtos);
        }
    }

    private static void getRiding() {
        String url = "http://api.map.baidu.com/direction/v2/riding?origin=22.515435,113.925953&destination=22.506791,113.929234&ak=jvVeiWBf1Ez7Ink7Xt3cXjexcCUPcWpE";
        JSONObject jsonObject = HttpClientUtil.httpGet(url);
        JSONObject result = JSON.parseObject(jsonObject.get("result").toString());
        RidingDTO riding =  JSON.parseObject(result.getJSONArray("routes").get(0).toString(),RidingDTO.class);
    }


}
