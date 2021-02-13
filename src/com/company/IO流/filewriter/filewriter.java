package com.company.IO流.filewriter;

import java.io.FileWriter;

/**
 * 1. 说明: java.io.filewriter是文件字符输出流. 它的直接父类是java.io.outputwriter(转换流), 它的直接父类是java.io.writer.
 *
 * 2. filewriter的流程和fileoutputstream的流程一样. 不同的是: filewriter可以直接将字符串写入而不用数组(当然也可以用字符数组), fileoutputstream使用字节数组.
 *
 * 3. filewriter的异常和fileoutputstream的异常一样.
 * */
public class filewriter {

    public static void main(String[] args) throws Exception{

        // 1. 创建我呢间字符输出流
        // FileWriter fw = new FileWriter("///"); // 覆盖
        FileWriter fw = new FileWriter("///", true); // 追加

        // 2. 开始写
        fw.write("...");

        // 将char数组的一部分写入
        char[] chars = {};
        fw.write(chars, 0, 5);

        // 刷新
        fw.flush();

        // 3. 关闭
        fw.close();
    }
}
