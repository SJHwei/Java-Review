package com.company.多线程.线程的调度与控制;

import javax.annotation.processing.Processor;

public class SleepTest {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Processor3();
        t.setName("t1");
        t.start();

        //阻塞主线程
        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
            Thread.sleep(500);
        }

        //面试题

        //创建线程
        Thread t1 = new Processor3();
        t1.setName("t1");

        //启动线程
        t.start();

        //休眠
        t.sleep(5000); //等同于thread.sleep(5000); 阻塞的还是当前线程, 和t线程无关.

        System.out.println("helloworld!");

    }
}


class Processor3 extends Thread {
    //thread中的run方法不抛出异常, 所以重写run方法之后, 在run方法的声明位置上不能使用throws
    //所以run方法中的异常处理只能是try...catch...
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
            try {
                Thread.sleep(1000); //让当前线程阻塞1s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
