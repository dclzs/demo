package com.example.demo.myh2.entity.common;

public class MyException extends RuntimeException {

    private IErrorCode errorCode;

    public IErrorCode getErrorCode() {
        return errorCode;
    }

    public MyException() {}

    public MyException(IErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(Throwable cause) {
        super(cause);
    }
}
