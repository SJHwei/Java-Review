package com.company.反射机制.反射Method.通过反射机制调用方法;

import com.company.反射机制.反射Method.获取Method.UserService;

import java.lang.reflect.Method;

/**
 * @author ShiWei
 * @date 2021/2/19 - 17:05
 *
 * 重点: 必须掌握, 通过反射机制怎么调用一个对象的方法? (五颗星*****)
 *
 * 反射机制, 让代码具有通用性, 可变化的内容都是写到配置文件当中, 将来修改配置文件之后, 创建的对象不一样了,
 * 调用的方法也不同了, 但是java代码不需要做任何改动, 这就是反射机制的魅力.
 */
public class ReflectTest10 {
    public static void main (String[] args) throws Exception {
        //不使用反射机制, 怎么调用方法
        //创建对象
        UserService userService = new UserService();
        //调用方法
        /*
        * 要素分析:
        *     要素一: 对象userService
        *     要素二: login方法名
        *     要素三: 实参列表
        *     要素四: 返回值
        * */
        boolean loginSuccess = userService.login("admin", "123");
        System.out.println(loginSuccess);
        System.out.println(loginSuccess ? "登录成功" : "登录失败");

        //使用反射机制来调用一个对象的方法该怎么做?
        //java中怎么区分一个方法, 依靠方法名和参数列表
        Class userServiceClass = Class.forName("com.company.反射机制.反射Method.获取Method.UserService");
        //创建对象
        Object obj = userServiceClass.newInstance();
        //获取Method
        Method loginMethod01 = userServiceClass.getDeclaredMethod("login", String.class, String.class);
        Method loginMethod02 = userServiceClass.getDeclaredMethod("login", int.class);
        //调用方法
        //调用方法有几个要素? 也需要四个要素
        //invoke()是反射机制中最重要的一个方法, 必须记住.
        /*
        * 四要素:
        *     loginMethod 方法
        *     obj 对象
        *     "admin", "123" 实参
        *     retValue 返回值
        * */
        Object retValue = loginMethod01.invoke(obj, "admin", "123");
        System.out.println(retValue);
    }
}
