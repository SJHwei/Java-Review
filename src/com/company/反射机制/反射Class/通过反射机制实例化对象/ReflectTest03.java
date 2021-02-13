package com.company.反射机制.反射Class.通过反射机制实例化对象;

import com.company.IO流.序列化版本号SerialVersionUID.User;

import java.io.FileReader;
import java.util.Properties;

/**
 * @author ShiWei
 * @date 2021/2/2 - 19:42
 * <p>
 * 验证反射机制的灵活性.
 * <p>
 * 后期要学习的高级框架, 而工作中, 也都是使用高级框架. 包括: ssh ssm.
 * ssm: spring springMVC Mybatis
 * ssh: spring struts Hibernate
 * ...
 * 这些高级框架底层实现原理: 都采用了反射机制, 所以反射机制还是重要的.
 * 学会了反射机制有利于理解剖析底层的源代码.
 */
public class ReflectTest03 {

    public static void main(String[] args) throws Exception {

        //这种方式就写死了, 只能创建一个User类型的对象
        User user = new User("jack");

        //以下代码是灵活的, 代码不需要改动, 可以修改配置文件, 配置文件修改后, 可以创建出不同的实例对象.
        //通过IO读取classinfo.properties文件, 该文件是属性配置文件.
        FileReader reader = new FileReader("src/com/company/反射机制/反射Class/通过反射机制实例化对象/classinfo.properties");
        //创建属性类对象Map
        Properties pro = new Properties(); //key, value都是String
        //加载
        pro.load(reader);
        //关闭流
        reader.close();

        //通过key获取value
        String className1 = pro.getProperty("className1");
        System.out.println("className1 = " + className1);
        String className2 = pro.getProperty("className2");
        System.out.println("className2 = " + className2);

        /*File f = new File("src/com/company/反射机制/反射Class/通过反射机制实例化对象/classinfo.properties");
        String absolutePath = f.getAbsolutePath();
        System.out.println(absolutePath);
        System.out.println(f.getPath());
        */

        //通过反射机制实例化对象
        Class<?> c = Class.forName(className1);
        Object obj = c.newInstance();
        System.out.println(obj);
    }
}

