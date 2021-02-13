package com.company.异常处理.如何手动抛出异常;

public class IllegalNameException extends Exception { // 编译时异常

    public IllegalNameException() {}

    public IllegalNameException(String msg) {
        super(msg);
    }
}
