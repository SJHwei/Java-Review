package com.company.集合;

/**
 * 1. 定义: 哈希表是数组和单向列表的结合, 它的本质是一个数组, 只不过这个数组中的每个元素又是单向链表. 哈希表类似于现实世界中的字典.
 *
 * 2. 说明: 哈希表底层实际上是一个数组. 每个节点由四部分组成: 键(object key), 值(object value), 哈希值(final int hash), 下一个节点的地址(Entry entry).
 *         哈希值(final int hash): 是通过key调用hashcode方法得到的值再通过哈希算法得到的值.
 *         重点: 在单向链表中每一个节点的hash值是相同的. 代表的是数组的下标.
 *         哈希表的增删和查询效率都很高.
 *
 * 3. hashset底层实际上是一个hashmap. hashmap底层的数据结构是哈希表或散列表.
 *    hashset特点: 无序不可重复. 所以hashset相当于hashmap的key部分.
 *
 * 4. hashmap中有两个方法:
 *    (1) object get(object): 得到key对应的value.
 *    (2) void put(object key, object value): 添加一个元素的过程有两步.
 *        添加元素的过程: 通过调用hashcode方法得到的值, 再通过哈希算法得出的哈希值, 如果这个哈希值在数组中有, 则往对应的单链表中查询,
 *                      与当前单链表中的元素一一通过equals方法进行对比, 如果都返回false, 则加入到当前链表中,
 *                      如果存在一个true, 则放弃添加当前元素; 如果这个哈希值在数组中没有, 则在数组末尾新加入该元素.
 * */
public class 数据结构之哈希表和散列表 {

    public static void main(String[] args) {

        String s = "";

        s = s + (2 * '0');

        System.out.println(s);
    }
}
