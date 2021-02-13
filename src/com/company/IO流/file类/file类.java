package com.company.IO流.file类;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * 1. file类的基本说明:
 *    (1) file类和流无关, 不能通过该类完成文件的读和写;
 *    (2) (重点)file是文件和目录路径名的抽象表示形式;
 *    (3) file代表的是硬盘上的directory和file.
 *
 * 2. file类的构造方法:
 *    (1) file f1 = new file("path") : path可以是相对路径也可以是绝对路径. path为相对路径.
 *
 * 3. file类的主要方法:
 *    (1) exists() : 测试此抽象路径名表示的文件或目录是否存在.
 *    (2) mkdir() : 创建目录.
 *    (3) mkdirs() : 创建多重目录.
 *    (4) creatnewfile() : 创建文件.
 *
 * 4. file类的其他方法:
 *    (1) getabsolutepath() : 获得绝对路径;
 *    (2) getname(): 获取文件名;
 *    (3) getparent(): 获取父路径;
 *    (4) isdirectory() / isfile(): 判断该file是directory还是file
 *    (5) lastmodified(): 获得文件最后一次修改的时间, 返回值为long类型, 可以转为date类型.
 *    (6) length(): 获取文件的长度(字节数)
 *    (7) listfiles(): 列出子文件, 返回的是file数组, 可以使用增强for遍历输出.
 *
 * */

public class file类 {

    public static void main(String[] args) throws Exception {

        File f1 = new File("...");

        System.out.println(f1.exists());

        if(!f1.exists()) {
            // 创建目录
            f1.mkdir();
            // 创建多级目录
            f1.mkdirs();
            // 创建文件
            f1.createNewFile();
        }

        // 获取绝对路径
        String absolutePath = f1.getAbsolutePath();

        // 获取文件名
        System.out.println(f1.getName());

        // 获取父路径
        String parentPath = f1.getParent();
        System.out.println(parentPath);

        // 判断该file是directory还是file
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());

        // 获取文件最后一次修改的时间, 返回值为long类型, 可以转为date类型
        Date t = new Date(f1.lastModified());
        System.out.println(new SimpleDateFormat("...").format(t));

        // 获取文件的长度(字节数)
        System.out.println(f1.length());

        // 列出子文件, 返回的是file数组, 可以使用增强for循环遍历输出
        File[] fs = f1.listFiles();

        for(File f: fs) { // f表示列表中的每个元素, 也就是子文件
            if(f.getAbsolutePath().endsWith(".java")) {
                System.out.println(f.getAbsolutePath());
            }
        }
    }
}
