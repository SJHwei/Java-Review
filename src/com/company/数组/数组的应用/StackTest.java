package com.company.数组.数组的应用;

public class StackTest {

    public static void main(String[] args) {
        Stack s = new Stack();

        User u1 = new User("jack", 20);
        User u2 = new User("jack1", 21);
        User u3 = new User("jack2", 22);
        User u4 = new User("jack3", 23);
        User u5 = new User("jack4", 24);

        try {
            s.push(u1);
            s.push(u2);
            s.push(u3);
            s.push(u4);
            s.push(u5);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            //弹
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class User {

    String name;
    int age;

    User(String name, int age) {
        this.age = age;
        this.name = name;
    }
}
