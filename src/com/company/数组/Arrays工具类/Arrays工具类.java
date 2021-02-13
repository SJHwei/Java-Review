package com.company.数组.Arrays工具类;

import java.util.Arrays;

/**
 * 1. 说明:
 *    (1) java.util.Arrays: 此类包含用来操作数组(排序, 二分查找)的各种方法.
 *    (2) 此类还包含一个允许将数组作为列表来查看的工厂.
 *
 * 2. 常用方法:
 *    (1) Arrays.sort(): 从小到大排序.
 *    (2) Arrays.binarySearch(): 二分查找.
 *
 * 3. 注意: 由于该类是用来操作数组的, 所以该类中的方法全为静态方法.
 */
public class Arrays工具类 {

    public static void main(String[] args) {

        int[] a = {3, 1, 6, 2, 5};

        //排序
        Arrays.sort(a);

        //输出
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //对排序之后的数据进行二分查找
        int index = Arrays.binarySearch(a, 1); //0
        System.out.println("下标:" + index);
    }
}
