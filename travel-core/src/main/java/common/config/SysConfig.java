package common.config;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/30 16:26
 */
public class SysConfig {

    /**
     * 百度地点检索api
     */
    public static  String BAIDUMAPPLACESEARCHAPI="http://api.map.baidu.com/place/v2/search?query={0}&location={1},{2}&radius=10000&output=json&ak=jvVeiWBf1Ez7Ink7Xt3cXjexcCUPcWpE";

    /**
     * 百度路径规划api
     */
    public static  String BAIDURIDINGAPI="http://api.map.baidu.com/direction/v2/riding?origin={0},{1}&destination={2},{3}&ak=jvVeiWBf1Ez7Ink7Xt3cXjexcCUPcWpE";

    /**
     * 天气预报接口
     */
    public static String WEATHERAPI="https://jisutqybmf.market.alicloudapi.com/weather/query";

    /**
     * 最小停留时间(分钟)
     */
    public static Integer minStayMinutes=5;
    /**
     * 最大停留时间(分钟)
     */
    public static Integer maxStayMinutes=30;

    /**
     * 多少只老鼠可以抓到猫
     */
    public static Integer needMouseNum=58;

    /**
     * 猫每次最多能抓多少只老鼠
     */
    public static Integer maxCapture=8;
}
