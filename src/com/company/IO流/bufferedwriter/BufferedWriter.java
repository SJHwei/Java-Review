package com.company.IO流.bufferedwriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * 1. bufferedwirter是带有缓冲区的字符输出流, 基本步骤和bufferedreader一样.
 * 2. 重点: 可以通过newline()方法写入一个行分隔符.
 *
 * */
public class BufferedWriter {

    public static void main(String[] args) throws Exception{

        // 1. 创建带有缓冲区的字符输出流
        java.io.BufferedWriter bw = new java.io.BufferedWriter(new OutputStreamWriter(new FileOutputStream("...")));

        // 2. 开始写
        bw.write("...");

        // 写入一个行分隔符
        bw.newLine();

        bw.write("...");

        // 刷新
        bw.flush();

        // 关闭
        bw.close();
    }
}
