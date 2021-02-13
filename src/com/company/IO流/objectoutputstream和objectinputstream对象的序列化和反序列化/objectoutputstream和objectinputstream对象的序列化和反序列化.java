package com.company.IO流.objectoutputstream和objectinputstream对象的序列化和反序列化;

/**
 * 1. 基本说明:
 *    (1) java.io.objectoutputstream: 序列化java对象到硬盘.
 *    (2) java.io.objectinputstream: 将硬盘中的数据反序列化到jvm内存.
 *    (3) objectinputstream和objectoutputstream是专项流.
 *
 * 2. 什么是序列化, 反序列化?
 *
 * 3. objectoutputstream的使用流程:
 *    (1) 创建java对象
 *    (2) 创建输出流(序列化流) (JVM中的java对象状态保存到硬盘中). objectoutputstream类的一个构造方法的参数是outputstream对象.
 *    (3) 写, objectoutputstream类中有一个方法: writeobject, 将制定的对象写入objectoutputstream.
 *    (4) 刷新
 *    (5) 关闭
 *
 * 4. 重点:
 *    (1) 使用objectoutputstream序列化的对象如果没有实现serializable接口, 则不能对该对象进行序列化. 该接口表示可序列化的.
 *        该接口没有任何方法, 是一个标识接口. 像这样的接口还有: java.io.cloneable(可可隆的).
 *    (2) 标识接口的作用: jvm如果看到该对象实现了某个标识接口, 会对它特殊待遇.
 *
 * 5. objectinputstream的使用流程:
 *    (1) 创建反序列化流
 *    (2) 反序列化
 *    (3) 关闭
 *
 * */
public class objectoutputstream和objectinputstream对象的序列化和反序列化 {

}
