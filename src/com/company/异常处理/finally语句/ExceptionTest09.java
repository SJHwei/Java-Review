package com.company.异常处理.finally语句;

public class ExceptionTest09 {

    public static void main(String[] args) {

        try{
            System.exit(0);
        }finally{

            //不会执行
            System.out.println("...");

        }

        int i = m1();
        System.out.println(i);


    }

    public static int m1() {

        // 以上代码的执行原理
        int i = 10;
        try {
            int temp = i;
            return temp;

        } finally {
            i++;
            System.out.println("..." + i); //11
        }
    }
}
