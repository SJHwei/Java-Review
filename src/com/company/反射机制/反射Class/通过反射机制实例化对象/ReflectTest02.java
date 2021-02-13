package com.company.反射机制.反射Class.通过反射机制实例化对象;

/**
 * @author ShiWei
 * @date 2021/2/2 - 19:24
 *
 * 获取到Class, 能干什么?
 *     通过Class的newInstance()方法来实例化对象.
 *
 * 注意:
 *     newInstance()方法内部实际上调用了无参数构造方法, 必须保证无参数构造方法存在才可以.
 */
public class ReflectTest02 {

    public static void main(String[] args) {
        //通过反射机制, 获取Class, 通过Class来实例化对象
        try {
            Class c = Class.forName("java.util.String"); //c代表String类型

            //newInstance()这个方法会调用String这个类的无参数构造方法, 完成对象的创建.
            //重点: newInstance调用的是无参数构造, 必须保证无参数构造方法是存在的.
            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
