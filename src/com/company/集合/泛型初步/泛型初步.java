package com.company.集合.泛型初步;

import java.util.*;

/**
 * 1. 说明: JDK5.0的新特性.
 * 2. 作用:
 *    (1) 可以统一集合中的数据类型;
 *    (2) 可以减少强制类型转换.
 *
 * 3. 实例: 泛型是一个编译阶段的语法, 在编译阶段统一集合中的类型
 *    (1) Map使用泛型
 *    (2) SortedSet集合使用泛型
 *
 * 4. 优点: 统一类型, 减少强制类型转换.
 *
 * 5. 缺点: 只能存储一种类型.
 *
 * 6. 自定义泛型
 *
 * 7. 注意: Collection集合和Map集合全部都使用了泛型, 并且和集合相关的接口或者类也都使用了泛型.
 * */
public class 泛型初步 {

    public static void main(String[] args) {

        //创建一个list集合, 只能存储字符串类型
        List<String> strs = new ArrayList<String>();

        //添加元素
        //strs.add(1); //Error

        strs.add("JACK");
        strs.add("SUN");

        //遍历
        Iterator<String> it = strs.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        //Map使用泛型
        Map<String, Integer> maps = new HashMap<String, Integer>();

        //存
        maps.put("西瓜", 10);

        //遍历 [重要: map集合的遍历方式]
        Set<String> keys = maps.keySet();
        Iterator<String> it1 = keys.iterator();
        while(it.hasNext()) {
            String k = it.next();
            Integer v = maps.get(k);
            System.out.println(k + "--->" + v);
        }

        //SortedSet集合使用泛型
        SortedSet<Manager1> ss = new TreeSet<Manager1>();

        //添加
        Manager1 m1 = new Manager1(1000.0);
        Manager1 m2 = new Manager1(1500.0);

        ss.add(m1);
        ss.add(m2);

        //遍历
        Iterator<Manager1> it3 = ss.iterator();
        while(it.hasNext()) {
            Manager1 m = it3.next();
            m.work();
        }

        //以下程序没有使用泛型, 有什么缺点?
        //如果集合不使用泛型, 则集合中的元素类型不统一, 在遍历集合的时候, 只能拿出来object类型, 需要做大量的强制类型转换, 才能调用不同类型的方法, 麻烦.

        //创建一个集合, 存储A, B, C
        Set s = new HashSet();

        //创建对象
        A a = new A();
        B b = new B();
        C c = new C();

        s.add(a);
        s.add(b);
        s.add(c);

        //需求: 遍历集合, 如果是A类型调用m1方法, B类型调用m2方法, C类型调用m3方法
        Iterator it2 = s.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            //只能做大量的强制类型转换
            if(o instanceof A) {
                A a1 = (A)o;
                a1.m1();
            } else if (o instanceof B) {
                B b1 = (B)o;
                b1.m2();
            } else if (o instanceof C) {
                C c1 = (C)o;
                c1.m3();
            }
        }

        //自定义泛型测试
        MyClass<String> mc = new MyClass<String>();
        //泛型就是编译期检查类型
        //mc.m1(1000); //Error

        mc.m1("jack");

    }
}

//自定义泛型
class MyClass<T> {
    public void m1(T t) {
        System.out.println(t);
    }
}

class A {
    public void m1() {
        System.out.println("A's m1 ....");
    }
}

class B {
    public void m2() {
        System.out.println("B's m2 ....");
    }
}

class C {
    public void m3() {
        System.out.println("C's m3 ....");
    }
}

class Manager1 implements Comparable<Manager1> {

    double sal;

    Manager1(double sal) {
        this.sal = sal;
    }

    public String toString() {
        return sal + "";
    }

    public void work() {
        System.out.println("工作, 一个月" + sal + "元");
    }

    //实现接口中的方法
    public int compareTo(Manager1 m) {

        double sal1 = this.sal;
        double sal2 = m.sal; //不需要强转

        if (sal1 > sal2) {
            return 1;
        } else if (sal1 < sal2) {
            return -1;
        }

        return 0;
    }
}