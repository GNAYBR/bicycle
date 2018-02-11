package com.aowin.Exception;

public class MyException extends Exception {
    //异常信息
    public String message;

    public MyException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
