package com.company.常用类.String类;

/**
 * 1. 字符串说明:
 *    (1) java.lang.String: 是字符串类型;
 *    (2) 字符串一旦创建不可再改变.
 *
 * 2. 提升字符串的访问效率: (字符串常量池)
 *    (1) 在程序中使用了缓存技术, 在java中所有使用""括起来的字符串都会在字符串常量池中创建一份.
 *        在程序执行过程中, 如果程序用到某个字符串, 例如: "abc", 那么程序会在字符串常量池中去搜索该字符串,
 *        如果没有找到则在字符串常量池中新建一个"abc"字符串, 如果找到就直接拿过来用.
 *    (2) 字符串常量池在方法区中被存储.
 *    (3) 字符串常量池是一个缓存区, 为了提高访问字符串的效率.
 *    (4) 分析一下程序创建字符串对象使用new和不使用new的区别:
 *        1> 不使用new: 只会在字符串常量池中创建一个字符串对象;
 *        2> 使用new: 不仅会在字符串常量池中创建一个字符串对象, 还会在堆中在创建一个字符串对象.
 *    (5) 结论: 创建字符串对象时尽量不使用new创建.
 *
 * 3. 字符串常用的六种构造方法:
 *    (1) 字符串字面值直接赋值(推荐);
 *    (2) 参数为字符串的构造方法;
 *
 *    (3) 参数为byte数组的构造方法(ASCII);
 *    (4) 参数为byte数组, 并且可以指定范围的构造方法;
 *
 *    (5) 参数为字符串数组的构造方法;
 *    (6) 参数为字符串数组, 并且可以指定范围的构造方法.
 *
 *    注意: 只有第一种不需要new, 剩下的5种都需要new.
 *
 * 4. 字符串常用方法:
 *    (1) char charAt(int index): 返回指定索引处的char值.
 *    (2) int length(): 返回此字符串的长度. [数组是length属性, string是length()方法.]
 *    (3) boolean equalsIgnoreCase(sting anotherString): 将此string与另一个string比较, 忽略大小写.
 *    (4) string replaceAll(string regex, string replacement): 使用给定的replacement替换此字符串所有匹配给定的正则表达式的字符串.
 *        (regex既可以是普通字符串/字符, 也可以是正则表达式)
 *    (5) string trim(): 去掉此字符串的前后空格.
 *
 *    (6) boolean endWith(String endstr): 测试此字符串是否以指定的后缀结束.
 *    (7) boolean startWith(string str): 测试此字符串是否以指定的前缀开始.
 *
 *    (8) byte[] getBytes(): 将字符串转换成byte数组.
 *    (9) char[] toCharArray(): 将此字符串转换为一个新的字符数组. (将字符串转换为char数组)
 *    (10) string[] split(string regex): 根据给定正则表达式的匹配拆分此字符串. (将字符串转换为字符串数组)
 *
 *    (11) int indexOf(string str): 返回指定字符串在此字符串中第一次出现的索引.
 *    (12) int indexOf(string str, index fromIndex): 返回指定字符串在此字符串中第一次出现的索引, 从指定的索引开发.
 *    (13) int lastIndexOf(string str): 返回指定字符串在此字符串中最右边出现的索引.
 *    (14) int lastIndexOf(string str, int fromIndex): 返回指定字符串在此字符串中最后一次出现的索引, 从指定的索引开始反向搜索.
 *
 *    (15) string substring(int beginIdndex): 截取字符串.
 *    (16) string substring(int beginIndex, int endIndex): 返回一个新的字符串, 它是此字符串的一个子字符串.(截取字符串)
 *
 *    (17) string toUpperCase(): 将此字符串中所有的字符都转换为大写.
 *    (18) string toLowerCase(): 将此字符串中所有的字符都转换为小写.
 *
 *    (19) static string valueOf(Object obj): 返回object参数的字符串表示形式.
 *         注意1: 该方法是静态方法.
 *         注意2: valueOf()方法的参数有好多种, 可以是基本类型, 可以是字符数组, 可以是引用类型.
 *                如果是基本类型和字符数组, 则直接返回字符串表示形式;
 *                如果是引用类型, 则要调用该对象的toString方法, 返回object的字符串表示形式.
 *         注意3: 当声明一个空引用时, 如果直接输出该引用, 则不会出现空指针异常, 因为输出时并不是直接调用tostring方法, 而是调用valueOf方法,
 *                valueof方法再去调用tostring方法, valueof方法对空值进行处理了; 如果输出时显示调用了tostring方法, 则会出现空指针异常.
 *
 *    (20) boolean matches(string regex): 告知此字符串是否匹配给定的正则表达式.
 *
 * 5. 正则表达式初步
 *    (1) 说明: 正则表达式是一种字符模型, 专门做字符串格式匹配的.
 *    (2) 注意: java语言中, \具有特殊意义, \\才能表示正常的反斜杠.
 *
 * 6. 注意:
 *    (1) 使用string时应该注意的问题: 尽量不要做字符串频繁的拼接操作. 因为字符串一旦创建不可改变,
 *        只要频繁拼接, 就会在字符串常量池中创建大量的字符串对象, 给垃圾回收带来问题.
 *    (2) 比较两个字符串是否相等, 不能使用==, 必须使用string类提供的equals方法.
 *    (3) 在java中new时, 是在堆区中分配空间.
 *
 * 7. 总结: String类有六个重点, 分别是一个特点(一旦创建不再改变), 字符串常量池, 六种构造方法, 常用方法, 正则表达式, 一个注意点(不要有频繁拼接操作, 如果需要使用stringbuffer和stringbuilder类).
 * */
public class String类 {
}
