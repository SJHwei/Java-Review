package com.company.集合;

/**
 * 1. collection(一个一个存)的继承结构图
 *    (1) Collection是一个接口, 只能存储引用类型, 并且是单个存储. 它的直接父类(父接口)是iterable接口.
 *        collection的子类接口是List和Set接口.
 *    (2) Iterable接口表示可迭代的, 所以后面的实现类都是可迭代的, 迭代就是遍历. 该接口中有一个iterator()方法(迭代器). Iterable中主要就是这个方法.
 *        所以所有集合都有该方法, 集合通过该方法得到迭代器, 集合获取到迭代器之后可以使用迭代器去遍历集合(通过迭代器中的三个方法实现遍历).
 *        Iterator接口中主要有三个方法, 就是遍历集合所需的三个方法: hasNext(), next(), remove().
 *    (3) List存储元素的特点: 有序可重复. 它的父类(父接口)是collection和iterable.
 *        主要的实现类有三个: arraylist; linkedlist; vector.
 *    (4) Set存储元素的特点: 无序不可重复. 它的父类(父接口)是collection和iterable.
 *        主要的两个实现类是hashset和treeset, hashset是直接实现类, treeset是间接实现类, 它是sortedset接口的直接实现类, sortedset接口的父接口是set.
 *    (5) arraylist底层采用的是数组存储元素的. 所以arraylist集合适合查询, 不适合频繁的随机增删元素.
 *        linkedlist底层采用双向链表这种数据结构存储数据的. 链表适合频繁的增删元素, 不适合查询操作.
 *        vector底层和arraylist集合相同, 但是vector是线程安全的. 效率较低, 所以现在很少使用.
 *        hashset底层实际上是一个hashmap. 哈希表/散列表.
 *        sortedset接口存储元素怒的特点: 无序不可重复的. 但是存储进去的元素可以按照元素的大小自动排序.
 *        treeset.
 *
 *    注意: 上层是接口(抽象), 下层是真正的实现接口的类. 编程时面向接口编程.
 *    重点: 对于父类/父接口, 它的子类/子接口/实现类拥有它的所有父类/父接口/接口的所有方法.
 *
 * 2. map(一对一对存)的继承结构图
 *    (1) map是一个接口, 该集合以键值对的方式存储元素, 键特点是: 无序不可重复的. map和collection没有关系.
 *    (2) map的主要的三个实现类是hashmap, hashtable, treemap. hashtable的一个直接子类是properties. treemap是间接实现类, 它是sortedmap接口的直接实现类, sortedmap接口的父接口是map.
 *    (3) hashmap是哈希表/散列表, hashmap中的key等同一个set集合, 也就是hashset.
 *        hashtable是线程安全的, 效率低.
 *        properties是属性类, 也是以key和value的方式存储元素怒, 但是key和vlaue只能是字符串类型.
 *        sortedmap中的key存储元素的特点: 无序不可重复, 但是可以按照元素的大小顺序自动排序. sortedmap中的key等同于sortedset.
 *        treemap的key就是一个treeset.
 *
 * 3. 总结: 上层是接口, 下层是具体实现类, 所以上层的方法下层都有, 而且都已经实现.
 *
 * */
public class 集合的继承结构图 {
}
