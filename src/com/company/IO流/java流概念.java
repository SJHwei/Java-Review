package com.company.IO流;

/**
 * 1. 流的定义:
 *    就是传输过程, 硬盘和内存之间传输, 内存和内存之间传输.
 *
 * 2. 流的分类:
 *    (1) 流根据方向可以分为输入流和输出流.
 *        注意: 输入和输出是相对于内存而言的. 从内存出来就是输出, 到内存中就是输入.
 *        输入流又叫做InputStream, 输出流又叫做OutputStream. 输入还叫做读(read), 输出还叫做写(write).
 *    (2) 流根据读取数据的方式可以分为字节流和字符流.
 *        字节流是按照字节的方式读取, 字符流是按照字符方式读取, 一次读取2个字节. java语言中一个字符占2个字节.
 *        java中所有的字节流都以Stream结尾. 所有的字符流都含有Reader或Writer.
 *
 * 3. 什么情况下使用字节流/字符流?
 *    (1) 字节流适合读取: 视频, 声音, 图片等二进制文件;
 *    (2) 字符流适合读取: 纯文本文件.
 *
 * 4. 需要掌握的16个流(java.io.*):
 *    (1) fileinputstream
 *    (2) fileoutputstream
 *    (3) filereader
 *    (4) filewriter
 *    上面4个专门读取文件.
 *    (5) bufferedreader
 *    (6) bufferedwriter
 *    (7) bufferedinputstream
 *    (8) bufferedoutputstream
 *    上面4个是带有缓冲区的.
 *    (9) datainputstream
 *    (10) dataoutputstream
 *    上面2个专门读取数据.
 *    (11) objectinputstream
 *    (12) objectoutputstream
 *    上面2个专门读取java对象.
 *    (13) inputstreamreader
 *    (14) outputstreamwriter
 *    上面2个是转换流(将字节流转换成字符流).
 *    (15) printwriter
 *    (16) printstream //标准输出流(默认输出到控制台)
 *    上面2个是打印流.
 *
 * */
public class java流概念 {
}
