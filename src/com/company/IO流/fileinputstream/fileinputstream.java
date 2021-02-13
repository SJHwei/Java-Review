package com.company.IO流.fileinputstream;

import javax.print.DocFlavor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 1. fileinputstream基础
 *    1.1 说明: java.io.fileinputstream是文件字节输入流, 它的直接父类是java.io.fileinputstream. 按照字节方式读取文件.
 *    1.2 使用fileinputstream读取文件步骤:
 *        (1) 要读取文件, 先与这个创建一个输入流. 流是一个东西和内存之间的连接, 是一个传输过程, 文件保存在硬盘中, 所以要先在文件和内存之间创建一个输入流.
 *        (2) 开始读, 使用read()方法(fileinputstream的方法), 以字节的方式读取. 例如: a的ascii值是97, 一个字节可以存放, 可以一次读取出来, 输出是97. 但是一个汉字占两个字节, 所以一次只能读一半.
 *            注意: 如果已经读取到文件的末尾, 就会返回-1.
 *        (3) 关闭文件. 为了保证流一定会释放, 所以在finally语句块中执行关闭文件操作.
 *    1.3 缺点: 读取过程, 在循环中使用read, read只能一次读取一个字节, 不能一次读取多个, 所以存在缺点, 频繁访问磁盘, 伤害磁盘, 并且效率低.
 *    1.4 其他知识:
 *        (1) \在java中具有转义功能, 为了表示路径, 所以要用\\. 但是在windows中/和\都可以用在路径中, 而/在java中不具有转义功能, 所以可以直接使用/.
 *        (2) 使用throws抛出异常时, 是方法抛出, 不是类.
 *
 * 2. fileinputstream读取到内存的byte数组(解决上述缺点)
 *    2.1 int read(byte[] bytes): 读取之前在内存中准备一个byte数组, 每次读取多个字节存储到不腰疼人数组中.一次读取多个字节, 不是单字节读取了. 效率高.
 *                                该方法返回的int类型的值代表的是这次读取了多少个字节. 这个byte数组相当于一个临时缓存区.
 *    2.2 读取流程:
 *        (1) 创建输入流;
 *        (2) 开始读, 准备一个byte数组();
 *        (3) 关闭.
 *    2.3 将byte数组转换成字符串: new String(bytes) (可以全部转换, 也可以部分转换, 部分转换是为了只要当前写入的部分, 即有效部分)
 *    2.4 循环读取:
 *        注意: 有是不需要使用println进行额外换行, 使用print就可以了. 文件内部有自己的换行.
 *
 * 3. fileinputstream类的两个方法: available和skip
 *    (1) available()方法: 返回流中剩余的估计字节数;
 *    (2) skip(2): 跳过两个字节.
 *
 * 4. fileinputstream的相关异常:
 *    (1) inputstream是抽象类, 它的很多抽象方法抛出IOException异常, 所以继承它的子类实现这些方法时也要抛出异常.
 *        抛出IOException异常的抽象方法有: read, skip, available, close...
 *    (2) 属于fileinputstream类特有的异常是构造方法抛出的filenotfoundexception异常.
 *
 * 5. 重点: 声明异常要在try语句块外面, 不能在try语句块里面, 如果在里面, 则它就变成局部变量了, 后面代码就不能用了.
 *
 * */
public class fileinputstream {

    public static void main(String[] args) {

        FileInputStream fis = null;

        // fileinputstream类的构造方法会抛出filenotfoundstream异常. 所以要处理异常.
        try{

            // 1. 要读取某文件, 先与这个文件创建一个输入流
            // 文件路径
            String filePath = "...";
            // 创建文件输入流
            fis = new FileInputStream(filePath);

            // 2. 开始读
            // read方法会抛出ioexception异常, 所以需要处理异常.
            int i1 = fis.read();
            int i2 = fis.read();
            // 返回流中剩余的估计字节数
            System.out.println(fis.available());
            // 跳过两个字节
            fis.skip(2);

            System.out.println(i1);
            System.out.println(i2);

            // 循环方式读取
            int temp = 0;
            while((temp = fis.read()) != -1) {
                System.out.println(temp);
            }

            // 读取到byte数组
            byte[] bytes = new byte[3];
            int i3 = fis.read(bytes);
            // 将byte数组转换成字符串
            System.out.println(new String(bytes));

            // 循环方式读取到byte数组
            byte[] bytes1 = new byte[1024];
            int temp1 = 0;
            while((temp = fis.read(bytes1)) != -1) {
                System.out.print(new String(bytes1, 0, temp1));
            }

        }catch(FileNotFoundException e) {
            // 打印异常信息
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }finally{
            // 为了保证流一定会释放释放, 所以在语句块中执行释放资源的程序
            if(fis != null) {
                try{
                    // fileinputstream类的父类是抽象类inputstream, 该类的许多抽象方法都要抛出ioexception异常, close方法就是其中一个, 所以需要处理异常.
                    fis.close();
                }catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
