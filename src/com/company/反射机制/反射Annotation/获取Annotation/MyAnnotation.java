package com.company.反射机制.反射Annotation.获取Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ShiWei
 * @date 2021/2/26 - 15:10
 */
//只允许该注解可以标注类和方法
@Target({ElementType.TYPE, ElementType.METHOD})
//希望这个注解可以被反射
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    /*
    * value属性
    * */
    String value() default "北京大兴区";
}
