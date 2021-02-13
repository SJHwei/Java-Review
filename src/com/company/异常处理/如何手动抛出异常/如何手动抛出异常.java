package com.company.异常处理.如何手动抛出异常;

/**
 * 1. 如何自定义异常:
 *    (1) 自定义异常有两种:
 *        1> 自定义异常, 直接继承exception
 *        2> 运行时异常, 直接继承runtimeexception
 *    (2) 定义异常一般提供两个构造方法:
 *        1> 参数为空的构造方法;
 *        2> 参数为一个字符串类型(string msg), 方法体为super(msg)的构造方法.
 *
 * 2. 如何手动抛出异常:
 *    (1) 使用throw关键字;
 *    (2) 一般throw和throws联用, 而不和try...catch...联用.
 * */
public class 如何手动抛出异常 {
}
