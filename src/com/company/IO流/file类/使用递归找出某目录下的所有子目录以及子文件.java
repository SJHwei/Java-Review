package com.company.IO流.file类;

import java.io.File;

public class 使用递归找出某目录下的所有子目录以及子文件 {

    public static void main(String[] args) {
        File f = new File("...");

        // 调用方法完成查找
        method1(f);
    }

    public static void method1(File f) {
        if(f.isFile()) {
            return;
        }

        // f有两种可能, f可能是文件, 也可能是目录
        // 先当做目录
        File[] fs = f.listFiles();

        for(File subf: fs) {
            System.out.println(subf.getAbsolutePath());
            method1(subf);
        }
    }
}
