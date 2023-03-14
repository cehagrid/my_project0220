package com.atguigu.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListTest {
    @Test
    public void test(){
        Collection<String> c = new ArrayList<String>();
        c.add("a");
        c.add("b");
//        c.add(c);
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());
        }




    }
    @Test
    public void test1(){
        Collection c1 = new ArrayList();
        c1.add(100);
        c1.add(200);
        c1.add(200);
        c1.add(300);
        c1.remove(200);
        System.out.println("c = " +c1);
        boolean contains = c1.contains(3000);
        System.out.println("contains = " + contains);
    }
    @Test
    public void test2(){
        Collection<String> c2 = new ArrayList<String>();
        c2.add(" ");
        c2.add("");
        c2.add("and");
        c2.add("a啊");
        Collection<String> c3 = new ArrayList<String>();
        c2.add("1 ");
        c2.add("");
        c2.add("and");
        c2.retainAll(c3);
        System.out.println(c2);
    }
}


