package com.company.IO流.printstream和printwriter;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;

public class printstream {

    public static void main(String[] args) throws Exception {

        PrintStream ps = System.out;
        ps.println("...");

        // 可以改变输出方向
        System.setOut(new PrintStream(new FileOutputStream("...")));
        // 输出到日志文件中
        System.out.println("...");

        // 需求: 记录日志, m1方法开始执行的时间和结束的时间记录到log文件中.
        SimpleDateFormat sdf = new SimpleDateFormat("...");
        System.out.println("....");
        m1();
        System.out.println(",,,");



    }

    public static void m1() {
        System.out.println("...");
    }
}
