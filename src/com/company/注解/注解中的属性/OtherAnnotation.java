package com.company.注解.注解中的属性;

public @interface OtherAnnotation {

    int age();
    String[] email();
    Season[] seasonArray(); //Season是枚举类型
}


