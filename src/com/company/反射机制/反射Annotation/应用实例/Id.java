package com.company.反射机制.反射Annotation.应用实例;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ShiWei
 * @date 2021/2/26 - 15:46
 *
 * 需求:
 *     假设有这样一个注解, 叫做: @Id;
 *     这个注解只能出现在类上面, 当这个类上有这个注解的时候, 要求这个类中必须有一个int类型的id属性,
 *     如果没有这个属性就报异常, 如果有这个属性则正常执行!
 */
//表示这个注解只能出现在类上面
@Target(ElementType.TYPE)
//该注解可以被反射机制读取到
@Retention(RetentionPolicy.RUNTIME)
public @interface Id {

}

//这个注解@Id用来标注类, 被标注的类中必须有一个类型的id属性, 没有就报异常.
