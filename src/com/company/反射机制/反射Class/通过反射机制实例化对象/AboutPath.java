package com.company.反射机制.反射Class.通过反射机制实例化对象;

import java.io.FileReader;

/**
 * @author ShiWei
 * @date 2021/2/3 - 9:05
 *
 * 1. 研究下文件路径的问题.
 *    怎么获取一个文件的绝对路径. 以下讲解的这种方式是通用的.
 *    但前提是: 文件需要在类路径下才能用这种方式.
 *
 * 2. 重点:
 *    (1) IDEA中默认的当前路径是project的根.
 *    (2) 类路径: 放在src下的都是类路径, src是类的根路径.
 *    (3) 获取一个文件的绝对路径的通用方式:
 *        String path = Thread.currentThread().getContextClassLoader().getRsource("...(默认从类的根路径下作为起点)").getPath();
 *        前提: 这个文件必须在类路径下.
 */
public class AboutPath {

    public static void main(String[] args) throws Exception {

        //这种方式的路径缺点是: 移植性差, 在IDEA中默认的当前路径是project的根.
        //这个代码假设离开了IDEA, 换到了其他位置, 可能当前路径就不是project的根了, 这时这个路径就无效了.
        FileReader reader = new FileReader("src/com/company/反射机制/反射Class/通过反射机制实例化对象/classinfo.properties");

        //接下来说一种比较通用的一种路径, 即使代码换位置了, 这样编写仍然是通用的.
        //注意: 使用以下通用方式的前提是: 这个文件必须在类路径下.
        //什么是类路径? 放在src下的都是类路径. [记住它]
        //src是类的根路径.
        /*
        * 解释:
        *     Thread.currentThread() : 当前线程对象
        *     getContextClassLoader() : 是线程对象的方法, 可以获取到当前线程的类加载器对象.
        *     getResource() : [释放资源]这是类加载器对象的方法, 当前线程的类加载器默认从类的根路径下加载资源.
        * */
        //这行代码是通用的, 背下来
        //不过有一个前提: 要获取的资源是在类的根路径下, 也就是src下.
        //这种方式适合于各种操作系统, 各种环境的.
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("com/company/反射机制/反射Class/通过反射机制实例化对象/classinfo.properties")
                .getPath();
        //采用以上的代码可以拿到一个文件的绝对路径.
        System.out.println(path);
    }
}
