package com.company.常用类.数字类;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * 1. 常用的两个数组类:
 *    (1) java.text.DecimalFormat;
 *    (2) java.math.BigDecimal.
 *
 * 2. java.text.DecimalFormat:
 *    (1) 作用: 该类用来格式化数字
 *    (2) 数字格式元素: #(任意数字), ,(千分位), .(小数点), 0(不够补0).
 *    (3) 格式化: Number --> string.
 *
 * 3. java.math.BigDecimal:
 *    (1) 作用: 创建精确度极高的数据并且进行操作.
 *    (2) 应用: 该类型数据精确度极高, 适合做财务软件, 财务软件中double类型精确度太低.
 *    (3) 注意: 不能使用创建的两个bigdecimal对象进行加法运算, 因为两个引用类型不能做加法运算, 必须调用方法执行加法运算.
 * */
public class 数字类 {

    public static void main(String[] args) {
        //1. 创建数字格式化对象
        //需求: 加入千分位
        DecimalFormat df = new DecimalFormat("###,###"); //表示从右到左, 三个数字加一个逗号, 如果没有逗号, 只有#, 则表示形式不变, 直接变为字符串

        //开始格式化
        //Number --> string
        System.out.println(df.format(1234567));

        //需求: 加入千分位, 保留2位小数
        DecimalFormat df1 = new DecimalFormat("###, ###. ##"); //小数点后保留2位小数, 如果超了则省略, 如果少了则不管.
        System.out.println(df1.format(1234567.123));

        //需求: 加入千分位, 保留4位小数, 并且不够补0
        DecimalFormat df2 = new DecimalFormat("###, ###.0000"); //小数点后保留4位小数, 如果少了则补0, 如果多了则省略
        System.out.println(df2.format(1234567.123));

        //创建大数据
        BigDecimal v1 = new BigDecimal(10);
//        System.out.println(v1);
        BigDecimal v2 = new BigDecimal(20);

        //做加法运算, 必须调用方法执行加法运算, 因为它们是对象
        BigDecimal v3 = v1.add(v2);
        System.out.println(v3);
    }

}
