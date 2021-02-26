package com.company.反射机制.反射父类和父接口;

/**
 * @author ShiWei
 * @date 2021/2/26 - 14:58
 *
 * 重点: 给一个类, 怎么获取这个类的父类, 已经实现了哪些接口?
 *     (1) 获取该类的父类使用Class类的一个成员方法: getSuperClass();
 *     (2) 获取该类实现的接口使用Class类的一个成员方法: getInterfaces().
 *
 * 注意：
 *     (1) 一个类只有一个父类;
 *     (2) 一个类可以实现多个接口.
 */
public class ReflectTest13 {
    public static void main(String[] args) throws Exception {
        //String举例
        Class stringClass = Class.forName("java.lang.String");
        //获取String的父类
        Class superclass = stringClass.getSuperclass();
        System.out.println(superclass.getName());
        //获取String类实现的所有接口(一个类可以实现多个接口)
        Class[] interfaces = stringClass.getInterfaces();
        for (Class in : interfaces) {
            System.out.println(in.getName());
        }
    }
}
