package com.company.反射机制.反射Constructor.反编译Constructor;

/**
 * @author ShiWei
 * @date 2021/2/26 - 10:49
 */
public class Vip {
    int no;
    String name;
    String birth;
    boolean sex;

    public Vip(int no) {
        this.no = no;
    }

    public Vip() {

    }

    public Vip(int no, String name, String birth, boolean sex) {
        this.no = no;
        this.name = name;
        this.birth = birth;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", sex=" + sex +
                '}';
    }
}
