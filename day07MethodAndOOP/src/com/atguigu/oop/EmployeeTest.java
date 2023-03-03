package com.atguigu.oop;

import java.util.Date;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "张三";
        employee1.birthday.setYear(2000);
        employee1.birthday.setMonth(1);
        employee1.birthday.setDay(1);
        System.out.println(employee1.birthday);
    }
}


