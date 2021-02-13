package com.company.IO流.datainputstream和dataoutputstream;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class dataintputstream {

    public static void main(String[] args) throws Exception{

        // 1. 创建输入流
        DataInputStream dis = new DataInputStream(new FileInputStream("..."));

        // 2. 读
        // 注意: 要使用该流读取数据, 必须提前知道该文件中数据的存储格式, 顺序.
        // 读得顺序必须和写入的顺序相同.
        byte b = dis.readByte();
        int i = dis.readInt();

        // 3. 关闭
        dis.close();
    }
}
