package com.company.IO流.序列化版本号SerialVersionUID;

/**
 * 1. 问题: 一个类实现了serializable接口, 则jvm对它的特殊待遇是什么?
 *
 * 2. 答案: 如果一个类实现了serializable接口(例如: User类), jvm会特殊待遇: 会给该类添加一个属性, static final long serialversionUID = ...
 *
 * 3. 注意: 可以不让系统自动生成, 自己写一个序列化版本号.
 *
 * 4. 重点: 如果不想让一个已经实现serializable接口的对象的一个属性参加序列化, 则需要使用transient关键字修饰.
 * */
public class 序列化版本号SerialVersionUID {
}
