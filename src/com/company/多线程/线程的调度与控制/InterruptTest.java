package com.company.多线程.线程的调度与控制;


public class InterruptTest {

    public static void main(String[] args) throws InterruptedException {

        //需求: 启动线程, 5s之后打断线程的休眠
        Thread t = new Thread(new Processor());

        //起名
        t.setName("t");

        //启动
        t.start();

        //5s之后
        Thread.sleep(5000);

        //打断t的休眠
        t.interrupt();
    }
}

class Processor implements Runnable {

    public void run() {
        try {
            Thread.sleep(1000000000000L);
            System.out.println("helloworld!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
