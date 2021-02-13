package com.company.多线程.线程的调度与控制;

import javax.annotation.processing.Processor;

/**
 * 1. 基本说明:
 *    (1) 当一个计算机中只有一个CPU时, CPU在某个时刻只能执行一条指令, 线程只有得到CPU时间片, 也就是使用权, 才可以执行指令.
 *        在单CPU的机器上线程不是并行运行的, 只有在多个CPU上线程才可以并行运行. java虚拟机要负责线程的调度, 取得CPU的使用权.
 *        目前有两种调度模型: 分时调度模型和抢占式调度模型. java使用抢占式调度模型.
 *    (2) 分时调度模型: 所有线程轮流使用CPU的使用权, 平均分配每个线程占用CPU的时间片.
 *    (3) 抢占式调度模型: 优先让优先级高的线程使用CPU, 如果线程的优先级相同, 那么会随机选择一个, 优先级高的线程获取的CPU时间片相对多一些.
 *
 * 2. 线程的优先级:
 *    (1) 线程优先级分三种: MAX_PRIORITY(最高级: 10); MIN_PRIORITY(最低级: 1); NORM_PRIORITY(标准: 5)(默认).
 *        Thread类中只有三个静态字段, 就是上面的三个优先级字段.
 *        线程优先级从1到10.
 *    (2) 如何获取当前线程对象:
 *        1>使用Thread类中的一个静态方法currentThread(). 这个静态方法在哪个线程中使用则返回的就是该线程的引用.
 *        2>Thread类中有一个成员方法getName(), 可以获得该线程的名称. 返回值是String类型.
 *        3>Thread类中有一个成员方法setName(), 可以给线程起名字. 参数为String类型.
 *        4>总结: 三个方法
 *                a. static Thread currentThread(): 获取当前线程对象;
 *                b. String getName(): 获取该线程的名字;
 *                c. void setName(String name): 给该线程起名字.
 *    (3) 获取和设置线程的优先级:
 *        1> void setPriority(int newPriority): 设置线程的优先级;
 *        2> int getPriority(): 获取线程的优先级.
 *
 * 3. Thread.sleep:
 *    (1) sleep方法的基本说明:
 *        1> Thread.sleep(毫秒): sleep是一个静态方法.
 *        2> (重点)该方法的作用: 阻塞当前线程, 腾出CPU, 让给其他线程.
 *        3> 注意: sleep抛出编译时异常, 所以需要处理异常
 *           a. 如果sleep用在主线程(main)中, 则两种处理异常的方式都可以使用;
 *           b. 如果sleep用在其他线程中, 也就是在其他线程的run方法中, 则不能在重写的run方法那儿抛出异常,
 *              因为在Thread类中run方法根本不抛出异常, 所以继承过来重写的run就不能抛出异常(因为子类中重写的方法不能抛出比父类中被重写的方法更宽泛的异常.)
 *              Thread中的run方法不抛出异常, 所以重写run方法之后, 在run方法的声明位置上不能使用throw, 只能使用try...catch...
 *        4> 注意: sleep不论是哪个进程对象调用它(静态方法也可以通过对象调用, 但是底层还是类调用), 它阻塞的还是当前的线程, 和进程对象无关.
 *    (2) 某线程正在休眠, 如何打断它的休眠:
 *        1> 使用interrupt()方法(void interrupt()).
 *        2> 注意: 这种中断方式依靠的是异常处理机制, 也就是使当前线程的sleep语句发生InterruptedException异常.
 *    (3) 如何正确的更好的终止一个正在执行的进程:
 *        1> 需求: 线程启动5s之后终止.
 *        2> 办法: 在run方法中设置一个boolean类型的属性, 当需要终止时, 设置为false.
 *
 * 4. Thread.yield:
 *    (1) 该方法是一个静态方法.
 *    (2) 作用: 与sleep相同, 只是不能由用户指定暂停多长时间, 并且yield()方法只能让同优先级的线程有执行的机会, 也就是让位, 让位时间不固定.
 *
 * 5. Thread.join:
 *    (1) 该方法是一个成员方法.
 *    (2) 作用: 线程合并. t.join()在哪个线程中, t就和哪个线程合并, 合并之后就是单线程程序.
 *
 * 6. 总结: 对于线程类(Thread类), 从三个方面考虑, 字段, 构造方法, 常用方法.
 *    (1) 静态字段: 三个, 和优先级有关.
 *    (2) 构造方法: 两种, 一种是无参数的构造方法, 适用于实现多线程的第一种方法(通过继承, 作为父类调用该构造方法实现的); 另一种是参数类型为Runnable的构造方法, 适用于实现多线程的第二种方法.
 *    (3) 方法(包括静态和成员):
 *        1> 和优先级有关: 两个;
 *        2> 和线程对象有关: 三个;
 *        3> 和阻塞有关: 两个;
 *        4> 和合并有关: 一个.
 */
public class 线程的调度与控制 {

    public static void main(String[] args) {

        //如何获取当前线程对象
        Thread t = Thread.currentThread(); //t保存的内存地址指向的线程是主线程对象

        //获取线程的名字
        System.out.println(t.getName());

        Thread t1 = new Thread(new Processor2());

        //给线程起名
        t1.setName("t1");

//        t1.start();

        Thread t2 = new Thread(new Processor2());

        //给线程起名
        t2.setName("t2");

//        t2.start();

        //获取线程的优先级
        System.out.println(t1.getPriority());
        System.out.println(t1.getPriority());

        //设置优先级
        t1.setPriority(5);
        t2.setPriority(6);

        //启动线程
        t1.start();
        t2.start();

        //Thread类中有三个和优先级有关的静态字段
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
    }
}

class Processor2 implements Runnable {

    public void run() {
        Thread t = Thread.currentThread(); //t保存的内存地址指向的线程是t1线程对象
        System.out.println(t.getName()); //Thread-0 Thread-1
    }
}