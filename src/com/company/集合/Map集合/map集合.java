package com.company.集合.Map集合;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 1. map集合中常用的方法:
 *    (1) 创建map集合: hashmap的默认初始化容量是16, 默认加载因子是0.75.
 *
 *    (2) 存储键值对: put(object key, object value) [注意: map中如果key重复了, value采用的是"覆盖"]
 *    (3) 判断键值对的个数: size() (map中的key是无序不可重复的, 和hashset相同)
 *
 *    (4) 判断集合中是否包含这个的key: containsKey(object key)
 *    (5) 判断集合中是否包含这样的value: containsValue(object value)
 *
 *    (6) 通过key获取value: get(object key)
 *    (7) 通过key删除键值对: remove(object key)
 *
 *    (8) 获取所有的value: values() [返回值类型是Collection]
 *    (9) 获取所有的key: keySet() [返回值类型是Set]
 *
 *    (10) 将map集合转换成set集合: entrySet()
 *
 * 2. 关于集合的转换:
 *    (1) 将collection集合转换为数组: toArray() [collection接口的一个方法: 返回包含此集合中所有元素的数组.]
 *    (2) 将map集合转换成set集合: entrySet() [map接口的一个方法]
 *
 * 3. Map集合的实现类说明:
 *    (1) hashset底层是hashmap, 相当于hashmap中的key. hashmap中的key要重写hahscode和equals方法.
 *    (2) sortedset相当于sortedmap中的key.
 *    (3) treemap的key就是一个treeset.
 *    注意: sortedmap或treemap需要实现comparable接口或者单独写个比较器.
 *
 * */
public class map集合 {

    public static void main(String[] args) {

        //1. 创建map集合
        Map persons = new HashMap();

        //2. 存储键值对
        persons.put("1", "jack");
        persons.put("2", "sun");

        //3. 判断键值对的个数
        //map中的key是无序不可重复的, 和set相同
        System.out.println(persons.size());

        //4. 判断集合中是否包含这样的key
        System.out.println(persons.containsKey("1"));

        //5. 判断集合中是否包含这样的value
        System.out.println(persons.containsValue("jack"));

        //6. 通过key获取value
        String k = "1";
        Object o = persons.get(k);

        //7. 通过key删除键值对
        persons.remove("1");

        //8. 获取所有的value
        Collection values = persons.values();

        //9. 获取所有的key
        Set keys = persons.keySet();

        //10. 将map集合转换成set集合
        Set sets = persons.entrySet();

    }
}
