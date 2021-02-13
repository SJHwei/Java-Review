package com.company.IO流.序列化版本号SerialVersionUID;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test1 {

    public static void main(String[] args) throws Exception{

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("..."));

        User u = new User("...");

        oos.writeObject(u);

        oos.flush();

        oos.close();
    }
}
