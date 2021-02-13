package com.company.集合.hashset集合;

/**
 * 1. hashset说明:
 *    (1) hashset底层实际上是一个hashmap, hashmap底层采用了哈希表数据结构. hashset其实是hashmap中的key部分. 所以hashset的特点和hashmap中的key应该具有相同的特点.
 *    (2) hashmap和hashset初始化容量都是16, 默认加载因子是0.75.
 *
 * 2. 哈希表说明:
 *    (1) 哈希表的原理说明: 哈希表又叫做散列表, 哈希表底层是一个数组, 这个数组中每一个元素是一个单向链表. 每个单向链表都有一个独一无二的hash值, 代表数组的下标.
 *                        在某个单向链表中的每一个节点上的hash值是相等的. hash值实际上是key调用hashcode方法, 再通过哈希函数转换成的值. 所以每个key就相当于数组中的一个元素, 所以set集合有iterator方法.
 *                        而hashmap中的值可以是重复的, 所以在一个数组元素上有很多值, 即单向链表, 所以map没有继承Iterable.
 *    (2) 如何向哈希表中添加元素: 先调用别存储的key的hashcode方法, 经过某个算法得出hash值, 如果在这个哈希表中不存在这个hash值, 则直接加入元素. 如果该hash值已经存在, 则往对应的单链表中查询, 与当前单链表中的元素一一通过equals方法进行对比,
 *                              如果都返回false, 则加入到当前链表中, 如果存在一个true, 则放弃添加当前元素; 如果这个哈希值在数组中没有, 则在数组末尾新加入该元素.
 *
 * 3. 向hashset/hashmap中存储元素:
 *    (1) hashmap中有一个put方法, put(key, value)中的key是无序不可重复的. 该方法的原理就是向哈希表中添加元素的整个过程.
 *    (2) 在向哈希表中添加元素的过程中要用到两个方法: hashcode()和equals()方法. 如果直接使用类提供的hashcode, 由于在hashset中存储的是引用, 所以即使两个对象的内容是相同的, 但由于它们是各自new出来的, 各自的引用中存的地址不同,
 *        所以hash值(数组下标)都是不同的.因此都是存储在数组中, 没有单链表. 如果想要实现按对象内容来进行添加操作, 那么就需要重写存储在hashset/hashmap中的元素的hashcode和equals方法.
 *        对于java内部的类, 已经重写号了, 对于自定义的类, 需要自己重写.
 *    (3) 存储在hashset集合或者hashmap集合key部分的元素, 需要同时重写hashcode和equals方法.
 *    (4) 重写hashcode的目的: 在散列表中使得散列均匀分布.
 * */

public class hashset {
}
