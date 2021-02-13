package com.company.IO流.序列化版本号SerialVersionUID;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Test2 {

    public static void main(String[] args) throws Exception{

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("..."));

        System.out.println(ois.readObject());

        ois.close();
    }
}
