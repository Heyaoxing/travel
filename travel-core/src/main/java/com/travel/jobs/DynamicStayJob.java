package com.travel.jobs;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

/**
 * @Description:生成停留job
 * @Author: 990016
 * @Date 2018/7/31 16:10
 */
public class DynamicStayJob implements SimpleJob {


    /**
     * step 1: 停留结束,检查生存状态
     * step 2: 检查天气状况，累计下雨时间(如果是猫则增加在途时间)
     * step 3: 检查是否达到产生下一代的条件
     * step 4: 检查是否继续前行
     * step 5: 检查是否有指定的目的地
     * step 6: 开始规划路线
     * step 7: 确定路线并创建旅行job
     * @param shardingContext
     */
    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("asd");
    }
}