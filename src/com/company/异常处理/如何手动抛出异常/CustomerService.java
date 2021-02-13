package com.company.异常处理.如何手动抛出异常;

// 顾客相关的业务
public class CustomerService {

    // 对外提供一个注册的方法
    public void register(String name) throws IllegalNameException {

        // 完成注册
        if(name.length() < 6) {

            // 手动抛出异常
            throw new IllegalNameException("...");
        }

        //如果代码能执行到此处, 证明用户名是合法的.
        System.out.println("...");
    }
}
