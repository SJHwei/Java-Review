package com.company.集合.单向链表和双向链表;

/*
* 使用java语言模拟单向链表
* */
public class Linked {

    // 节点
    // Field
    Entry entry;

    // Constructor
    Linked() {

        // 只有一个头结点
        entry = new Entry(null, null);
    }

    // add
    public void Add(Object data) {
        Entry entry1 = new Entry(data, null);
        this.entry.next = entry1;
    }

    static class Entry {

        // Field
        Object data;
        Entry next;

        // Constructor
        Entry(Object data, Entry next) {
            this.data = data;
            this.next = next;
        }
    }
}
