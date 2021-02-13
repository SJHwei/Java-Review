package com.company.IO流.bufferedreader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * 1. 说明:
 *    (1) bufferedreader是带有缓冲区的字符输入流, 前面的几个io流的类使用的type数组/字符数组实际上相当于一个缓存, 而bufferedreader是自己带有缓存的.
 *
 * 2. 使用的流程:
 *    (1) 创建一个带有缓冲区的字符输入流
 *        1> bufferedreader来的构造方法的参数是一个reader对象, 但是reader是一个抽象类, 抽象类不能实例化, 所以可以使用的它的具体子类.(多态)
 *           不仅可以是字符流, 也可以是字节流, 只是需要通过转换流将该字节流进行包装, 然后再传给bufferedreader.
 *        2> 根据流出现的位置, 流又可以分为包装流(处理流)和节点流. bufferedreader就是一个包装流.
 *           包装流和节点流是相对而言的, 创建包装类对象时传入一个对象参数, 该对象参数就是一个节点流, 而包装类对象就是一个包装流.
 *    (2) 开始读
 *        1> bufferedreader类中有一个readline方法, 该方法用来读取一个文本行. 如果已经到达流末尾, 则返回null.
 *        2> readline方法读取一行, 但是行尾不带换行符.
 *    (3) 关闭
 *        1> 关闭时只需要关闭最外层的包装流就可以了.(这里有一个装饰者模式)
 *        2> 三种设计模式: 第一种是单例模式, 第二种是装饰者模式.
 *
 * 3. 通过键盘输入
 *    (1) 以前通过用户键盘输入的方式是使用scanner类: scanner s = new scanner(system in)
 *        1> java.lang.system类中有三个字段: static printstream err(标准错误输出流); static inputstream in(标准输入流); static printstream out(标准输出流).
 *        2> system.in是一个标准的输入流, 默认接受键盘的输入.
 *        3> 使用next方法接收时以空格为界限.
 *    (2) 现在使用bufferedreader来接收用户键盘输入.
 *
 * */

public class BufferedReader {

    public static void main(String[] args) throws Exception{

        // 1. 创建带有缓冲区的字符输入流
        // filereader构造方法会抛出一个filenotfoundexception异常
        // filereader fr是一个节点流, bufferedreader是一个包装流, 或者处理流.
        java.io.BufferedReader br = new java.io.BufferedReader(new FileReader("..."));

        // 将字节流转换成字符流, 然后再使用包装流.
        java.io.BufferedReader br1 = new java.io.BufferedReader(new InputStreamReader(new FileInputStream("...")));

        // 2. 开始读
        String temp = null;
        while((temp = br.readLine()) != null) { // br.readline方法读取一行, 但是行尾不带换行符.
            System.out.println(temp);
        }

        // 3. 关闭
        // 注意: 关闭时只需要关闭嘴歪的包装流就可以了
        br.close();
    }
}
