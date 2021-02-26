package com.company.反射机制.反射Annotation.通过反射机制获取注解对象属性的值;

import java.lang.reflect.Method;

/**
 * @author ShiWei
 * @date 2021/2/26 - 15:29
 */
public class MyAnnotationTest {

    @MyAnnotation(username = "admin", password = "123")
    public void doSome() {

    }

    public static void main(String[] args) throws Exception {
        //获取MyAnnotationTest的doSome()方法上面的注解信息. 注意: 注解在类的方法上.
        //第一步: 获取类
        //第二步: 获取该类的doSome()方法
        //第三步: 获取doSome()方法上的注解
        Class c = Class.forName("com.company.反射机制.反射Annotation.通过反射机制获取注解对象属性的值.MyAnnotationTest");
        //获取doSome()方法
        Method doSomeMethod = c.getDeclaredMethod("doSome");
        //判断该方法上是否存在这个注解
        if(doSomeMethod.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation myAnnotation = doSomeMethod.getAnnotation(MyAnnotation.class);
            System.out.println(myAnnotation.username());
            System.out.println(myAnnotation.password());
        }
    }
}
