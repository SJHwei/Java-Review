package com.company.IO流.decorator装饰者模式;

/**
 * 1. 问题: 对软件升级, 也就是在原代码的基础上进行扩展而不修改原代码有两种方法.
 *    (1) 方法一: 继承, 重写方法.(不推荐, 代码耦合度太高, 不利于项目的扩展)
 *    (2) 方法二: 装饰者模式.
 *
 * 2. 基本步骤:
 *    (1) 第一步是创建被装饰者;
 *    (2) 第二步是创建装饰者;
 *    (3) 第三步是通过执行装饰者中的方法间接去执行被装饰者中的方法.
 *
 * 3. 要求(重点):
 *    (1) 装饰者中含有被装饰者的引用;
 *    (2) 装饰者和被装饰者应该实现同一个接口/类型.(例如: 都继承同一个抽象类)
 *
 * 4. 实例: 使用bufferedreader对filereader中的close犯法进行扩展.
 *    (1) bufferedreader是装饰者, filereader是被装饰者.
 *    (2) bufferedreader和filereader是关联关系.
 *    (3) 之所以只关闭装饰者就可以了, 是因为装饰者中的对被装饰者的引用也就通过调用close方法关闭了.
 *    (4) (重点)通过让bufferedreader和filereader继承抽象类reader使得它们两个的关系就彻底不大了.
 *        则在装饰者中含有的就不再是被装饰者的引用了, 而是抽象类reader的引用.(多态)
 *
 * */
public class decorator {

    public static void main(String[] args) {

        // 1. 创建被装饰者
        FileReader fr = new FileReader();

        // 2. 创建装饰者
        BufferedReader br = new BufferedReader(fr);

        // bufferedreader br = new bufferedreader(new filereader());

        // 3. 通过执行装饰者中的方法间接去执行别装饰者中的方法.
        br.close();
    }
}

