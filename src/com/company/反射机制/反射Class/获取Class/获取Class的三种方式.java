package com.company.反射机制.反射Class.获取Class;

/**
 * 前言: 要操作一个类的字节码, 需要先获取这个类的字节码, 获取java.lang.Class实例有三种方式.
 *
 * 1. 第一种方式:
 *    (1) 使用Class类中的一个静态方法: forName().
 *    (2) Class.forName("完整类名带包名"):
 *        1> 该方法是一个静态方法;
 *        2> 该方法的参数是一个字符串;
 *        3> 完整类名必须带有包名, java.lang包也不能省略;
 *        4> 该方法抛出ClassNotFoundException异常, 所以需要处理异常.
 *
 * 2. 第二种方式:
 *    (1) java中任何一个对象都有一个方法: getClass().
 *    (2) 字节码文件装载到JVM(方法区)中的时候, 只装载一份.
 *
 * 3. 第三种方式:
 *    (1) java语言中任何一种类型, 包括基本数据类型, 它都有.class属性.
 *    (2) Class c = 任何类型.class;
 *
 * 4. 总结:
 *    这部分重点就是获取Class的三种方式, 第一种是静态方法(Class类), 第二种是成员方法(任何对象), 第三种是属性(任何类型).
 */
public class 获取Class的三种方式 {

    public static void main(String[] args) throws ClassNotFoundException {

        //获得Class的第一种方式: 使用Class类中的一个静态方法: forName("完整类名带包名")

        //c1代表String.class文件, 或者说c1代表String类型
        Class c1 = Class.forName("java.lang.String");
        //c2代表Integer类型
        Class c2 = Class.forName("java.lang.Integer");
        //c3代表Date类型
        Class c3 = Class.forName("java.util.Date");
        //c4代表System类型
        Class c4 = Class.forName("java.lang.System");


        //获得Class的第二种方式: 使用一个成员方法: getClass(), 该方法所有对象都具有
        String s = "abc";
        Class x = s.getClass(); //x代表String.class字节码文件, x代表String类型
        System.out.println(c1 == x); //true(==判断的是对象的内存地址)
        //c1 == x为true的原因: 字节码文件装载到JVM(方法区)的时候, 只装载一份.


        //获得Class的第三种方式: 使用一个属性: class, 该属性在java中的任何一种类型中都有, 包括基本数据类型
        Class<String> z = String.class;

    }
}
