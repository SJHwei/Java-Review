package com.company.面向对象.类之间的关系;

import java.util.List;

// ClassRoom就是整体
public class ClassRoom {

    // ClassRoom和List集合属于关联关系, 在同一个层级上.
    // ClassRoom和Student属于聚合关系, 一个是整体, 一个是部分.
    List<Student> stus; // Student就是部分.

    // 聚合关系: 整体不依赖部分, 部分也不会依赖整体.
    // 整体无法决定部分的声明周期.

}

class Student {

}
