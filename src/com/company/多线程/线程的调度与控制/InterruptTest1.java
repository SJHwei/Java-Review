package com.company.多线程.线程的调度与控制;

//如何正确的更好的终止一个正在执行的进程
public class InterruptTest1 {

    public static void main(String[] args) throws Exception {

        Processor4 p = new Processor4();

        Thread t = new Thread(p);

        t.setName("t");

        t.start();

        //5s后终止
        Thread.sleep(5000);

        //终止
        p.run = false;
    }
}

class Processor4 implements Runnable {

    boolean run = true;

    public void run() {

        for (int i = 0; i < 10; i++) {

            if(run) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "--->" + i);
            } else {
                return;
            }

        }
    }
}