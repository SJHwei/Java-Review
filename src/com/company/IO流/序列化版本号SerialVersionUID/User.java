package com.company.IO流.序列化版本号SerialVersionUID;

import java.io.Serializable;

public class User implements Serializable {

    // 不让系统自动生成, 自己写一个序列化版本号
    static final long serialVersionUID = 123123123L;

    // 如果不想让该属性参加序列化, 需要使用transient关键字修饰
    transient String name;

    public User(String name) {
        this.name = name;
    }

    public String toString() {
        return "...";
    }
}
