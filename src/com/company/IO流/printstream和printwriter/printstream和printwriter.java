package com.company.IO流.printstream和printwriter;

/**
 * 1. 基本说明: java.io.printstream(标准的输出流, 默认打印到控制台, 以字节方式); java.ioprintwriter(以字符方式).
 *
 * 2. java.io.printstream
 *    (1) printstream ps = system.out, 默认输出到控制台.
 *    (2) printstream中有两个输出方法(println, print): 输出到控制台.
 *    (3) system中有一个setout(printstream out)方法: 可以改变输出方向, 重新分配标准输出流.
 *       对于printstream类, 它有一个构造方法, 参数是outputstream类的对象, outputstream是抽象类, 无法实例化, 所以参数为他的子类.(多态)
 *       通常用这种方式记录日志.
 *
 *
 * */
public class printstream和printwriter {
}
