package com.company.数组.数组的排序;

public class 排序 {

    public static void main(String[] args) {

        int[] a = {3, 1, 6, 2, 5};

        //冒泡排序: 从小到大
        for(int i = a.length - 1; i > 0; i--) { //外层循环表示循环次数, 有n个数, 则循环n-1次
            for(int j = 0; j < i; j++) {
                if(a[j] > a[j+1]) {
                    //交换位置
                    int temp;
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        //遍历
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //选择排序
        for (int i = 0; i < a.length - 1; i++) {
            //假设第一个数据是最小值
            //记录最小值元素的下标
            int min = i;

            for(int j = i + 1; j < a.length; j++) {

                if (a[min] > a[j]) {
                    //给min重新赋值
                    min = j;
                }
            }

            //考虑交换位置
            if(min != i) {
                int temp;
                temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }

        //输出
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
