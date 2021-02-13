package com.company.反射机制.反射Field.获取Field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author ShiWei
 * @date 2021/2/3 - 11:03
 *
 * 反射Student类当中所以的Field
 * 
 */
public class ReflectTest05 {

    public static void main(String[] args) throws Exception {
        //获取整个类
        Class studentClass = Class.forName("com.company.反射机制.反射Field.获取Field.Student");

        //获取类的名字
        String className = studentClass.getName();
        System.out.println("完整类名: " + className);
        String simpleName = studentClass.getSimpleName();
        System.out.println("简类名: " + simpleName);

        //获取类中所有的public修饰的Field
        Field[] fields = studentClass.getFields();
        System.out.println(fields.length); //测试数组中有两个元素
        //取出这个Field
        Field f = fields[0];
        //取出这个Field它的名字
        String fieldName = f.getName();
        System.out.println(fieldName);

        //获取所有的Field
        Field[] fs = studentClass.getDeclaredFields();
        System.out.println(fs.length); //5

        System.out.println("========================");
        //遍历
        for (Field field : fs) {

            //获取属性的修饰列表
            int i = field.getModifiers(); //返回的修饰符是一个数字, 每个数字是修饰符的代号!!!
            System.out.println(i);
            //可以将这个代号数字转换成字符串吗?
            String modifierString = Modifier.toString(i);
            System.out.println(modifierString);

            //获取属性的类型
            Class fieldType = field.getType(); //注意: 类型也是Class类型.
            String fName = fieldType.getSimpleName();
            System.out.println(fName);

            //获取属性的名字
            System.out.println(field.getName());


        }



    }
}
