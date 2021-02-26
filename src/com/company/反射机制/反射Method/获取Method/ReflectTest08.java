package com.company.反射机制.反射Method.获取Method;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author ShiWei
 * @date 2021/2/19 - 13:45
 *
 * 作为了解内容：
 *     反射Method
 */
public class ReflectTest08 {

    public static void main(String[] args) throws Exception {
        //获取类
        Class userServiceClass = Class.forName("com.company.反射机制.反射Method.获取Method.UserService");
        //获取所有的Method(包括私有的!)
        Method[] methods = userServiceClass.getDeclaredMethods();
        System.out.println(methods.length);
        //遍历Methods
        for (Method method : methods) {
            //获取修饰符列表
            System.out.println(Modifier.toString(method.getModifiers()));
            //获取方法的返回值类型
            System.out.println(method.getReturnType().getSimpleName());
            //获取方法名
            System.out.println(method.getName());
            //方法的参数列表(一个方法的参数可能会有多个)
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                System.out.println(parameterType.getSimpleName());
            }
        }
    }
}
