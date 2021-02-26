package com.company.反射机制.反射Constructor.获取Constructor;

/**
 * @author ShiWei
 * @date 2021/2/26 - 11:37
 *
 * 1. 通过类获取Constructor:
 *    (1) 获取类中所有public修饰的Constructor: Constructor[] constructor = 类.getConstructors();
 *        注意: Class类中的一个成员方法: getConstructors()该方法只能获取public修饰的.
 *    (2) 获取所有的Constructor: Constructor[] cs = 类.getDeclaredConstructors();
 *        注意: Class类中的一个成员方法: getDeclareConstructors()该方法能获取所有的.
 *    (3) 通过方法名和参数列表来获取特定的Constructor(单个Constructor): Constructor constructor = 类.getDeclaredConstructor(参数类型1, ...);
 *        注意: 获取到构造方法之后, 通过Constructor类的一个成员方法newInstance(实参)来创建对象.
 *
 * 2. 获取Constructor的名字, 修饰符, 参数类型:
 *    (1) 获取名字:
 *        Constructor类中一个成员方法: getName().
 *        注意: 由于构造方法和类名相同, 所以可以通过类来获取名字.
 *    (2) 获取修饰符:
 *        Constructor类中一个成员方法: getModifiers().
 *    (3) 获取参数类型列表:
 *        Constructor类中一个成员方法: getParameterTypes().
 *
 * 3. 重点:
 *    (1) 将获取修饰符时返回的代号数字转换成字符串: String s = Modifier.toString(i);
 *    (2) 获取类型时要注意: 返回值是Class类型, 因为类型是Class类型;
 *    (3) getConstructors(), getDeclaredConstructors()和getDeclaredConstructor()是Class的成员方法, 只能用来获取Constructor, 通过Constructor的一个成员方法newInstance()来创建对象.
 *
 */
public class 获取Constructor {
}
