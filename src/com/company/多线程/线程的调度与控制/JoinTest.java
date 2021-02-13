package com.company.多线程.线程的调度与控制;

public class JoinTest {

    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Processor5());
        t.setName("t");
        t.start();
        //合并进程
        t.join(); //t和主进程合并, 单线程程序
        //主线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}

class Processor5 implements Runnable {

    public void run() {
        for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}