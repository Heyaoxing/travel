package model.enums;

/**
 * @Description:宠物状态
 * @Author: 990016
 * @Date 2018/7/31 17:52
 */
public enum PetStatus {
    TRAVELING(100,"路途中"),
    ARRIVED(200,"到达地点"),
    ERROR(300,"异常"),
    ;

    public Integer code;

    public String value;

    private PetStatus(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public static PetStatus getByCode(Integer code){
        for(PetStatus e : values()){
            if(e.code.equals(code)){
                return e;
            }
        }
        return null;
    }

    public static String getValueByCode(Integer code){
        for(PetStatus e : values()){
            if(e.code.equals(code)){
                return e.value;
            }
        }
        return "";
    }
}
