package com.company.数组.一维数组的声明和使用;

/**
 * 1. 初始化一维数组有两种方式:
 *    (1) 静态初始化: int[] a = {1, 2, 3};
 *    (2) 动态初始化: int[] a = new int[3];
 *        1> 原理: 现在堆内存中分配这个数组, 并且数组中每一个元素都采用默认值.
 *                 * byte, short, int, long  0
 *                 * float, double  0.0
 *                 * boolean  false
 *                 * char  \u0000
 *                   注意: 既不是null, 也不是空格, 是一个字符, 表示\0, C语言中常用作字符串的结束标志, 在ASCII码表中表示NUL(0000 0000).
 *                 * 引用  null
 *        2> 空指针异常: 因为引用类型的数组默认值是null, 如果直接调用tostring方法就会出现空指针异常, 但是通过println输出时就不会出现空指针异常.
 *           原因: println方法会自动调用valueOf方法, valueOf调用tostring方法, valueOf会处理空指针异常.
 *
 * 2. 什么是使用动态初始化, 什么时候使用静态初始化?
 *    (1) 使用静态初始化: 如果在创建数组的时候知道数组中应该存储什么数据, 这个时候当然采用静态初始化方式.
 *    (2) 使用动态初始化: 如果在创建数组的时候无法预测到数组中存储什么数据, 只是先开辟空间, 则使用动态初始化方式.
 *    (3) 注意: 无论是动态初始化还是静态初始化, 最终的内存分布都是一样的.
 *
 * 3. 深入一维数组:
 *    (1) 创建一个数组, 这个数组可以存储Dog, 也能存储Cat. (使用强制类型转换(向下转型))
 *    (2) 方法调用的时候有两种传入数组的方式: 一种是先创建, 再传入; 另一种是创建和传入参数一起实现.
 *
 * 4. 关于main方法中的参数列表(String[] args):
 *    (1) String[] args: 是专门用来接收命令行参数的;
 *    (2) 对于命令行的参数, 默认以空格的方式分割, 然后存储在string数组中.
 *
 * 5. 关于数组拷贝: System类下有一个复制数组的方法(arraycopy).
 *
 * 6. 一维数组重点总结: 两种初始化方式(静态和动态); String[] args; 数组拷贝的一个方法.
 */
public class 一维数组的声明和使用 {

    public static void main(String[] args) {

        //静态初始化一个int类型的一维数组
        int[] a1 = {10, 12, 31};

        //动态声明一个int类型的数组, 最多可以存储4个元素
        int[] a2 = new int[4];

        //引用类型的数组
        Object[] objs = new Object[3];
        for (int index = 0; index<objs.length; index++) {
            Object o = objs[index];
//            o.toString(); //注意空指针异常, 因为引用类型的数组默认值是null
            System.out.println(o); //null

        }

        //以下两种方式都是可以的
        int[] b1 = {1, 2, 3};
        int b2[] = {1, 2, 3};

        //创建一个数组, 这个数组既可以存储dog, 也能存储cat
        Animal[] as = new Animal[4];

        //给数组每个元素赋值
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Cat c1 = new Cat();
        Cat c2 = new Cat();

        as[0] = d1;
        as[1] = d2;
        as[2] = c1;
        as[3] = c2;

        //需求: 遍历数组, 取出每个对象, 如果是dog执行eat方法, 如果是cat执行move方法
        for (int i = 0; i < 4; i++) {
            Animal a = as[i];
            System.out.println(a);

            //强制类型转换(向下转型)
            if(a instanceof Cat) {
                Cat c = (Cat)a;
                c.move();
            }else if(a instanceof Dog) {
                Dog d = (Dog)a;
                d.eat();
            }
        }

        //方法调用的时候也可以将数组作为参数传入
        //第一种方式
        int[] a = {12, 3, 4, 5, 6};
        m1(a);

        //第二种方式
        m1(new int[] {34, 5, 6, 7, 8, 10});

        //数组拷贝
        int[] src = {2, 3, 4, 5, 6, 7, 8};
        int[] dest = {10, 11, 12, 13, 14, 15, 16};

        //把src中的4, 5, 6拷贝到dest数组从13开始
        System.arraycopy(src, 2, dest, 3, 3);

        //遍历
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }
    }

    public static void m1(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

class Animal {

}

class Dog extends Animal {

    public void eat() {
        System.out.println("Dog eat");
    }
}

class Cat extends Animal {

    public void move() {
        System.out.println("Cat move");
    }
}
