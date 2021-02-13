package com.company.集合;

import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 1. 创建集合: 由于collection是接口, 接口不能实例化, 所以要new一个该接口的实现类.(多态)
 *
 * 2. add(object o): 添加元素. collection集合只能单个存储元素, 并且只能存储引用类型.
 *
 * 3. size(): 获取集合中元素的个数.
 *
 * 4. clear(): 清空集合.
 *
 * 5. isEmpty(): 判断集合中是否有元素.
 *
 * 6. toArray(): 将集合转换为object类型的数组.
 *
 * 7. Iterator iterator(): 获取集合所依赖的迭代器对象. 通过迭代器中方法完成集合的迭代(遍历).
 *    (1) 步骤:
 *        1> 获取迭代器对象: Iterator it = c.iterator()
 *           (迭代器是面向接口编程, Iterator是接口. it是引用, 保存了内存地址, 指向堆中的迭代器对象.)
 *           (不需要关心底层集合的具体类型, 所有集合依赖的迭代器都实现了java.util.Iterator接口.)
 *        2> 开始调用方法, 完成遍历, 迭代. (Iterator接口中有三个方法, 都是用来遍历的.)
 *           a. hasNext(): 如果仍有元素可以迭代, 则返回true.
 *           b. next(): 返回迭代的下一个元素.
 *           c. remove(): 从迭代器指向的collection中移除迭代器返回的最后一个元素.
 *           原则: 调用next方法之前必须调用hasNext方法.
 *    (2) 注意: 这种方式是所有集合通用的遍历方式.
 *              Iterator是接口, 里面有三个方法; iterator是Iterable接口的方法, 同时也是所有集合的方法.
 *
 * 8. contains(object o): 判断集合汇总是否包含某个元素.
 *    (1) 原理: contains底层调用的是equals方法. 如果equals返回true, 就是包含.
 *    (2) 注意: 如果该方法所作用的集合中存储的元素是java中已有的类的对象时, 则不需要重写equals方法, 因为java内部的类都已经重写好了.
 *             但是如果集合中存储的是自定义的类的对象, 则需要重写equals方法.
 *
 * 9. remove(object o): 删除集合中某个元素.
 *    (1) 注意1: 迭代器和集合中都有remove方法, 推荐使用迭代器自身带的remove方法删除元素.
 *    (2) 注意2: remove和contains方法都需要集合中的元素(引用类型)重写equals方法.
 *    (3) 注意3: 重写的是集合中元素(对象)的equals方法.
 *
 * */
public class collection集合的常用方法 {

    public static void main(String[] args) {

        // 1. 创建集合
        Collection c = new ArrayList(); // 多态

        // 2. 添加元素
        c.add(1); // 集合中只能存储对象(引用类型), 这是自动装箱.

        c.add(new Integer(100));

        Object o = new Object();
        boolean a = c.add(o);

        // 3. 获取集合元素个数
        int s = c.size();

        // 4. 清空集合
        c.clear();

        // 5. 判断集合是否为空
        boolean i1 = c.isEmpty();

        // 6. 将集合转换为object数组
        Object[] obj = c.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }

        // 7. 迭代, 遍历
        // (1) 获取集合所依赖的迭代器对象
        // it是引用, 保存了内存地址, 指向对堆中的迭代器对象.
        Iterator it = c.iterator(); // 迭代器是面向接口编程的. 不需要关心底层集合的具体类型, 所有集合依赖的迭代器都实现了Iterator接口.

        System.out.println(it); // java.util.linkedlist$listitr@...
        // java.util.linkedlist$listitr 类是linkedlist集合所依赖的迭代器.

        // (2) 开始调用方法, 完成遍历, 迭代.
        // while循环
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println(element);
        }
        // for循环
        for (Iterator it1 = c.iterator(); it1.hasNext(); ) {
            Object o2 = it.next();
            System.out.println(o2);
        }

        // 编写过程中没有用到任何一个类, 用的都是接口, 但是底层用到了真实存在的对象.

        // 8. 判断集合中是否包含某个元素

        // 创建integer类型的对象
        Integer i2 = new Integer(10);

        // 添加元素
        c.add(i2);

        // 判断集合中是否包含i2
        System.out.println(c.contains(i2)); // true

        // 创建integer类型的对象
        Integer i3 = new Integer(10);

        // contains方法底层调用的是equals方法. 如果equals返回true, 就是包含.
        System.out.println(c.contains(i3));

        // 9. 删除集合中某个元素
        // 迭代器中有remove方法, 集合中有remove方法

        // 集合中的remove方法
        c.remove(i2);

        // 迭代器中的remove方法
        Iterator it2 = c.iterator();

        while(it.hasNext()) {

            it.next();
            it.remove(); // 通过迭代器删除, 删除迭代器返回的最后一个元素, 所以next之后用remove.

            // 使用集合自身带的remove删除
            Object element = it.next();
            // 删除
            c.remove(element);
        }



    }
}

class Manager {

    String no;
    String name;

    // 重写equals方法
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o instanceof Manager) {
            Manager i = (Manager) o;
            if (i.no == this.no && i.name == this.name) {
                return true;
            }
        }
        return false;
    }
}