package com.mayi.xiaomi.serverhome.common;

public class CommonResVo {
    private Integer code;
    private String message;
    private Object data;

    public void fail(){
        this.code = 100;
        this.message = "获取数据失败";
    }

    public void success(){
        this.code = 200;
        this.message = "获取数据成功";
    }

    public void data(Object data){
        this.code = 200;
        this.message = "获取数据成功";
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
