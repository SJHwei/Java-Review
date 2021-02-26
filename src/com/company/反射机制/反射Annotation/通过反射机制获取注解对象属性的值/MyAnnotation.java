package com.company.反射机制.反射Annotation.通过反射机制获取注解对象属性的值;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ShiWei
 * @date 2021/2/26 - 15:27
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    String username();
    String password();
}
