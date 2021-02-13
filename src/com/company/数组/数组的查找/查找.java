package com.company.数组.数组的查找;

/**
 * 1. 二分查找:
 *    (1) 二分法查找是建立在已经排序的基础之上的;
 *    (2) 要求数组中元素从小到大排序, 而且没有重复元素.
 */
public class 查找 {

    public static void main(String[] args) {

        int[] a = {1, 3, 4, 5, 7, 8, 9, 10, 23, 25, 29};

        int destElement  = 10;

        //要求: 从a数组中查找10这个元素的下标
        int index = binarySearch(a, destElement); //如果找到则返回元素的下标, 如果找不到统一返回-1

        System.out.println((index == -1) ? destElement + "元素不存在!" : destElement + "在数组中的下标是: " + index);
    }

    //折半查找的核心算法
    public static int binarySearch(int[] a, int destElement) {
        int begin = 0;
        int end = a.length - 1;

        while(begin <= end) {
            int mid = (begin + end) /2;

            if(a[mid] == destElement) {
                return mid;
            } else if (a[mid] > destElement) {
                end = mid - 1;
            } else if (a[mid] < destElement) {
                begin = mid + 1;
            }
        }
        return -1;
    }
}

