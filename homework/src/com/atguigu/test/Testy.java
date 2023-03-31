package com.atguigu.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class Testy {
    @Test
    public void test(){
        int y=1;
        y=y++;
        System.out.println(y);
    }

    //List插入测试
    @Test
    public void test02(){

            ArrayList<Integer> arrayList = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();
            for (int i = 0; i < 1000_0000; i++) {
                arrayList.add(i);
                linkedList.add(i);
            }
            long start = System.currentTimeMillis();
            arrayList.add (0,1);
            long end = System.currentTimeMillis();
            System.out.println("ArrayList用时："+(end-start));
//linkedList.add从头尾检查离谁近就从哪插入,50-950万之间性能都比ArrayList插头节点慢
            start = System.currentTimeMillis ();
            linkedList.add (50_0000,1);
            end = System.currentTimeMillis ();
            System.out.println("LinkedList用时："+(end-start));

    }
}


