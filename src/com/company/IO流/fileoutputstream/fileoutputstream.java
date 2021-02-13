package com.company.IO流.fileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 1. 说明:
 *    (1) java.io.fileinputstream是文件字节输出流, 它的直接父类是java.io.outputstream.
 *    (2) 将计算机内存中的数据写入硬盘文件中.
 *
 * 2. 写入文件的流程:
 *    (1) 创建文件字节输出流;
 *    (2) 创建要写的字符串;
 *    (3) 将字符串转换为bytes数组;
 *    (2) 开始写, 最后的时候为了保证数据完全写入硬盘, 所以要刷新. 将string转换成byte数组使用.getbytes()方法. 使用wirter()方法.
 *    (3) 关闭.
 *
 * 3. 注意:
 *    (1) flush(): 强制写入(刷新).
 *    (2) 如果要写入的文件不存在, 则自动创建.
 *    (3) fileoutputstream的构造方法有两种, 一种是直接覆盖写入; 另一种是以追加的方式写入(设置参数为true).
 *    (4) 可以只将byte数组的一部分写入.
 *
 * 4. fileoutputstream的相关异常
 *    (1) outputstream类是抽象类, 它的很多抽象方法会抛出ioexception异常. fileoutputstream类是outputstream的直接子类,
 *        所以它实现哪些抽象方法时也会抛出ioexception异常.
 *    (2) 属于fileoutputstream类特有的异常是构造方法抛出的filenotfoundstream异常, 需要处理.
 *
 * 5. 重点: 声明异常要在try语句块外面, 不能在try语句块里面, 如果在里面, 则它就变成局部变量了, 后面代码就不能用了.
 *
 * */

public class fileoutputstream {

    public static void main(String[] args) {
        // 注意: 声明流时要在try语句块的外面, 如果放到里面, 后面代码就不能用该异常对象了.
        FileOutputStream fos = null;

        try{
            // 1. 创建文件字节输出流
            // 谨慎使用, 会将原文件内容覆盖.
            // fos = new FileOutputStream("..."); // 该文件不存在则自动创建.
            // 以追加的方式写入
            fos = new FileOutputStream("...", true);

            // 2. 开始写
            String msg = "helloworld!";
            // 将字符串转换成byte数组
            byte[] bytes = msg.getBytes();
            // 将byte数组中所有的数据全部写入
            fos.write(bytes);
            // 将byte数组中的一部分数据写入
            fos.write(bytes, 0, 3);
            // 最后的时候为了保证数据完全写入硬盘, 所以要刷新.
            fos.flush();
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }finally{
            try{
                fos.close();
            }catch(IOException e) {
                e.printStackTrace();
            }
        }

    }
}
