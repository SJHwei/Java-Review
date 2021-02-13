package com.company.反射机制.反射Class.通过反射机制实例化对象;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author ShiWei
 * @date 2021/2/3 - 9:52
 */
public class IoPropertiesTest {

    public static void main(String[] args) throws Exception {

        /*String path = Thread.currentThread().getContextClassLoader()
                .getResource("com/company/反射机制/反射Class/通过反射机制实例化对象/classinfo.properties")
                .getPath();
        FileReader reader = new FileReader(path);*/

        //直接以流的形式返回, 等价于上面两行代码
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("com/company/反射机制/反射Class/通过反射机制实例化对象/classinfo.properties");

        //创建属性类对象Map
        Properties pro = new Properties(); //key value都是String
        //加载
        pro.load(in);
        //关闭流
        in.close();
        //通过key获取value
        String className = pro.getProperty("className1");
        System.out.println(className);
    }
}
