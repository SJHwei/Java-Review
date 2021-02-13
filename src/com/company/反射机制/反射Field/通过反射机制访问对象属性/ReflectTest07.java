package com.company.反射机制.反射Field.通过反射机制访问对象属性;

import com.company.反射机制.反射Field.获取Field.Student;

import java.lang.reflect.Field;

/**
 * @author ShiWei
 * @date 2021/2/6 - 9:35
 *
 * 怎么通过反射机制访问一个java对象的属性?
 *     给属性赋值set
 *     获取属性的值get
 */
public class ReflectTest07 {

    public static void main(String[] args) throws Exception {

        //不使用反射机制, 怎么访问一个对象的属性?
        Student s = new Student();

        //给属性赋值
        s.no = 1111;
        //三要素: 给s对象的no赋值1111
        //要素1: 对象s
        //要素2: no属性
        //要素3: 1111

        //读属性值
        //两个要素: 获取s对象的no属性的值
        System.out.println(s.no);

        //使用反射机制, 怎么去访问一个对象的属性. (set get)
        Class studentClass = Class.forName("com.company.反射机制.反射Field.获取Field.Student");
        //要素1: 对象obj
        Object obj = studentClass.newInstance(); //obj就是Student对象. (底层调用无参数构造方法)
        //要素2: no属性
        //获取no属性(根据属性的名称来获取Field)
        Field noField = studentClass.getDeclaredField("no");

        //给obj对象(Student对象)的no属性赋值
        /*
        * 虽然使用了反射机制, 但是三要素还是缺一不可:
        *     要素1: obj对象;
        *     要素2: no属性;
        *     要素3: 2222值.
        * 注意: 反射机制让代码复杂了, 但是为了一个灵活, 这也是值得的.
        * */
        //要素3: 2222值
        noField.set(obj, 2222); //给obj对象的no属性赋值2222

        //读取属性的值
        //两个要素: 获取obj对象的no属性的值
        System.out.println(noField.get(obj));

        //可以访问私有的属性吗? 不可以, 要想访问, 要打破封装.
        Field nameField = studentClass.getDeclaredField("name");

        //打破封装(反射机制的缺点: 打破封装, 可能会给不法分子留下机会!!!)
        //这样设置完后, 在外部也是可以访问private的.
        nameField.setAccessible(true);

        //给name属性赋值
        nameField.set(obj, "jackson");
        //获取name属性的值
        System.out.println(nameField.get(obj));
    }
}
