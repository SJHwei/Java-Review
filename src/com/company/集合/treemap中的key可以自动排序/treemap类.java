package com.company.集合.treemap中的key可以自动排序;

import java.util.*;

/**
 * 1. treemap类是sortedmap接口的实现类. [默认从小到大排序]
 * 2. sortedmap中的key特点: 无序不可重复, 但是存进去的元素可以按照大小自动排序,
 *   如果想要自动排序, key部分的元素需要实现comparable接口或者单独写一个比较器.
 * 3. sortedmap接口和treemap类是对key进行排序. 所以需要key实现comparable接口或者单独写一个比较器.
 * */
public class treemap类 {

    public static void main(String[] args) {

        //map, key存储product, value存储重量
//        SortedMap products = new TreeMap();
        SortedMap products = new TreeMap(new ProductComparator());

        //准备对象
        Product1 p1 = new Product1("西瓜", 1.0);
        Product1 p2 = new Product1("苹果", 5.1);

        //添加
        products.put(p1, 8.0);
        products.put(p2, 3.0);

        //遍历
        Set keys = products.keySet();
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            Object k = it.next();
            Object v = products.get(k);
            System.out.println(k + "--->" + v + "kg");
        }
    }
}

//实现comparable接口
class Product1 implements Comparable {

    String name;
    double price;

    Product1(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public String toString() {
        return "Product1[name=" + name + ",price=" + price + "]";
    }

    //实现compareto方法
    //需求: 按照商品价格排序
    public int compareTo(Object o) {

        double price1 = this.price;
        double price2 = ((Product1)o).price;

        if(price1 < price2) {
            return -1;
        } else if (price1 > price2) {
            return 1;
        } else {
            return 0;
        }
    }
}

class ProductComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        double price1 = ((Product1)o1).price;
        double price2 = ((Product1)o2).price;

        if (price1 < price2) {
            return -1;
        } else if (price1 > price2) {
            return 1;
        } else {
            return 0;
        }
    }
}