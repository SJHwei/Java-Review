package com.company.常用类.随机数Random;

import java.util.Random;

/**
 * 1.生成随机数: 使用Random类的成员方法(nextInt())
 *
 * 2.生成5个不重复的随机数[1-5]
 *
 */
public class 随机数Random {

    public static void main(String[] args) {

        //创建一个新的随机数生成器
        Random r = new Random();

        //生成int类型的随机数
        int i = r.nextInt(101); //[0-100]之间的随机数
        System.out.println(i);

        //循环生成5个随机数
        for(int j = 0; j < 5; j++) {
            System.out.println(r.nextInt(5));
        }

        //生成5个不重复的随机数
        int[] a = new int[5];
        int index = 0;
        while(index < 5) {
            int temp = r.nextInt(6);

            if(temp != 0 && !contains(a, temp)) {
                a[index++] = temp;
            }
        }

        //遍历
        for (int i1 = 0; i1 < 5; i1++) {
            System.out.println(a[i1]);
        }
    }

    /**
     * 该方法完成判断temp元素在a数组中是否包含
     * 包含返回true
     * @param a
     * @param temp
     * @return
     */
    public static boolean contains (int[] a, int temp) {

//        boolean flag = false;
//        int len = a.length;
//        int i = 0;
//
//        while(true) {
//
//            if(i == len) {
//                break;
//            }
//
//            if (a[i] == temp) {
//                flag = true;
//                break;
//            }
//
//            i++;
//        }
//
//        return flag;

        for(int i = 0; i < a.length; i++) {
            if(a[i] == temp) {
                return true;
            }
        }
        return false;
    }

}
