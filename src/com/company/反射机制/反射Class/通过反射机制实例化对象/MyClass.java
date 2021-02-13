package com.company.反射机制.反射Class.通过反射机制实例化对象;

/**
 * @author ShiWei
 * @date 2021/2/3 - 9:00
 */
public class MyClass {

    //静态代码块在类加载时执行, 并且只执行一次.
    static {
        System.out.println("MyClass类的静态代码块执行了!");
    }
}
