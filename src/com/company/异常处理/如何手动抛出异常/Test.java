package com.company.异常处理.如何手动抛出异常;
/*
* 模拟注册
* */
public class Test {

    public static void main(String[] args) {

        // 假如用户提供的用户名如下
        String username = "...";

        // 注册
        CustomerService cs = new CustomerService();

        try{
            cs.register(username);
        }catch(IllegalNameException e) {
            System.out.println(e.getMessage());
        }
    }
}
