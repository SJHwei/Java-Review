package com.company.注解.JDK的内置注解;
@Deprecated
public class AnnotationTest03 {

    public static void main(String[] args) {
        AnnotationTest03.doSome();
    }

    public static void doSome() {
        System.out.println("do something!");
    }

    public static void doOther() {
        System.out.println("do other...");
    }
}

class Hahaha {
    public static void main(String[] args) {
        AnnotationTest03.doSome();
    }
}
