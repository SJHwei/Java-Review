package com.company.IO流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class 使用bufferedreader和bufferedwriter完成复制和粘贴 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("..."));
        BufferedWriter bw = new BufferedWriter(new FileWriter("..."));

        String temp = null;
        while ((temp = br.readLine()) != null) {
            bw.write(temp);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();

    }
}
