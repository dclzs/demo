package com.example.demo.myh2.entity.common;


public enum ErrorCode implements IErrorCode {
    FAILED(1000, "测试错误编码");

    private long code;
    private String msg;

    ErrorCode(final long code, final String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
