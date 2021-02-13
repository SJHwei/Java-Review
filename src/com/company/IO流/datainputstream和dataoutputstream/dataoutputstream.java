package com.company.IO流.datainputstream和dataoutputstream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class dataoutputstream {

    public static void main(String[] args) throws Exception {

        // 1. 创建数据㜾输出流
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("..."));

        // 2. 准备数据
        byte b = 10;
        int i = 10;

        // 3. 写
        dos.writeByte(b);
        dos.writeInt(i);

        // 刷新
        dos.flush();

        // 关闭
        dos.close();

    }
}
