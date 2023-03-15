package com.atguigu.map.exer;

import org.junit.Test;

import java.util.HashMap;
import java.util.Scanner;

/*
案例需求：

（1）从键盘输入本组学员的姓名和他的手机号码，存放到HashMap<K,V>中，
  泛型指定为<String,String>，姓名为key,手机号码为value，并且遍历显示

（2）再从键盘输入姓名，查询他的手机号码
 */
public class Exer {
    @Test
    public void test(){
        Scanner scan = new Scanner(System.in);
        HashMap<Object, Object> map = new HashMap<>();
        String name = null;
        String tele = null;
        for (int i=0;i<3;i++) {
            System.out.println("请输入姓名:");
            name = scan.next();
            System.out.println("请输入电话:");
            tele = scan.next();
            map.put(name, tele);
        }

        System.out.println("-----------");
        System.out.println("请输入要查询的姓名:");
        name = scan.next();
        tele = (String)map.get(name);
        System.out.println("tele = " + tele);
    }
}


