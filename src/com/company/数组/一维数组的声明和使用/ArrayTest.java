package com.company.数组.一维数组的声明和使用;

public class ArrayTest {

    //main方法中的string[]数组的设计主要是用来接收命令行参数的
    //以空格为分割符
    public static void main(String[] args) {
        System.out.println("string类型的数组中元素的个数是:" + args.length);

        //遍历
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        //需求说明: 运行该软件的时候必须提供用户名和密码
        //格式: java ArrayTest username password
        //如果用户没有提供足够的参数, 则退出系统

        if(args.length != 2) {
            System.out.println("要想使用该系统, 必须这样输入: java ArrayTest username password");
            return;
        }

        //参数提供正确, 如果用户名是admin, 密码是123则登录成功
        String username = args[0];
        String password = args[1];

        if ("admin".equals(username) && "123".equals(password)) {
            System.out.println("登录成功, 欢迎[" + username +"]回来!");
        }else {
            System.out.println("登录失败, 用户名[" + username + "]不存在或者密码错误!");
        }
    }
}
