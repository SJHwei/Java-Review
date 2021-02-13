package com.company.注解.JDK的内置注解;

/**
 * 1. JDK内置了三个注解:
 *    (1) Override : 表示一个方法声明打算重写超类中的另一个方法声明.
 *    (2) Deprecated : 用@Deprecated注释的程序元素, 不鼓励程序员使用这样的元素, 通常是因为它很危险或存在更好的选择.
 *    (3) SuppressWarnings : 指示应该在注释元素(以及包含在该注释元素中的所有程序元素)中取消显示指定的编译器警告.
 *    注意: 这三个注释类型在java.lang包下, 掌握前两个即可.
 *
 * 2. Override注解:
 *    (1) 说明: 标识性注解, 给编译器作参考的.
 *    (2) 作用: 编译器看到方法山有这个注解的时候, 编译器会自动检查该方法是否重写了父类的方法.
 *              如果没有重写, 报错.
 *    (3) 注意: 这个注解只是在编译阶段起作用, 和运行期无关!
 *    (4) 源代码:
 *        | @Target(value=METHOD)
 *        | @Retention(value=SOURCE)
 *        | public @interface Override {}
 *
 * 3. Deprecated注解:
 *    (1) 说明: 表示这个类已过时.
 *    (2) 作用: 这个注解标注的元素已过时, 主要是向其他程序员传达一个信息, 告知已过时, 有更好的解决方案存在.
 *    (3) 源代码:
 *        | @Retention(value=RUNTIME)
 *        | @Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
 *        | public @interface Deprecated {}
 *
 * 4. 元注解:
 *    (1) 元注解的概念: 用来标注"注解类型"的注解称为元注解.
 *    (2) 常见的元注解: Target; Retention.
 *
 * 5. Target元注解:
 *    (1) 说明: 这是一个元注解, 用来标注"注解类型"的注解;
 *    (2) 作用: 用来标注"被标注的注解"可以出现在哪些位置上;
 *    (3) 源代码:
 *        | @Retention(value=RUNTIME)
 *        | @Target(value=ANNOTATION_TYPE)
 *        | public @interface Target {
 *        |     ElementType[] value(); //ElementType是枚举类型
 *        | }
 *        |
 *        | public enum ElementType {
 *        |     TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, ...
 *        | }
 *    (4) 实例:
 *        1> @Target(ElementType.METHOD) : 表示"被标注的注解"只能出现在方法上.
 *        2> @Target(value={..., ..., ...})
 *
 * 6. Retention元注解:
 *    (1) 说明: 这是一个元注解, 用来标注"注解类型"的注解;
 *    (2) 作用: 这个注解用来标注"被标注的注解"最终保存在哪里;
 *    (3) 解释:
 *        1> @Retention(RetentionPolicy.SOURCE) : 表示该注解只被保留在java源文件中.
 *        2> @Retention(RetentionPolicy.CLASS) : 表示该注解被保存在class文件中.
 *        3> #Retention(RetentionPolicy.RUNTIME) : 表示该注解被保存在class文件中, 并且可以被反射机制所读取.
 *    (4) 源代码:
 *        | public @interface Retention {
 *        |     RetentionPolicy value(); //RetentionPolicy是枚举类型
 *        | }
 *        |
 *        | public enum RetentionPolicy {
 *        |     SOURCE, CLASS, RUNTIME
 *        | }
 *
 *
 */
public class JDK的内置注解 {
}
