package com.company.数组.二维数组的声明和使用;

/**
 * 1. 特点:
 *    (1) 二维数组是一个特殊的一维数组, 特殊在这个二维数组中每一个元素都是一维数组.
 *
 * 2. 静态初始化:
 *    (1) int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
 *
 * 3. 动态初始化:
 *    (1) int[][] a = new int[3][4];
 *
 * 4. 二维数组重点总结: 特点(二维数组中每一个元素都是一个一维数组).
 */
public class 二维数组的声明和使用 {

    public static void main(String[] args) {

        //静态初始化二维数组
        int[][] a = {
                {1, 2, 3},
                {45, 34},
                {0},
                {10, 23, 85, 99}
        };

        //以上这个数组有多少个一维数组
        System.out.println(a.length + "个一维数组");

        //获取第一个一维数组
        int[] a0 = a[0];
        int a00 = a0[0];
        System.out.println(a00);

        //获取第一个一维数组的第一个元素
        System.out.println(a[0][0]);
        //获取最后一个一维数组中最后的一个元素
        System.out.println(a[3][3]);

        System.out.println(a[a.length - 1][a[a.length - 1].length - 1]);

        //遍历二维数组

        //纵向循环在外
        for (int i = 0; i < a.length; i++) {
            //对一维数组a[i]进行遍历
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j] + " ");
            }
            System.out.println();
        }

        //二维数组的动态初始化

        //3个一维数组
        //每个一维数组中有4个元素
        int[][] c = new int[3][4];

        //赋值
        a[1][2] = 100;

        //遍历
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
