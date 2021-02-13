package com.company.IO流.bufferedreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bufferedreader通过用户键盘输入 {

    public static void main(String[] args) throws IOException {

        // 以前的方式
        Scanner s = new Scanner(System.in); // system.in是一个标准的输入流, 默认接收键盘的输入. 自动将字节流转换为字符流.

        // 程序执行到此处停下来, 等待用户的输入
        String str = s.next();

        System.out.println(str);

        // 使用bufferedreader来接收用户的输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 接收输入(每次都接收一行)
        String str1 = br.readLine();

        System.out.println(str);

        // 关闭
        br.close();

    }
}
