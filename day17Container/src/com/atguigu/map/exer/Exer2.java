package com.atguigu.map.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

/*
案例需求：
（1）创建HashMap对象，泛型为<Integer, ArrayList<String>>，

（2）存储咱们班每组学员信息，组号为key，组员们的姓名为value

（3）遍历显示每一个小组信息

（4）从键盘输入一个学员姓名，查找这个学员是否咱们班
 */
public class Exer2 {
    @Test
    public void test(){
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<String>();
        int[] a = new int[2];
        list1.add("小明");
        list1.add("小张");
        list1.add("小红");
        list1.add("小落");
        map.put(4, list1);
        list1 = new ArrayList<String>();
        list1.add("xa");
        list1.add("xb");
        list1.add("xc");
        list1.add("xd");
        map.put(6, list1);

        System.out.println("map = " + map);

        boolean xd = map.get(4).contains("xd");
        System.out.println("xd = " + xd);
    }
}


