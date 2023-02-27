package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    @Test
    public void test() throws ParseException {
        Date date1 = new Date();
        System.out.println("解析前:"+date1);
        SimpleDateFormat sdf = new SimpleDateFormat();
        String strDate = sdf.format(date1);
        System.out.println("sdf解析后："+strDate);

        System.out.println("----------------------------------");

        Date parseDate = sdf.parse("2023/2/27 08:55");
        System.out.println("parse解析前："+parseDate);
    }

    @Test
    public void CalendarTest(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());

        //测试get(int field)
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        System.out.println("set()演示-----------------------");
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//今天是本月第几天

        //set(int field,xx)
        calendar.set(Calendar.DAY_OF_MONTH,23);//设置为23天
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println("add()演示--------------------------");
        //add(int field,xx)
        calendar.add(Calendar.DAY_OF_MONTH,3);//+3天
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println("getTime()演示----------------------");
        //Calendar --> Date
        Date date = calendar.getTime();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println(sdf.format(date));
        sdf = new SimpleDateFormat("EEE yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));

        System.out.println("setTime()演示----------------------");
        //相当于重置了
        Date date1 = new Date();
        calendar.setTime(date1);
        //周几要-1，第几个月要+1
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)-1);
        System.out.println(calendar.get(Calendar.MONTH)+1);

    }

    /*
     *练习:如何将一个java.util.Date的实例转换为java.sql.Date的实例
     */
    @Test
    public void DateTransfer(){
        Date date = new Date();
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        System.out.println(date1);

    }

    /*
     *拓展:
     * 将控制台获取的年月日（比如: 2022-12-13）的字符串数据，保存在数据库中。
     * (简化为得到java.sql.Date的对象，此对象对应的时间为2022-12-13).
     * ★字符串---> java.util.Date ---> java.sql.Date
     */
    //解析成date，格式化成字符串
    @Test
    public void test1() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2022-12-13");
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        System.out.println(date1);

    }
}


























