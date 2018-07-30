package common;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/30 20:19
 */

@Getter
@Setter
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 6272948440384903418L;
    public BaseResponse() {
        this.setCode("270100000");
        this.setChnDesc("成功");
    }

    public BaseResponse(T data) {
        this.setCode("270100000");
        this.setChnDesc("成功");
        this.setData(data);
    }

    private String code;

    private String engDesc;

    private String chnDesc;

    private String detail;

    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEngDesc() {
        return engDesc;
    }

    public void setEngDesc(String engDesc) {
        this.engDesc = engDesc;
    }

    public String getChnDesc() {
        return chnDesc;
    }

    public void setChnDesc(String chnDesc) {
        this.chnDesc = chnDesc;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
