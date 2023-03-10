package com.atguigu.exer2;

public class InvalidValueException extends Exception{
    static final long serialVersionUID = -338765486565648L;

    public InvalidValueException() {
    }

    public InvalidValueException(String message) {
        super(message);
    }
}


