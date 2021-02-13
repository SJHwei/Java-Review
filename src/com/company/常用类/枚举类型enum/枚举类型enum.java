package com.company.常用类.枚举类型enum;

/**
 * 1. 枚举类型特点:
 *    (1) 枚举类型中的值必须是大写;
 *    (2) 枚举类型中的值的个数必须是有限的.
 *
 * 2. 应用:
 *    (1) 需求: 定义一个方法, 该方法的作用使计算两个int类型数据的商. 如果计算成功则该方法返回1, 如果执行失败则该方法返回0.
 *    (2) 问题: 程序执行成功, 但是该程序存在风险.
 *             分析存在什么风险?
 *             返回类型为int, 太过宽泛, 即使返回值错写为其他整型, 在编译时也查不出什么错误.
 *    (3) 解决办法: 程序中的问题能在编译阶段解决的, 绝对不会放在运行期解决. 所以程序中可以引入"枚举类型".
 *
 * 3. 注意: 枚举类型生成的文件也是class文件.
 */
public class 枚举类型enum {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        Result retValue = divide(a, b);

        if(retValue == Result.SUCCESS) {
            System.out.println("成功");
        } else if (retValue == Result.FALL) {
            System.out.println("失败");
        }
    }

    //实现需求
    public static Result divide(int a, int b) {

        try {
            int c = a / b;
            return Result.SUCCESS; //成功
        } catch (Exception e) {
            return Result.FALL; //失败
        }
    }
}

//定义一个枚举类型
enum Result {
    //成功和失败
    //规范要求: 大写
    SUCCESS, FALL //有限的.
}