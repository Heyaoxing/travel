package model.enums;

/**
 * @Description: poi 标签
 * @Author: 990016
 * @Date 2018/7/31 17:27
 */
public enum POITag {
    POI_01(1,"美食"),
    POI_02(2,"酒店"),
    POI_03(3,"购物"),
    POI_04(4,"生活服务"),
    POI_05(5,"丽人"),
    POI_06(6,"旅游景点"),
    POI_07(7,"休闲娱乐"),
    POI_08(8,"运动健身"),
    POI_09(9,"教育培训"),
    POI_10(10,"文化传媒"),
    POI_11(11,"医疗"),
    POI_12(12,"汽车服务"),
    POI_13(13,"交通设施"),
    POI_14(14,"金融"),
    POI_15(15,"房地产"),
    POI_16(16,"公司企业"),
    POI_17(17,"政府机构"),
    POI_18(18,"出入口"),
    POI_19(19,"自然地物")
    ;

    public Integer code;

    public String value;

    private POITag(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public static POITag getByCode(Integer code){
        for(POITag e : values()){
            if(e.code.equals(code)){
                return e;
            }
        }
        return null;
    }

    public static String getValueByCode(Integer code){
        for(POITag e : values()){
            if(e.code.equals(code)){
                return e.value;
            }
        }
        return "";
    }
}
