package com.atguigu.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TraversalTest {
    /*
    遍历集合的方式
     */

    @Test
    public void test(){
        List list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ListIterator listIterator = list.listIterator(5);
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        list.forEach(System.out::println);

        System.out.println("-------------------------");

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        while (listIterator.hasPrevious()) {//光标问题
            System.out.println("listIterator.previous() = " + listIterator.previous());
        }
    }
}


