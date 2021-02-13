package com.company.IO流.decorator装饰者模式;

// 1. 装饰者模式中要求: 装饰者中含有被装饰者的引用.(关联关系)
public class BufferedReader { // bufferedreader是装饰者

    // 关联关系
    FileReader reader; // filereader就是被装饰者.

    // 构造方法
    BufferedReader(FileReader reader) {
        this.reader = reader;
    }

    // 对filereader中的close方法进行扩展
    public void close() {

        // 扩展
        System.out.println("扩展代码1");
        reader.close();
        System.out.println("扩展代码2");
    }
}
