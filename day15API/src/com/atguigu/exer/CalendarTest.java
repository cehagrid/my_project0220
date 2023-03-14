package com.atguigu.exer;

import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) throws ParseException {
//        Date birthdayDate = new Date();
//        Date nowDate = new Date();
        //创建键盘输入对象
        Scanner scan =  new Scanner(System.in);
        System.out.println("请输入你的出生年月日：");
        //接收数据
        String s = scan.next();
        //创建日期格式化对象
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        //将字符串--->日期对象
        Date birthdayDate = df.parse(s);
        //获取日期对象转换的毫秒
        long startTime = birthdayDate.getTime();
        //获取当前毫秒
        long nowTime = System.currentTimeMillis();
        //相减输出结果
        long l = nowTime - startTime;
        System.out.println(l/86400000);
    }

    @Test
    public void test(){
        //判断是否为闰年
        LocalDate localDate = LocalDate.now();
        boolean leapYear = localDate.isLeapYear();
        System.out.println(leapYear);
        System.out.println("-------------------------");
        //判断是否为闰年
        LocalDate localDate1 = LocalDate.of(2100,2,28);
        boolean leapYear1 = localDate1.isLeapYear();
        System.out.println(leapYear1);
    }

}



