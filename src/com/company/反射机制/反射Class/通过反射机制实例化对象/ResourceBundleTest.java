package com.company.反射机制.反射Class.通过反射机制实例化对象;

import java.util.ResourceBundle;

/**
 * @author ShiWei
 * @date 2021/2/3 - 10:00
 *
 * 1. 说明:
 *    java.util包下提供了一个资源绑定器, 便于获取属性配置文件中的内容.
 *    使用以下这种方式的时候, 属性配置文件xxx.properties必须放到类路径下.
 *
 * 2. 重点:
 *    (1) 只能绑定xxx.propertes文件;
 *    (2) 该文件必须放在类路径下;
 *    (3) 往方法中填路径名时路径后面的扩展名不能写.
 */
public class ResourceBundleTest {

    public static void main(String[] args) {
        //资源绑定器, 只能绑定xxx.properties文件, 并且这个文件必须放在类路径下, 文件扩展名也必须是porperties.
        //并且在路径的时候, 路径后面的扩展名不能写.
        ResourceBundle bundle = ResourceBundle.getBundle("com/company/反射机制/反射Class/通过反射机制实例化对象/classinfo");
        String className = bundle.getString("className1");
        System.out.println(className);
    }
}
