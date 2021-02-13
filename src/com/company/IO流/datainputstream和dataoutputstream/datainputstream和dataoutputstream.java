package com.company.IO流.datainputstream和dataoutputstream;

/**
 * 1. 说明(重点): 这两个是是专项的, 可以带着类型读取和写入, 而其他的只能是字符串或字节.
 *
 * 2. dataoutputstream
 *    (1) 基本说明: dataoutputstream可以将内存中的 int i = 10 写入到硬盘文件中, 写进去的不是字符串, 而是二进制数据, 带类型.
 *    (2) 使用流程:
 *        1> 创建数据字节输出流
 *        2> 准备数据
 *        3> 开始写
 *        4> 刷新
 *        5> 关闭
 *    (3) 注意: dataoutputstream的构造函数的参数是一个outputstream类的对象, 但是outputstream(字节流)是一个抽象类, 抽象类不能实例化, 所以参数只能是该抽象类的子类的对象.(多态)
 *             只能是字节流, 不能是字符流, 因为没有从字符流到字节流的转换流.
 *
 * 3. datainputstream
 *    (1) 流程: 创建输入流; 读; 关闭.
 *    (2) 注意: 使用datainputstream读取二进制文件时, 要提前知道文件中的数据的格式, 顺序. 读的顺序必须和写入的顺序相同.
 *             使用dataoutputstream往一个文件中写入数据, 该文件就是二进制文件.
 * */

public class datainputstream和dataoutputstream {
}
