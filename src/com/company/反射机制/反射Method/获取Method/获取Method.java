package com.company.反射机制.反射Method.获取Method;

/**
 * @author ShiWei
 * @date 2021/2/19 - 17:29
 *
 * 1. 通过类获取Method:
 *    (1) 获取类中所有public修饰的Method: Method[] methods = 类.getMethods();
 *        注意: Class类中的一个成员方法: getMethods()该方法只能获取public修饰的.
 *    (2) 获取所有的Method: Method[] ms = 类.getDeclaredMethods();
 *        注意: Class类中的一个成员方法: getDeclareMethods()该方法能获取所有的.
 *    (3) 通过方法名和参数列表来获取特定的Method(单个Method): Method method = 类.getDeclaredField("方法名", 参数类型1, ...);
 *        注意: 获取到方法之后, 使用Method类的一个成员方法invoke()来调用该方法: 返回值 = 方法名.invoke(对象, 实参1, ...).
 *
 * 2. 获取Method的名字, 返回值类型, 修饰符, 参数类型:
 *    (1) 获取名字:
 *        Method类中一个成员方法: getName().
 *    (2) 获取返回值类型:
 *        Method类中一个成员方法: getReturnType().
 *    (3) 获取修饰符:
 *        Method类中一个成员方法: getModifiers().
 *    (4) 获取参数类型列表:
 *        Method类中一个成员方法: getParameterTypes().
 *
 * 3. 重点:
 *    (1) 将获取修饰符时返回的代号数字转换成字符串: String s = Modifier.toString(i);
 *    (2) 获取类型时要注意: 返回值是Class类型, 因为类型是Class类型;
 *    (3) getMethods(), getDeclaredMethods()和getDeclaredMethod()是Class的成员方法, 只能用来获取Method, 调用要使用Method的成员方法invoke().
 *
 */
public class 获取Method {
    public static void main(String[] args) {

    }
}
