package com.company.集合.hashtable的子类Properties类;

import java.util.Properties;

/**
 * 1. 说明:
 *    (1) java.util.properties由key和value组成, 但是key和value都只能是字符串类型, 该类是hashtable类的子类.
 *    (2) properties是线程安全的, 效率低;
 *    (3) hashtable默认初始化容量是11, 默认加载因子是0.75.
 *
 * 2. 方法:
 *    (1) setProperties : 存
 *    (2) getProperties : 取, 通过key获取value
 *
 * 3. 注意:
 *    (1) key不能重复, 如果重复则value覆盖.
 *    (2) 上面说的两个方法是properties是特有的, map接口中的方法properties都有.
 *
 * */
public class peoperties类 {

    public static void main(String[] args) {

        //1. 创建属性类对象
        Properties p = new Properties();

        //2. 存
        p.setProperty("1", "jack");
        p.setProperty("2", "alice");

        //注意: key不能重复, 如果重复则value覆盖.
        p.setProperty("1", "bob");

        //3. 取, 通过key获取value
        String v1 = p.getProperty("1");
        System.out.println(v1);
    }
}
