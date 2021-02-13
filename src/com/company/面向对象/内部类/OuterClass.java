package com.company.面向对象.内部类;

public class OuterClass {

    // 静态变量
    private static String s1 = "A";

    // 成员变量
    private String s2 = "B";

//    // 静态方法
//    private static void m1() {
//
//        System.out.println("static's m1 method execute!");
//    }

    // 方法
    private void m1() {

        // 局部变量
        final int i = 10;

        // 局部内部类
        // 局部内部类不能用访问控制权限修饰符修饰.
        class InnerClass {

            // 局部内部类中不能有静态声明
//            public static void m1() {}

            // 成员方法
            public void m2() {
                System.out.println(i); // 10
            }
        }

        // 调用m2
        InnerClass inner = new InnerClass();
        inner.m2();

    }

    //成员方法
    private void m2() {
        System.out.println("m2 method execute!");
    }

//    // 静态内部类
//    // 可以用访问控制权限的修饰符修饰: public, default, protected, private.
//    static class InnerClass {
//
//        // 静态方法
//        public static void m3() {
//            System.out.println(s1);
//            m1();
//
////            System.out.println(s2);
////            m2();
//        }
//
//        // 成员方法
//        public void m4() {
//            System.out.println(s1);
//            m1();
//
////            System.out.println(s2);
////            m2();
//        }
//    }

    // 成员内部类
    // 可以用访问控制权限的修饰符修饰: public, default, protected, private.
    class InnerClass {

        // 静态方法
//        public static void m3() {}

        // 成员方法
        public void m4() {
            System.out.println(s1);
            m1();

            System.out.println(s2);
            m2();
        }
    }

    // 入口
    public static void main(String[] args) {

        // 执行m3
        //OuterClass.InnerClass.m3();

        // 执行m4
        //InnerClass inner = new OuterClass.InnerClass();
        //inner.m4();

        // 创建外部类对象
//        OuterClass oc = new OuterClass();
//
//        InnerClass inner = oc.new InnerClass();
//
//        inner.m4();

        OuterClass oc = new OuterClass();
        oc.m1();
    }
}
