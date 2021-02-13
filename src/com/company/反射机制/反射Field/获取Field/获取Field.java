package com.company.反射机制.反射Field.获取Field;

/**
 * @author ShiWei
 * @date 2021/2/3 - 10:44
 *
 * 1. 通过类获取Field
 *    (1) 获取类中所有的public修饰的Field: Field[] fields = 类.getFields();
 *        注意: Class类中的一个成员方法: getFields()该方法只能获取public修饰的.
 *    (2) 获取所有的Field: Field[] fs = 类.getDeclaredFields();
 *        注意: Class类中的一个成员方法: getDeclaredFields()该方法能获取所有的.
 *    (3) 通过属性的名称来获取特定的Field(单个Field): Field field = 类.getDeclaredField("属性的名称");
 *        注意: 获取到的属性不能直接访问, 要想访问, 必须打破封装. 方式: 使用Field的一个成员方法setAccessible(true). 参数为true表示打破封装.
 *
 *
 * 2. 获取Field的名字, 类型, 修饰符
 *    (1) 获取名字:
 *        Field类中的一个成员方法: getName().
 *    (2) 获取类型:
 *        Field类中的一个成员方法: getType().
 *    (3) 获取修饰符:
 *        Field类中的一个成员方法: getModifiers().
 *
 * 3. 注意:
 *    都是字符串.
 *
 * 4. 重点:
 *    (1) 将获取修饰符时返回的代号数字转换成字符串: String s = Modifier.toString(i);
 *    (2) 获取类型时要注意: 返回值是Class类型, 因为类型是Class类型.
 *    (3) getFields(), getDeclaredFields()和getDeclaredField()是Class的成员方法, 只能用来获取Field, 访问要使用Field的成员方法set和get.
 *        但是有一点要注意, 就是不能访问私有的, 要想访问, 要先使用Field的一个成员方法setAccessible(true)来打破封装.
 */
public class 获取Field {
}
