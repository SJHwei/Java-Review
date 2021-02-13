package com.company.多线程.线程同步;

import javax.annotation.processing.Processor;

public class ThreadTest {

    public static void main(String[] args) {

        //创建一个公共的账户
        Account act = new Account("actno-001", 5000.0);

        //创建线程对同一个账户取款
        Thread t1 = new Thread(new Porcessor6(act));
        Thread t2 = new Thread(new Porcessor6(act));

        t1.start();
        t2.start();

        System.out.println(act.getBalance());
    }
}

//取款线程
class Porcessor6 implements Runnable {
    //账户
    Account act;

    //constructor
    Porcessor6(Account act) {
        this.act = act;
    }

    public void run() {
        act.withDraw(1000.0);
        System.out.println("取款1000.0成功, 余额为: " + act.getBalance());
    }
}

//账户
class Account {

    private String actno;
    private double balance;

    public Account() {}
    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

//    //方式一: synchronized关键字加到同步语句块中
//    //对外提供一个取款的方法
//    public void withDraw(double money) { //对当前账户进行取款操作
//
//        //把需要同步的代码放到同步语句块中
//        synchronized (this) { //小括号里放的是共享对象, 该实例中共享的是账户对象
//            double after = balance - money;
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//            //更新
//            this.setBalance(after);
//        }
//    }

    //方式二: synchronized关键字加到方法上
    public synchronized void withDraw(double money) { //对当前账户进行取款操作

        /*
        原理: t1线程和t2线程.
        t1线程执行到此处, 遇到了synchronized关键字, 就会去找this的对象锁, 如果找到this对象锁, 则进入同步语句块中执行程序.
        当同步语句块中的代码执行结束后, t1线程归还this的对象锁.

        在t1线程执行同步语句块的过程中, 如果t2线程也过来执行以下代码, 也遇到synchronized关键字, 所以也去找this对象锁, 但是该对象锁被t1线程持有, 只能在这等待this对象的归还.
         */

        double after = balance - money;

        //延迟
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //更新
        this.setBalance(after);

    }
}