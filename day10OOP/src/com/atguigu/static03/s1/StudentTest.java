package com.atguigu.static03.s1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StudentTest {
    public static void main(String[] args) {
        Student.Country = "中国";
        Student s1 = new Student("安琪拉", 20, 98.5, '女');

        Student s2 = new Student("项羽", 32, 91.5, '男');

        Student s3 = new Student("元歌", 21, 99.9, '男');

        Student s4 = new Student("上官婉儿", 23, 99.8, '女');

    }

    @Test
    public void test() {
        System.out.println("君子藏器于身,待时而动!");
    }

    @Before
    public void before() {
        System.out.println("我 就是太阳!");
    }

    @After
    public void after() {
        System.out.println("浮华,盛世!");
    }

}


































