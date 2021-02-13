package com.company.多线程.线程同步;

public class ThreadTest2 {

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(new Processor8());
        Thread t2 = new Thread(new Processor8());

        t1.setName("t1");
        t2.setName("t2");

        t1.start();

        //延迟, 保证t1线执行
        Thread.sleep(1000);

        t2.start();

    }
}

class Processor8 implements Runnable {

    public void run() {

        if("t1".equals(Thread.currentThread().getName())) {
            MyClass1.m1();
        }

        if("t2".equals(Thread.currentThread().getName())) {
            MyClass1.m2();
        }
    }
}

class MyClass1 {

    //synchronized添加到静态方法上, 线程执行此方法的时候会找类锁
    public synchronized static void m1(){
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("m1...");
    }

    //m2方法等m1结束之后才能执行, 该方法有synchronized
    //线程执行该代码需要类锁, 而类锁只有一个
    //如果没有synchronized关键字, 则m2不会等m1结束
    public synchronized static void m2(){
        System.out.println("m2...");
    }
}