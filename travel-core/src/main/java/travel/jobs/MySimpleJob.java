package travel.jobs;

import com.cxytiandi.elasticjob.annotation.ElasticJobConf;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/27 16:28
 */
@ElasticJobConf (name = "MySimpleJob",cron = "0/2 * * * * ?" ,shardingItemParameters = "0=0,1=1", description = "简单任务")
public class MySimpleJob implements SimpleJob {
    @Override
    public void execute(ShardingContext context) {
        System.out.println("hello");
    }
}
