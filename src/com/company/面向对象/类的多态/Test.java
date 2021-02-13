package com.company.面向对象.类的多态;

import javax.sound.midi.Soundbank;

public class Test {

    public static void main(String[] args) {

        Animal a1 = new Cat(); // 向上转型

        a1.eat(); // 子类和父类中都有的方法

        // 向下转型: 强制类型转换
        Animal a2 = new Cat(); // 向上转型

        // 要执行move方法, 怎么做?
        // 只能强制类型转换, 需要加强制类型转换符
        Cat c1 = (Cat)a2;

        c1.move(); // 子类中特有的方法

        Animal a3 = new Dog();

        System.out.println(a3 instanceof Cat); // false

        // 推荐: 在做向下转型的时候要使用instanceof
        if(a3 instanceof Cat) {
            Cat c2 = (Cat)a3;
        }
    }
}

class Animal {

    public void eat() {

    }
}

class Cat extends Animal{

    // 子类和父类中都有的方法
    public void eat() {

    }

    // 子类中特有的方法
    public void move() {

    }
}

class Dog extends Animal{

    // 子类和父类中都有的方法
    public void eat() {

    }

    // 子类中特有的方法
    public void move() {

    }
}
