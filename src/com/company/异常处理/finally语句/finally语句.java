package com.company.异常处理.finally语句;

/**
 * 1. 使用方式: finally语句块可以直接和try语句块联用. 有两种形式: try...finally... ; try...catch...finally...
 *
 * 2. 作用: 在finally语句块中的代码是一定会执行的.
 *         只有一种情况finally语句不执行: 只要在执行finally语句块之前退出了JVM, 则finally语句块不会执行.
 *         System.exit(0) : 退出JVM.
 *
 * 3. 应用: finally语句块是一定会执行的, 所以通常在程序中为了保证某资源一定会释放, 一般在finally语句块中释放资源.
 *
 * 4. 注意: final, finalize和finally三者之间没有关系.
 * */
public class finally语句 {

}
