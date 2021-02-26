package com.company.反射机制.反射Constructor.反编译Constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * @author ShiWei
 * @date 2021/2/26 - 10:53
 *
 * 反编译一个类的Constructor构造方法
 */
public class ReflectTest11 {
    public static void main(String[] args) throws Exception {
        StringBuilder s = new StringBuilder();
        Class vipClass = Class.forName("com.company.反射机制.反射Constructor.反编译Constructor.Vip");
        s.append(Modifier.toString(vipClass.getModifiers()));
        s.append(" class ");
        s.append(vipClass.getSimpleName());
        s.append(" {\n");

        //拼接构造方法
        Constructor[] constructors = vipClass.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            s.append("\t");
            s.append(Modifier.toString(constructor.getModifiers()));
            s.append(" ");
            s.append(vipClass.getSimpleName());
            s.append("(");
            //拼接参数
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                s.append(parameterType.getSimpleName());
                s.append(",");
            }

            if(parameterTypes.length > 0) {
                //删除指定下标位置上的字符
                //s.deleteCharAt(s.length() - 1);
                s.substring(0, s.length());
            }
            s.append("){}\n");
        }

        s.append("}");
        System.out.println(s);
    }
}
