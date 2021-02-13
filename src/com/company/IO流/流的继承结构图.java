package com.company.IO流;

/**
 * 1. java语言中流分为: 四大家族(inputstream, outputstream, reader, writer)
 *
 * 2. inputstream和outputstream的继承结构图:
 *    inputstream和outputstream都实现了closeable接口, 该接口中有一个close()方法. 除此之外, outputstream还实现了一个flushable接口, 该接口中有一个flush方法.
 *    inputstream是字节输入流, 它的直接子类有: fileinputstream, filterinputstream(该类的直接子类有bufferedinputstream, datainputstream), objectinputstream.
 *    outputstream是字节输出流, 它的直接子类有: fileoutputstream, filteroutputstream(该类的直接子类有bufferedoutputstream, dataoutputstream, printstream), objectoutputstream.
 *    注意: flush是刷新. 相当于用一个小桶往大通中倒水, 当最后一桶倒完后, 把最后小桶中的水根也倒进大桶中(倒干净). 也就是把数据完全输出.
 *    重点: inputstream和outputstream都是抽象类.
 *
 * 3. reader和writer的继承结构图:
 *    reader和writer都实现了closeable接口, 该接口中有一个close()方法, 除此之外, writer还实现了flushable接口, 该接口中有一个flush()方法.
 *    reader是字符输入流, 它的直接子类有inputstreamreader(该类的直接子类是filereader), bufferedreader.
 *    writer是字符输出流, 它的直接子类有outputstreamwirter(该类的直接子类是filewriter), bufferedwriter, printwriter.
 *
 * */
public class 流的继承结构图 {
}
