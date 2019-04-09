package com.easy.bean;

/**
 * Created by j on 2019/4/9.
 */
public class Reply {
    private String msg;
    private String code;
    private Object data;

    public Reply() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Reply success(){
        Reply reply = new Reply();
        reply.setMsg("访问成功");
        reply.setCode("200");
        return reply;
    }

    public static Reply success(Object data){
        Reply reply = success();
        reply.setData(data);
        return reply;
    }

    public static Reply error(){
        Reply reply = success();
        reply.setMsg("访问失败");
        reply.setCode("500");
        return reply;
    }

    public static Reply error(String msg){
        Reply reply = success();
        reply.setMsg(msg);
        reply.setCode("500");
        return reply;
    }
}
