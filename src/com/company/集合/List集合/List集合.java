package com.company.集合.List集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 1. list集合存储元素的特点:
 *    (1) 有序(list集合中存储有下标).
 *    (2) 可重复.
 * 2. list接口的具体实现类:
 *    (1) arraylist集合: 底层是数组, 数组是有下标的. 所以arraylist集合有很多自己的特性.
 *                      arraylist集合底层默认初始化容量是10, 扩大之后的容量是原容量的1.5倍.
 *    (2) vector集合: 底层默认初始化是10, 扩大之后的容量是原容量的2倍.
 *    (3) 如何优化arraylist和vector?
 *        1> 尽量减少扩容操作, 因为扩容需要数组拷贝. 数组拷贝很耗时间.
 *        2> 一般推荐在创建集合的时候指定初始化容量.
 *    (4) list除了拥有collection的全部方法外, 还有自己独有的方法:
 *        1> add(索引, 要添加的值)
 *        2> get(索引), 因为list有get方法, 所以list集合有特有的遍历方式, 即可以使用for循环而不使用迭代器. 当然也可以使用迭代器.
 *    (5) 面向抽象编程: 只修改具体类即可(底层数据结构的改动), 不需要改后面的代码. 因为vector, linkedlist和arraylist都实现了list接口, 后面使用到的方法它们都有.
 *
 * */
public class List集合 {

    public static void main(String[] args) {

        // 创建一个list集合
        List l = new ArrayList(); // 多态

        // 添加
        l.add(100);
        // 特有的方法
        l.add(1,555);
        System.out.println(l.get(0));

        // 遍历(迭代器方式, 集合通用的遍历方式)
        Iterator it = l.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // 遍历(list集合特有的遍历方式)
        for(int i = 0; i < l.size(); i++) {
            Object o = l.get(i);
            System.out.println(o);
        }
    }
}
