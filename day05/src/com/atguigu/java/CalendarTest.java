package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
}


























