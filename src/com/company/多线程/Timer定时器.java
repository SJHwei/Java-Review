package com.company.多线程;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 1. 作用: 每隔固定的时间执行一段代码.
 *
 * 2. 具体步骤:
 *    (1) 创建定时器
 *    (2) 指定定时任务
 *
 * 3. Object类中和线程相关的几个方法:
 *    (1) void notify(): 唤醒在此对象监视器上等待的单个进程.
 *    (2) void notifyAll(): 所有进程.
 *    (3) void wait(): 在其他线程调用此对象的notify()方法或notifyAll()方法前, 导致当前线程的等待.
 *    (4) void wait(long timeout): ..., 或者超过指定时间
 *    (5) void wait(long timeout, int nanos)
 */
public class Timer定时器 {

    public static void main(String[] args) throws Exception {

        //1. 创建定时器
        Timer t = new Timer();

        //2. 指定定时任务
        t.schedule(
                new LogTimerTask(),
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2012-08-03 17:35:00 000"),
                10*1000
        );
    }
}

//指定任务
class LogTimerTask extends TimerTask {
    public void run() {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
    }
}
