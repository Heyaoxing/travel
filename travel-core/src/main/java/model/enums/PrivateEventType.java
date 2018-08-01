package model.enums;

/**
 * @Description: 私人事件类型
 * @Author: 990016
 * @Date 2018/8/1 15:50
 */
public enum PrivateEventType {
    event_100(100,"被捕"),
    event_200(200,"抓到宠物"),
    ;

    public Integer code;

    public String value;

    private PrivateEventType(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public static PrivateEventType getByCode(Integer code){
        for(PrivateEventType e : values()){
            if(e.code.equals(code)){
                return e;
            }
        }
        return null;
    }

    public static String getValueByCode(Integer code){
        for(PrivateEventType e : values()){
            if(e.code.equals(code)){
                return e.value;
            }
        }
        return "";
    }
}
