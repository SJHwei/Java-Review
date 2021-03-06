package com.company.面向对象;

/**
 * 1. 软件包机制:
 *   1.1 目的: 为了解决类的命名冲突问题, 在类名前加命名空间(包机制).
 *   1.2 定义(使用package语句定义包):
 *     (1) 格式(package定义的格式): 公式域名倒叙.项目名.模块名
 *     (2) 使用: package语句只能出现在java源文件的第一行
 *   1.3 注意:
 *     (1) 完整的类名是带有包名的
 *     (2) 类前面的包名都可以看成一个类, classpath表示所在的当前类.
 *
 * 2. import语句: import语句可以引入其他类, import语句只能出现在package语句之下, 定义class的语句之上.
 *
 * 3. JDK常用的开发包:
 *   (1) java.lang: java语言标准包, 该软件包下所有类不需要手动导入, 系统自动导入;
 *   (2) java.sql: 提供了JDBC接口类;
 *   (3) java.util: 提供了常用的工具类;
 *   (4) java.io: 提供了各种输入输出流.
 *
 * 4. 重点: 包和import是一起的, package分割了空间, 解决了类的命名冲突问题, 但是需要在当前类中其他类时需要完整的类名(带有包名), 很麻烦,
 *    所以为了解决这个问题, 就出现了import, 使用import可以导入其他类, 在当前类中就可以直接使用其他类, 不用再加上很长的包名.
 *
 * */

public class 包和import {
}
