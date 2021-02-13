package com.company.IDEA学习.代码模板;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ShiWei
 * @date 2021/2/2 - 10:12
 *
 * 1. IDEA中代码模板所处的位置: settings-Editor-Live Templates/Postfix Completion
 * 2. 常用的模板:
 *    (1) 第一组: main方法
 *    (2) 第二组: 输出
 *    (3) 第三组: for循环
 *    (4) 第四组: list集合遍历
 *    (5) 第五组: if条件判断
 *    (6) 第六组: 常量
 *
 */
public class TemplatesTest {

    //模板一: psvm
    public static void main(String[] args) {

        //模板二: sout
        System.out.println("hello!");
        //变形: soutp(p:形参) / soutm(m:方法) / soutv(v:变量) / xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        int num1 = 10;
        int num2 = 20;
        System.out.println("num2 = " + num2);
        //num1.sout
        System.out.println(num1);

        //模板三: fori
        String[] arr = new String[]{"Tom", "Jerry", "HanMeimei", "Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形: iter(增强for循环) / itar(普通for循环)
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四: list.for(增强for循环)
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(124);
        list.add(125);
        for (Object o : list) {
            System.out.println("o = " + o);
        }
        //变形: list.fori(普通for循环) / list.forr(逆序普通for循环)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        //模板五: ifn
        if (list == null) {

        }
        //变形: inn
        if (list != null) {

        }
        //变形: xxx.nn / xxx.null
        if (list == null) {

        }
        if (list != null) {

        }

        //模板六: prsf
        //变形: psf / psfi / psfs




    }
}
