package com.company.常用类.包装类型;

import java.sql.SQLOutput;

/**
 * 1. 八种基本数据类型对应的包装类型:
 *    (1) byte对应java.lang.Byte
 *    (2) short对应java.lang.Short
 *    (3) int对应java.lang.Integer
 *    (4) long对应java.lang.Long
 *    (5) float对应java.lang.Float
 *    (6) double对应java.lang.Double
 *    (7) booleaqn对应java.lang.Boolean
 *    (8) char对应java.lang.Charater
 *    注意: 除了int和char外, 其他对应包装类型都是首字母大写.
 *
 * 2. 作用: (java中提供的八种基本数据类型不够用吗? 为什么java中还要提供对应的包装类呢?)
 *    (1) 方便.
 *
 * 3. 继承关系结构图:
 *    (1) Boolean类是object的直接子类, character类是object类的直接子类, Number是object类的直接子类.
 *    (2) 剩余的六种基本数据类型是Number类的直接子类.
 *    (3) Number类有一个BigDecimal子类, 该类用来对超过16位有效位的数进行精确的运算。
 *
 * 4. 包装类型常用方法: (以java.lang.integer类型为例) [三个方面: 字段, 构造方法, 常用方法, 类型间的转换]
 *    (1) Number类中有6个公共方法: 类型Value() [以..类型形式返回指定的数值]
 *    (2) Integer类的字段(都是静态的):
 *        1> MAX_VALUE: 表示int类型能够表示的最大值.
 *        2> MIN_VALUE: 表示int类型能够表示的最小值.
 *        3> SIZE: 表示int值的比特位数.
 *        4> TYPE: 表示int的class实例.
 *        注意: 以int推byte, Byte中也有最大值和最小值.
 *    (3) 创建integer类型的对象两种方式: (构造方法)
 *        1> 参数是int类型;
 *        2> 参数是字符串类型. [将字符串转换为Integer类型, 所以也可以将字符串转化为int类型(间接方式)]
 *        注意: 该字符串必须是数字字符串.
 *    (4) Integer类中常用方法:
 *        1> int intValue(): 将integer类型变为int类型.
 *        2> static int parseInt(string s): 将字符串类型转化为int类型. [直接方式]
 *           在Double类中有parseDouble(string s): 将string类型转换为double类型.
 *        3> 将int类型的十进制转换成2, 8, 16进制:
 *           a. 2进制: static string toBinaryString(int i)
 *           b. 8进制: static string toOctalString(int i)
 *           c. 16进制: static string toHexString(int i)
 *        4> static Integer valueOf(int i): 将int类型转换为Integer类型.
 *        5> static Integer valueOf(string s): 将string类型转化为integer类型.
 *    注意: 构造一个integer对象有两种方式, 一种是使用构造方法; 另一种是使用静态方法valueOf. (这两种方法的参数都有两种: int类型和字符串类型.)
 *    (5) integer, int和string三种类型相互转换:
 *        1> int --> integer: valueOf()静态方法 (还可以通过使用参数为int类型的构造方法获得)
 *        2> integer --> int: intvalue()
 *        3> string --> integer: valueOf() (还可以通过使用参数为string类型的构造方法获得)
 *        4> integer --> string: toString()
 *        5> string --> int: parseInt()静态方法
 *        6> int --> string: + ""
 *    注意1: 包装类或者给你很多字段和方法都是静态的, 直接通过类即可访问. 一般字段都是静态的.
 *    注意2(什么时候声明为静态方法): 一般来说, 当需要对整个类的对象进行操作而且这个方法对该类的所有对象都是通用的时候声明为静态的, 和对象本身没有关系.
 *                                 而且静态方法实际上相当于函数, 不一定要在该类中, 可以放在外面或其他类, 所以常常将对一个类的对象的通用操作封装成一个工具类,
 *                                 例如Collections工具类, 里面很多方法就是静态的, 那些方法都是对集合类通用的一些操作.
 *
 * 5. 自动装箱和自动拆箱:
 *    (1) 说明: 是程序编译阶段的一个概念, 和程序运行无关.
 *    (2) 目的: 方便程序员编码.
 *    (3) 整型常量池: 如果数据在(-128~127)之间, java中引入了一个整形常量池, 在方法区中. 当都是从整型常量池中拿相同的数据时, 使用==得到的结果是true.
 *    (4) 在方法区中有字符串常量池和整型常量池, 如果不使用new而直接赋值, 则从常量池中取值, 所以它们的引用中存储的地址是相同的; 如果使用new, 则会在堆中创建对象, 则引用中存储的地址是不同的.
 *    (5) 装箱: int --> Integer; 拆箱: Integer --> int.
 *
 * */
