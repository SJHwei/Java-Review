package com.company.IO流;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
* 关于文件复制粘贴
* */
public class 使用fileinputstream和fileoutputstream完成文件的复制和粘贴 {
    public static void main(String[] args) throws Exception {

        // 创建输入流
        FileInputStream fis = new FileInputStream("...");

        // 创建输出流
        FileOutputStream fos = new FileOutputStream("...");

        // 一边读, 一边写
        byte[] bytes = new byte[1024];
        int temp = 0;
        while((temp = fis.read(bytes)) != -1) {
            // 将byte数组中内容直接写入
            fos.write(bytes, 0, temp);
        }

        // 刷新
        fos.flush();

        // 关闭
        fis.close();
        fos.close();
    }
}
