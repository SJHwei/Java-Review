package com.company.IO流.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 1. 说明: java.io.filereader是文件字符输入流, 它的直接父类是java.io.inputstreamreader(转换流).
 *    它的直接父类的父类是java.io.reader.
 *
 * 2. filereader的流程和fileinputstream的流程一样. 不同的是: filereader使用字符数组, fileinputstream使用字节数据.
 *
 * 3. filereader的异常和fileinputstream一样.
 *
 * */
public class filereader {

    public static void main(String[] args) {

        FileReader fr = null;

        try{

            // 1. 创建文件字符输入流
            fr = new FileReader("...");

            // 2. 开始读
            char[] chars = new char[512];
            int temp = 0;
            while((temp = fr.read(chars)) != -1) {
                // 将char数组有效部分转成字符串
                System.out.println(new String(chars, 0, temp));
            }
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }finally{
            try{
                fr.close();
            }catch(IOException e) {
                e.printStackTrace();
            }
        }
    }

}
