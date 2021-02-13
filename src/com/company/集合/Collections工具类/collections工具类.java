package com.company.集合.Collections工具类;

import java.util.*;

/**
 * 1. 说明:
 *    (1) Collection是接口接口.
 *    (2) Collections类是集合类的一个工具类/帮助类,
 *        其中提供了一系列静态方法, 用于对集合中元素进行排序, 搜索以及线程安全等各种操作.
 *
 * 2. 作用:
 *    (1) 可以使用collections工具类完成集合的排序:
 *        1> collections.sort(l) [l为list类型, 该工具类中都是静态方法.]
 *        2> collections.sort(): 它的参数类型只能是list类型.
 *        3> 如果想让set集合也能使用sort方法, 需要将set集合转成list集合, list构造方法就可以实现这个转换. 可以使用参数collection类型的arraylist的构造方法.
 *        4> arraylist类的构造方法有三类: 参数为空; 参数为int类型(指定初始容量); 参数为Collection类型.
 *        5> collections工具类可以对list集合中的元素排序, 但是集合中元素必须是可比较的, 实现comparable接口.
 *    (2) 将arraylist集合转换成线程安全的.
 *
 * */
public class collections工具类 {

    public static void main(String[] args) {

        //使用collections工具类完成集合的排序
        List l = new ArrayList();

        //添加元素
        l.add(10);
        l.add(4);

        //arraylist的遍历有两种方式: 一种是使用get方法进行普通for循环; 另一种是使用迭代器.
        //方式1: 普通for循环
        for(int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        //方式2: 使用迭代器
        Iterator it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //给定set集合
        Set s = new HashSet();

        s.add(1);
        s.add(2);

        //将set集合转换成list集合, 使用参数类型为collection的arraylist构造方法
        List lists = new ArrayList(s);
        Collections.sort(lists);

        System.out.println("==============================");
        //遍历
        for(int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }

        //将arraylist集合转换成线程安全的
        List myList = new ArrayList();
        Collections.synchronizedList(myList);

    }
}
