package model.enums;

/**
 * @Description: 宠物类型
 * @Author: 990016
 * @Date 2018/7/31 17:00
 */
public enum PetType {
    CAT((byte)1,"猫"),
    MOUSE((byte)2,"老鼠"),
    ;

    public Byte code;

    public String value;

    private PetType(Byte code, String value) {
        this.code = code;
        this.value = value;
    }

    public static PetType getByCode(Byte code){
        for(PetType e : values()){
            if(e.code.equals(code)){
                return e;
            }
        }
        return null;
    }

    public static String getValueByCode(Byte code){
        for(PetType e : values()){
            if(e.code.equals(code)){
                return e.value;
            }
        }
        return "";
    }
}
