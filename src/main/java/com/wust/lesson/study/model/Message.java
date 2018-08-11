package com.wust.lesson.study.model;

import java.util.HashMap;
import java.util.Map;

public class Message {
    private int code;
    private String describe;
    private Map<String,Object> extend = new HashMap<>();

    public static Message success(){
        Message result = new Message();
        result.setCode(200);
        result.setDescribe("处理成功!");
        return result;
    }

    public static Message fail(){
        Message result = new Message();
        result.setCode(500);
        result.setDescribe("处理失败!");
        return result;
    }

    public Message add(String key,Object value){
        this.extend.put(key,value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }
}
