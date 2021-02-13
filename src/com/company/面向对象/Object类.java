package com.company.面向对象;

import java.sql.SQLOutput;

/**
 * 1. object类的说明: object类(java.lang.Object)是类层次结构的根类, 每个类都使用object作为超类, 所有对象(包括数组)都实现了这个类的方法.
 *
 * 2. object类中常用的几个方法:
 *   (1) boolean equals(object obj): object中的equals方法比较的是对象的内存地址, 一般要重写, java对象中的equals方法的设计目的是判断两个对象是否一样, equals方法每个对象都有.
 *   (2) finalize: 当垃圾回收器确定不存在对该对象的更多引用时, 由对象的垃圾回收器(GC)自动调用此方法. finalize方法每个对象都有.
 *   (3) hashCode: 返回对象的哈希码值. java对象的内存地址经过哈希算法得出int类型的数值, hashCode方法每个对象都有.
 *   (4) toString: 返回java对象的字符串表示形式. 对于自定义的类, 返回该对象的内存地址. 一般需要重写, java对象中的toString方法的设计目的是返回该对象的字符串表示形式, toString方法每个对象都有.
 *   (5) clone: 创建并返回此对象的一个副本, clone方法每个对象都有.
 *
 * 3. java中如何比较两个字符串是否一致(不能使用==, 使用string类的equals方法):
 *   (1) == : 如果是引用类型, 比较的是内存地址.
 *   (2) equals : 对于java内部已经定义好的类, 该类已经重写了equals方法; 对于自定义的类, 则需要重写equals方法, string类已经重写了object中的equals方法, 比较的是内容.
 *
 * 4. 关于toString方法:
 *   (1) print方法中如果是一个引用类型, 则自动调用该对象的toString方法;
 *   (2) object中toString方法返回: 类名@对象的内存地址经过哈希算法得出的int类型值再转换成十六进制.
 * */
public class Object类 {

    public static void main(String[] args) {

        // Star s1 = new Star(1, "haha");
        // Star s2 = new Star(1, "ha");
        // System.out.println(s1.equals(s2));

        String s1 = new String("ABC");
        String s2 = new String("ABC");
        System.out.print("== : ");
        System.out.println(s1 == s2);
        System.out.println("equals : " + s1.equals(s2));

    }




}

class Star {

    // 身份证号
    int id;

    // 姓名
    String name;

    // Constructor
    public Star(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj instanceof Star) {
            Star s = (Star) obj;
            if(s.id == id && s.name.equals(name)) {
                return true;
            }
        }
        return false;
    }
}