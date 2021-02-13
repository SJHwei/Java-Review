package com.company.常用类.stringbuffer和stringbuilder类;

/**
 * 1. 说明:
 *    (1) java.lang.stringbuffer和java.lang.stringbuilder是一个字符串缓冲区.
 *    (2) stringbuffer和stringbuilder的默认初始化容量是16.
 *
 * 2. 工作原理: 预先在内存中申请一块空间, 以容纳字符序列, 如果预留的空间不够用, 则进行自动扩容, 以容纳更多字符序列.
 *
 * 3. 如何优化它们: 最好在创建stringbuffer之前, 预测stringbuffer的存储字符数量,
 *                 然后在创建stringbuffer的时候采用指定初始化容量的方式创建stringbuffer.
 *                 这是为了减少底层数组的拷贝, 提高效率.
 *
 * 4. 它们和string最大的区别:
 *    (1) string是不可变的字符序列. 底层是一个字符数组, 类型是final, 所以是不可变的, 存储在字符串常量池中.
 *    (2) stringbuffer底层是一个char数组, 但是该数组是可变的(即不是final类型的), 并且可以自动扩容.
 *
 * 5. 它们之间的区别:
 *    (1) stringbuffer是线程安全的. (可以在多线程的环境下使用不会出现问题)
 *    (2) stringbuilder是非线程安全的. (在多线程环境下使用可能出现问题)
 *
 * 6. 注意: 推荐字符串频繁拼接使用stringbuffer或者stringbuilder. 它们都有append和insert方法, 用于向缓冲区中添加元素.
 * */
public class stringbuffer和stringbuilder类 {

    public static void main(String[] args) {

        //创建字符串缓冲区对象
        StringBuffer sb = new StringBuffer(); //默认16, 最好创建一个指定容量的对象, 减少数组的拷贝次数, 提高效率.

        //可以项stringbuffer中追加字符串
        String[] ins1 = {"体育", "音乐", "睡觉", "美食"};

        //推荐字符串频繁拼接使用stringbuffer或者stringbuilder
        //String[] ins2 = {"体育", "音乐"};

        for(int i = 0; i < ins1.length; i++) {
            if(i == ins1.length - 1) {
                sb.append(ins1[i]);
            } else {
                sb.append(ins1[i]);
                sb.append(".");
            }
        }

        System.out.println(sb);
    }
}
