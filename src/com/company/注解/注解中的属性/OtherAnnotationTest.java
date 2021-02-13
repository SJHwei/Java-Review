package com.company.注解.注解中的属性;

public class OtherAnnotationTest {

    //数组是大括号
    @OtherAnnotation(age=25, email={"zhangsan@123.com", "zhangsan@sohu.com"}, seasonArray={Season.AUTUMN, Season.SPRING})
    public void doSome() {

    }

    //如果数组中只有一个元素, 则大括号可以省略
    @OtherAnnotation(age=25, email="zhangsan@123.com", seasonArray=Season.AUTUMN)
    public void doOther() {

    }
}
