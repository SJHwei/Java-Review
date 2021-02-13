package com.company.面向对象;

/**
 * 1. 接口的基本说明: 接口也是一种引用类型, 可以等同看做类.
 *   1.1 定义接口: [修饰符] interface 接口名 {}
 *   1.2 接口中只能含有:
 *     (1) 常量: 必须用public static final修饰, 可以省略;
 *     (2) 抽象方法: 必须用public abstract修饰, 可以省略.
 *   1.3 接口的实现和继承:
 *     (1) 接口和接口之间可以多继承;
 *     (2) 一个类可以实现(继承)多个接口, 一个类使用implements关键字(相当于extends)实现接口,
 *         一个非抽象类需要将接口中所有方法"实现/重写/覆盖"来实现接口.
 *   1.4 重点注意:
 *     (1) 接口其实是一个特殊的抽象类, 特殊在接口是完全抽象的;
 *     (2) 接口中没有构造方法, 无法被实例化.
 *
 * 2. 接口的作用:
 *   2.1 可以使项目分层, 所有层都面向接口开发, 开发效率提高了; (面向接口调用, 面向接口实现)
 *   2.2 接口使代码和代码之间的耦合度降低, 就像内存条和主板的关系, 变得"可插拔", 可以随意切换.
 *
 * 3. 如果抽象类和接口都能满足需求, 优先选择接口. 因为接口可以多实现, 多继承. 并且一个类除了实现接口外, 还可以去继承其他类(保留了类的继承).
 * */
public class 接口 {

    public static void main(String[] args) {

        // 1. 生产引擎
        YAMAHA e1 = new YAMAHA();

        // 2. 生产汽车
        Car c = new Car(e1); // 多态

        // 3. 测试引擎
        c.testEngine();

        // 换HONDA
        c.e = new HONDA(); // 多态

        c.testEngine();
    }
}

// 生产汽车
class Car {
    // 引擎
    //面向接口编程
    Engine e;

    // Constructor
    Car(Engine e) {
        this.e = e;
    }

    // 汽车应该能够测试引擎
    public void testEngine() {
        e.start(); // 面向接口编程
    }
}

// 生产HONDA引擎
class HONDA implements Engine {
    public void start() {
        System.out.println("HONDA启动!");
    }
}
// 生产YAMAHA引擎
class YAMAHA implements Engine {
    public void start() {
        System.out.println("YAMAHA启动!");
    }
}


// 汽车和发动机之间的接口.
// 生产汽车的厂家面向接口生产; 生产发动机的厂家面向接口生产.
interface Engine {
    // 所有的发动机都可以启动
    void start();
}
