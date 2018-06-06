package com.mayi.xiaomi.serveruser.common;

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

}
