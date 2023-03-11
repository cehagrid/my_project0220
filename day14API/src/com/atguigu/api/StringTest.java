package com.atguigu.api;

import org.junit.Test;

import static java.nio.charset.StandardCharsets.UTF_8;

public class StringTest {
    @Test
    public void test(){
//todo:判断是否以指定字符串开始
        String s = "ABCDEFG";
        boolean startsWith = s.startsWith("AB");
        System.out.println(startsWith);
//替换
        String replace = s.replace("A", "!!");
        System.out.println("replace = " + replace);
    }
    @Test
    public void test1(){
        String s = "ABCDEFG";
        boolean endsWith = s.endsWith("G");
        System.out.println(endsWith);

    }
    @Test
    public void test2(){
        String s = "A B C D E FG";
        String[] s1 = s.split(" ");
        for (String s2 : s1) {
            System.out.println("s2 = " + s2);

        }

    }
    @Test
    public void test3(){
        String s = "A 1B 2C3 D 4E 10FG";
        String[] s1 = s.split("[0-9]");
        for (String s2 : s1) {
            System.out.println("s2 = " + s2);

        }
    }
    @Test
    public void test4(){
        String s = "中国国";
        byte[] bytes = s.getBytes(UTF_8);
        byte[] bytes1 = "ABCDEFGHIGKLMNOPQRSTUVWXYZ".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println("bytes[i] = " + bytes[i]);
        }
        System.out.println("--------------------------------");
        for (int i = 0; i < bytes1.length; i++) {
            System.out.println("bytes1[i] = " + bytes1[i]);
        }
        System.out.println("--------------------------------");

        System.out.println("new String(bytes) = " + new String(bytes));
        System.out.println("new String(bytes1) = " + new String(bytes1));

    }
    @Test
    public void test5(){

        String s = "test";
        String s1 = "atest";
        String ss = s+s1;
        String s2 = "testatest";
        System.out.println("ss == s2 :" + (ss == s2));
        //intern先用equal对比常量池有没有,常量池有返回地址,没有存到常量池
        System.out.println("ss == s2 :" + (ss.intern() == s2));

//        string传入函数常量时相当于变量传入,不会改变外部的数据

    }
}


