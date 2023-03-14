package com.atguigu.morning;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ListTest01 {
    @Test
    public void test(){
//        List list = new List();
        List<Object> list = new ArrayList<>();

        list.add("赵云");
        list.add("张三");
        list.add("李四");
        System.out.println(list);
        System.out.println("-------------------");

        list.remove(0);
        list.add(2,null);//不能超过长度
        System.out.println(list);

        list.clear();
        System.out.println(list);


    }
}