public class 包装类型 {

    //需求: 规定m1方法可以接受java中任何一种数据类型
    //m1方法如果想要接收byte类型的数据, 可以将byte类型先包装成java.lang.Byte;再传递参数
//    public static void m1(Object o) {
//        System.out.println(o);
//    }

    public static void main(String[] args) {

        //基本数据类型
        byte b = 10;

        //引用类型
        Byte b1 = new Byte(b);

        m1(b1); //10 Byte已经将object中的tostring方法重写.

        //包装类型的常用方法(以java.lang.Integer类型为例)
        //1.字段

        //获取int类型的最大值和最小值
        System.out.println("int最小值:" + Integer.MIN_VALUE);
        System.out.println("int最大值:" + Integer.MAX_VALUE);
        //以int推byte
        System.out.println("byte最小值:" + Byte.MIN_VALUE);
        System.out.println("byte最大值:" + Byte.MAX_VALUE);

        //2.构造方法(两种)

        //创建integer类型的对象
        Integer i1 = new Integer(10); //int --> integer
        Integer i2 = new Integer("123"); //string --> integer

        //3.常用方法

        //将int类型的十进制转换成二进制
        String s1 = Integer.toBinaryString(10);
        System.out.println(s1); //1010
        //将int类型的十进制转换成16进制
        String s2 = Integer.toHexString(10);
        System.out.println(s2); //a
        //将int类型的十进制转换成8进制
        String s3 = Integer.toOctalString(10);
        System.out.println(s3); //12

        //int-->integer
        Integer i11 = new Integer(10);
        Integer i12 = Integer.valueOf(10);
        //integer-->int
        int i111 = i11.intValue();
        //string --> integer
        Integer i1111 = new Integer("10");
        Integer i1112 = Integer.valueOf("10");
        //integer --> string
        String s = i1111.toString();
        //string --> int
        int ii = Integer.parseInt("10");
        //int --> string
        String s22 = 10 + "";

        //自动装箱和自动拆箱
        //int-->integer (装箱)
        Integer ii1 = new Integer(10);
        //integer-->int (拆箱)
        int ii2 = ii1.intValue();

        Integer i3 = 10; //自动装箱
        int i4 = i3; //自动拆箱

        System.out.println(i3); //"10"
        System.out.println(i4 + 1); //11

        m1(321); //自动装箱
        System.out.println(m2(10, 5) + 1);

        Integer iii1 = new Integer(10);
        Integer iii2 = new Integer(10);

        //这里不会有自动拆箱
        System.out.println(iii1 == iii2);

        //比较两个integer类型的数据是否相等, 不能使用==
        //integer已经重写了object中的equals方法
        System.out.println(iii1.equals(iii2)); //true

        //重点:
        Integer iii3 = 128;
        Integer iii4 = 128;

        System.out.println(iii3 == iii4); //false

        //注意以下程序
        //如果数据是在-128~127之间, java中引入了一个整型常量池, 在方法区中.
        //该整型常量池只存储-128~127之间的数据
        Integer iii5 = 127; //这个程序不会在堆中创建对象, 会直接从整型常量池中拿.
        Integer iii6 = 127;

        System.out.println(iii5 == iii6); //true

        Integer iii7 = -128;
        Integer iii8 = -128;

        System.out.println(iii7 == iii8); //true

        Integer iii9 = -129;
        Integer iii10 = -129;

        System.out.println(iii9 == iii10); //false

    }

    public static void m1(Object o) {
        System.out.println(o);
    }

    public static int m2(Integer i1, Integer i2) {
        return i1-i2; //自动拆箱
    }

}
