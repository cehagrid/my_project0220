package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

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

    /**
     * @description: P147-P148
     * -可变性:像日期和时间这样的类应该是不可变的。
     * -偏移性: Date中的年份是从1900开始的，而月份都从0开始。
     * -格式化:格式化只对Date有用，Calendar则不行。
     * -此外，它们也不是线程安全的;不能处理闰秒等。
     *
     * @author: liy
     * @date: 2023/2/27 19:57
     * @param:
     * @return:
     */
    @Test
    public void test2(){
        String s1 = "hello";
        String s2 = s1.replace('l','o');//String的不可变性
        System.out.println(s1);//hello

        //体会Calendar的可变性
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH,23);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("---------------");
        //有偏移量年（1900）月（0）
        Date date = new Date(2023, 2, 27);
        System.out.println(date);


    }

    /*
    JDK 8 新增TimeAPI 以后用这个
    LocalTime、LocalDate、LocalDateTime
     */
    @Test
    public void test3(){
        //now()获取当前的时间和对应的实例
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate: "+localDate);//2023-02-27
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime: "+localTime);//20:12:23.159081400
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: "+localDateTime);//2023-02-27T20:12:23.159081400

        //of():获取指定的日期时间的实例
        LocalDate localDate1 = LocalDate.of(2021, 5, 23);
        System.out.println("LocalDate.of(2021, 5, 23): "+localDate1);
        LocalTime localTime1 = LocalTime.of(19, 59, 30);
        System.out.println("LocalTime.of(19, 59, 30): "+localTime1);
        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 12, 21, 13, 13, 13);
        System.out.println("LocalDateTime.of(2022, 12, 21, 13, 13, 13): "+localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.of(0, 1, 1, 0, 0, 0);
        System.out.println(localDateTime2);

    }

    //Instant
    @Test
    public void test4(){
        System.out.println("-Instant--------------------------");
        Instant instant = Instant.now();
        System.out.println(instant);
//        instant.atOffset();
    }

    //DateTimeFormatter
    @Test
    public void test5(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE yyyy-MM-dd HH:mm:ss");
        String format = dtf.format(LocalDateTime.now());
        System.out.println(format);

    }
    //Duration：时间间隔（s、ns） / Period:时间间隔，年月日
    @Test
    public void test6(){
        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = LocalTime.of(19, 22, 32);
        Duration between = Duration.between(localTime1, localTime2);
        System.out.println(between);

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2021, 12, 4);
        Period period = Period.between(localDate1, localDate2);
        System.out.println(period);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
        System.out.println("----------------------");

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime start = LocalDateTime.of(2000, 12, 4, 12, 12, 23);
        String format = now.format(DateTimeFormatter.ofPattern("EEE yyyy-MM-dd HH:mm:ss"));
        String format1 = start.format(DateTimeFormatter.ofPattern("EEE yyyy-MM-dd HH:mm:ss"));
        Duration between1 = Duration.between(now, start);
        System.out.println(between1.toMillis());
        System.out.println(between1.toDays());//间隔天数
        System.out.println(between1);
    }
}


























