package com.example.demo.myh2.entity.common;

import java.util.List;

public class R<T> {

    private long code;
    private String msg;
    private T result;

    public R(long code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public R(long code, String msg, T result) {
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public long getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getResult() {
        return result;
    }

    public static <T> R<T> failed(IErrorCode e) {
        return new R<>(e.getCode(), e.getMsg());
    }

    public static <T> R<T> failed(String m) {
        return new R<>(ErrorCode.FAILED.getCode(), m);
    }

    public static <T> R<T> restResult(T t, IErrorCode e) {
        return new R<T>(e.getCode(), e.getMsg(), t);
    }
}
