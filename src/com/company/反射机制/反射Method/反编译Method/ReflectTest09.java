package com.company.反射机制.反射Method.反编译Method;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author ShiWei
 * @date 2021/2/19 - 16:46
 *
 * 了解一下，不需要掌握
 */
public class ReflectTest09 {
    public static void main(String[] args) throws Exception {
        StringBuilder s = new StringBuilder();
        Class userServiceClass = Class.forName("com.company.反射机制.反射Method.获取Method.UserService");
        s.append(Modifier.toString(userServiceClass.getModifiers()) + "class" + userServiceClass.getSimpleName() + "{");
        Method[] methods = userServiceClass.getDeclaredMethods();
        for (Method method : methods) {
            s.append("\t");
            s.append(Modifier.toString(method.getModifiers()));
            s.append(" ");
            s.append(method.getName());
            s.append("(");
            //参数列表
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                s.append(parameterType.getSimpleName());
                s.append(",");
            }
            //删除指定下标位置上的字符
            //s.deleteCharAt(s.length() - 1);
            s.substring(0, s.length());
            s.append("){}\n");
        }

        s.append("}");
        System.out.println(s);
    }
}
