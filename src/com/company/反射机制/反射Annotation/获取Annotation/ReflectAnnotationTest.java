package com.company.反射机制.反射Annotation.获取Annotation;

/**
 * @author ShiWei
 * @date 2021/2/26 - 15:17
 */
public class ReflectAnnotationTest {
    public static void main(String[] args) throws Exception {
        //注意: 注解在类上
        //第一步: 获取类
        //第二步: 获取该类上的注解

        //获取这个类
        Class c = Class.forName("com.company.反射机制.反射Annotation.获取Annotation.MyAnnotationTest");
        //判断类上是否有@MyAnnotation
        System.out.println(c.isAnnotationPresent(MyAnnotation.class));//true
        if(c.isAnnotationPresent(MyAnnotation.class)) {
            //获取该注解对象
            MyAnnotation myAnnotation = (MyAnnotation)c.getAnnotation(MyAnnotation.class);
            System.out.println("类上面的注解对象" + myAnnotation);
            //获取注解对象的属性怎么办? 和调用接口没区别
            String value = myAnnotation.value();
            System.out.println(value);
        }

        //判断String类上是否存在这个注解
        Class stringClass = Class.forName("java.lang.String");
        System.out.println(stringClass.isAnnotationPresent(MyAnnotation.class));
    }
}
