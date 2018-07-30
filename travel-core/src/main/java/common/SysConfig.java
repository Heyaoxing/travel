package common;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/30 16:26
 */
public class SysConfig {

    /**
     * 百度地点检索api
     */
    public static  String BAIDUMAPPLACESEARCHAPI="http://api.map.baidu.com/place/v2/search?query={0}&location={1},{2}&radius=5000&output=json&ak=jvVeiWBf1Ez7Ink7Xt3cXjexcCUPcWpE";

    /**
     * 百度路径规划api
     */
    public static  String BAIDURIDING="http://api.map.baidu.com/direction/v2/riding?origin={0},{1}&destination={2},{3}&ak=jvVeiWBf1Ez7Ink7Xt3cXjexcCUPcWpE";
}
