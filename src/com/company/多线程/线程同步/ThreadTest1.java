package com.company.多线程.线程同步;

public class ThreadTest1 {

    public static void main(String[] args) throws Exception {

        MyClass mc = new MyClass();
        Processor7 p = new Processor7(mc);

        Thread t1 = new Thread(p);
        t1.setName("t1");
        Thread t2 = new Thread(p);
        t2.setName("t2");

        //启动线程
        t1.start();

        //延迟(保证t1线程先启动, 并执行run)
        Thread.sleep(1000);

        t2.start();
    }
}

class Processor7 implements Runnable {

    MyClass mc;

    Processor7(MyClass mc) {
        this.mc = mc;
    }

    public void run() {

        if(Thread.currentThread().getName().equals("t1")) {
            mc.m1();
        }

        if (Thread.currentThread().getName().equals("t2")) {
            mc.m2();
        }
    }
}

class MyClass {

    public synchronized void m1() {

        //休眠
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("m1...");
    }

    //m2方法的执行不需要等m1的结束, 因为m2方法上没有synchronized
    //如果m2方法上有synchronized, 则m2方法会等m1方法结束, t1, t2共享同一个mc
    public void m2() {
        System.out.println("m2...");
    }
}
