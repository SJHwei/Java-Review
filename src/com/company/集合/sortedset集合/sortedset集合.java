package com.company.集合.sortedset集合;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 1. 说明:
 *    (1) java.util.sortedset是无序不可重复的, 但是存进去的元素可以按照大小顺序自动排列. [默认从小到大排序]
 *    (2) sortedset接口的父接口是java.util.set, sortedset接口的实现类是java.util.treeset.
 *
 * 2. 作用:
 *    (1) 可以对整型, 字符串, 日期进行排序. 因为这些类(java内部的类)都实现了Comparable这个接口,
 *        这个接口有一个方法: compareTo, 该方法用来比较此对象与指定对象的顺序.
 *
 * 3. 实现自动排序的原理:
 *    (1) 因为被存储的元素(对象)实现了comparable接口, sun编写treeset集合在添加元素的时候, 会调用compareto方法完成比较.
 *    (2) 当要将自定义的类的对象添加到sortedset中进行排序时, 该自定义的类要实现comparable接口中的compareto方法.
 *        该方法要自己实现, 对于调用该方法的程序sun已经写好了.
 *        这就是接口的其中一个作用: 使项目分层(面向接口是实现(程序员), 面向接口调用(sun的程序员)).
 *    (3) java中已经写好的类已经实现了comparable接口. 例如: 整型类, 字符串, 日期等等. 所以可以直接将这三个类型的对象添加到sortedset进行自动排序.
 *
 * 4. 做到排序的两种方式:
 *    (1) 第一种就是让要添加到sortedset集合中的元素实现comparable接口.
 *    (2) 第二种就是单独写一个比较器, 实现java.util.comparator接口.
 *        treeset是sortedset的实现类, 该类的一个构造方法的参数就是comparator类型的比较器.
 *        comparator接口有两个方法: compare和equals方法.
 *
 * 5. sortedset接口的一个实现类(treeset):
 *    (1) treeset的构造方法(三类):
 *        1> 参数为空;
 *        2> 参数为比较器(comparator类型);
 *        3> 参数为父接口类型.
 *
 *    (2) comparator和comparable的区别:
 *        1> 一个类实现了comparable接口则表明这个类的对象之间是可以互相比较的, 这个类对象组成的集合可以直接使用sort方法排序.
 *        2> comparator可以看成一种算法的实现, 将算法和数据分离, comparator也可以在下面两种环境下使用:
 *           a. 类没有考虑到比较问题而没有实现comparable, 可以通过comparator来实现排序而不必改变对象本身;
 *           b. 可以使用多种排序标准, 比如升序, 降序等.
 * */
public class sortedset集合 {

    public static void main(String[] args) throws Exception {

        //创建集合
        SortedSet ss = new TreeSet();

        //添加元素

        //类型1: 整型
        ss.add(10); //自动装箱
        ss.add(20);

        //遍历
        Iterator it = ss.iterator();
        while(it.hasNext()) {
            Object element = it.next();
            System.out.println(element);
        }

        //类型2: string
        SortedSet strs = new TreeSet();

        strs.add("JACK");
        strs.add("SUN");

        //遍历
        it = strs.iterator();
        while(it.hasNext()) {
            Object element = it.next();
            System.out.println(element);
        }

        //类型3: 日期Date
        String str1 = "2008-08-08";
        String str2 = "2009-08-08";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date t1 = sdf.parse(str1);
        Date t2 = sdf.parse(str2);

        //添加
        SortedSet times = new TreeSet();

        times.add(t1);
        times.add(t2);

        //遍历
        it = times.iterator();
        while(it.hasNext()) {
            Object element = it.next();
            if(element instanceof Date) {
                Date d = (Date)element;
                System.out.println(sdf.format(d));
            }
        }

        //第一种排序方式: 让要添加到sortedset集合中的元素(对象)的类实现comparable接口(实现compareto方法)
        //类型4: 自定义类User
        SortedSet users = new TreeSet();

        User u1 = new User(15);
        User u2 = new User(16);

        //添加元素
        users.add(u1);
        users.add(u2);

        //遍历
        it = users.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //第二种排序方式: 创建treeset集合的时候提供一个比较器, 实现comparator接口(实现该接口中的compare方法)
        SortedSet products = new TreeSet(new ProductsComparator());

        Product p1 = new Product(3.4);
        Product p2 = new Product(4.0);

        //添加元素
        products.add(p1);
        products.add(p2);

        //遍历
        it = products.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }


    }
}

//让要添加到sortedset集合中的元素(对象)的类实现comparable接口(实现compareto方法)
class User implements Comparable {

    String name;
    int age;

    User(int age) {
        this.age = age;
    }

    public String toString() {
        return "User[age=" + age + "]";
    }

    //实现java.lang.comparable接口中的compareTo方法
    //该方法自己负责实现, sun提供的程序已经调用了该方法
    //需求: 按照User的age排序
    public int compareTo(Object o) {
        //编写一个比较规则
        int age1 = this.age;
        int age2 = ((User)o).age;
        return age2-age1;
    }

}

class ProductsComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        double price1 = ((Product)o1).price;
        double price2 = ((Product)o2).price;

        //需求: 按照商品价格排序
        if(price1 == price2) {
            return 0;
        }else if(price1 > price2) {
            return -1;
        }else {
            return 1;
        }
    }
}

class Product {

    double price;

    Product(double price) {
        this.price = price;
    }

    public String toString() {
        return price + "";
    }
}