package com.company.IO流;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * 文件复制
 * 只能复制纯文本文件
 * */
public class 使用filereader和filewriter完成文件的复制和粘贴 {

    public static void main(String[] args) throws Exception{

        FileReader fr = new FileReader("...");
        FileWriter fw = new FileWriter("...");

        char[] chars = new char[512];
        int temp = 0;
        while((temp = fr.read(chars)) != -1) {
            // 写
            fw.write(chars, 0, temp);
        }

        fw.flush();

        fr.close();
        fw.close();
    }
}
