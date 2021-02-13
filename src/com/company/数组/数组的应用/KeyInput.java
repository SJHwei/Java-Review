package com.company.数组.数组的应用;

import java.util.Scanner;

// 如何接收用户键盘输入
public class KeyInput {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //程序执行到此处, 停下来, 等待用户的输入
        String userInput1 = s.next();

        System.out.println("您输入了: " + userInput1);

        String userInput2 = s.next();

        System.out.println("您输入了: " + userInput2);

        while (true) {
            String userInput3 = s.next();
            System.out.println("您输入了: " + userInput3);
        }

    }
}
