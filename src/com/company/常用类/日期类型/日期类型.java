package com.company.常用类.日期类型;

import com.sun.source.tree.NewArrayTree;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 1. 常用日期类(三种):
 *    (1) java.util.Date
 *    (2) java.text.SimpleDateFormat
 *    (3) java.util.Calendar
 *
 * 2. Date类:
 *    (1) 作用: 得到一个日期对象, 并对日期对象进行操作
 *    (2) 构造方法(两种):
 *        1> 参数为空
 *        2> 参数为年, 月, 日等
 *
 * 3. SimpleDateFormat类:
 *    (1) 作用: 该类是一个日期格式化类, 专门用来格式化日期的(java.util.Date).
 *    (2) 构造方法: simpledateformat(string pattern) [用给定的模式和默认语言环境的日期格式符号构造simpledateformat]
 *    (3) 成员方法: string format(Date date) [将一个Date格式化为日期/时间字符串]
 *    (4) 得到格式化日期的流程:
 *        1> 创建日期格式化对象
 *        2> 开始格式化(date --> string) [将Date类型转换为string类型]
 *
 * 4. Calendar类:
 *    (1) 作用: 获得日历对象, 并对日历对象进行操作
 *    (2) 该类中有字段有方法.
 *
 * 5. 获取系统当前时间一般使用Date类:
 *    (1) 构造方法:
 *        1> 无参数构造方法作用: 获取系统当前时间(Date nowTime = new Date())
 *           输出的结果的格式对外国人友好, Date类已经重写了tostring方法. 只不过结果对于中国人讲不太容易理解, 所以引入格式化日期.
 *        2> 参数为long类型的构造方法作用: 获取系统当前时间的前多少的时间
 *           (date d = new date(long millis)): 可以得到一个自1970年1月1日00时00分00秒000毫秒加上millis毫秒数后的Date日期
 *           Date t = new Date(1000): 得到一个自1970年1月1日00时00分00秒000毫秒加上1000毫秒数后的Date日期
 *           System.currentTimeMillis(): 获取自自1970年1月1日00时00分00秒000毫秒到当前的毫秒数
 *           Date t = new Date(System.currentTimeMillis()-millis): 获取当前系统时间的前millis的时间.
 *    (2) 引入格式化日期(使用simpledateformat类): Date --> string
 *    (3) 日期格式(simpledateformat类中用到): 年(y), 月(M), 日(d), 小时(H), 分(m), 秒(s), 毫秒(S).
 *
 * 6. 获取特定的日期: (将给定的string日期转换成日期类型Date(string-->Date))
 *    (1) 字符串格式: 使用simpledateformat类创建日期格式化对象时, 格式不能随意, 应该和给定的字符串格式相同.
 *    (2) Date parse(strtime): simpledateformat类的父类中的一个方法, 将字符串转换成日期类型, parse方法抛出异常, 所以需要处理.
 *    (3) 获取特定的日期的流程:
 *        1> 创建日期格式化对象
 *        2> 将字符串转换成日期类型
 *
 * */
public class 日期类型 {

    public static void main(String[] args) throws Exception {

        Date nowTime = new Date();

        //得到格式化日期的流程:
        //1.创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
        //2.开始格式化(date-->string)
        String strTime = sdf.format(nowTime);
        System.out.println(strTime);

        String strTime1 = "2008年8月8日 08:08:08 008";
        //将string日期转换成日期类型Date
        //string --> date

        //获取特定的日期的流程:
        //1.创建日期格式化对象
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS"); //格式不能随意, 应该和上面的字符串格式相同
        //2.将字符串转换成日期类型
        Date t = sdf.parse(strTime);
        System.out.println(t); //英文格式的日期

        //1000是自1970-1-1 00:00:00 000的毫秒数
        Date t1 = new Date(1000);
        //Date-->string
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy,MM,dd HH:mm:ss SSS");
        //北京东八区
        System.out.println(sdf3.format(t1)); //1970-1-1 00:00:01 000
        //获取当前系统时间的前10分钟时间
        Date t2 = new Date(System.currentTimeMillis()-1000*60*10);
        System.out.println(sdf3.format(t2));
        System.out.println(sdf3.format(new Date())); //系统当前时间

        //获取系统当前的日历
        Calendar c = Calendar.getInstance();
        //查看当前日历的"星期几"
        int i = c.get(Calendar.DAY_OF_WEEK);
        int i1 = c.get(7);
        System.out.println(i); //3(中国星期日, 外国人看做第一个天)
        System.out.println(c.get(Calendar.DAY_OF_MONTH)); //31

        //获取2008 8 8是星期几?
        //获取2008 8 8的日历
        String strtime = "2008, 08, 08";
        Date d = new SimpleDateFormat("yyyy, MM, dd").parse(strtime);
        //该日历就是2008 08 08的日历
        c.setTime(d); //将日历对象设置为2008 08 08的日历
        //获取星期几
        System.out.println(c.get(Calendar.DAY_OF_WEEK)); //6
    }
}
