package com.company.异常处理.处理异常有两种方式;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest04 {

    public static void main(String[] args) throws FileNotFoundException {

        m1();

        System.out.println();

        try{

            //程序执行到此处发生了filenotfoundexception类型的异常.
            //JVM会自动创建一个filenotfoundexception类型的对象, 将该对象的内存地址赋值给catch语句块中的e变量.
            FileInputStream fis = new FileInputStream("abc");

            //上面的代码出现了异常, try语句块的代码不再继续执行, 直接进入catch语句块中执行.
            System.out.println("...");

            fis.read();

        } catch(FileNotFoundException e) { //e内存地址指向堆中的那个对象是filenotfoundexception类型的事件.
            System.out.println("...");

            // filenotfoundexception将object汇总的tostring方法重写.
            System.out.println(e); //java.io.FileNotFoundException: abc (系统找不到指定的文件)

        } catch(IOException e) {
            System.out.println("...");
        }
    }

    public static void m1() throws FileNotFoundException {
        m2();
    }
    public static void m2() throws FileNotFoundException {
        m3();
    }
    public static void m3() throws FileNotFoundException {
        new FileInputStream("..."); //fileinputstream构造方法声明位置上使用throws(向上抛)
    }


//    FileNotFoundException e = new xxx;
//    catch(e);
//
//    public static void catch(Exception e) {
//
//    }


}
