package com.company.反射机制.反射Constructor.通过反射机制调用构造方法;

import com.company.反射机制.反射Constructor.反编译Constructor.Vip;

import java.lang.reflect.Constructor;

/**
 * @author ShiWei
 * @date 2021/2/26 - 11:14
 *
 * 通过反射机制调用构造方法实例化java对象(这个不是重点).
 */
public class ReflectTest12 {
    public static void main(String[] args) throws Exception {
        //不使用反射机制怎么创建对象
        Vip v1 = new Vip();
        Vip v2 = new Vip(110, "张三", "2001-10-11", true);

        //使用反射机制怎么创建对象呢?
        Class c = Class.forName("com.company.反射机制.反射Constructor.反编译Constructor.Vip");
        //调用无参数构造方法
        Object obj = c.newInstance();
        System.out.println(obj);
        //调用有参数的构造方法怎么办?
        //当然也可以通过以下方式调用无参数构造方法
        //第一步: 先获取到这个有参数的构造方法
        //注意: 构造方法通过参数进行区分
        Constructor con = c.getDeclaredConstructor(int.class, String.class, String.class, boolean.class);
        //第二步: 调用构造方法new对象
        Object newobj = con.newInstance(110, "张三", "2001-10-11", true);
        System.out.println(newobj);

    }
}
