package com.atguigu.set03.hashset;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
    @Test
    public void test() {
        Set set = new HashSet();
        set.add("author");
        set.add("Tesla");
        set.add("李白");
        set.add("元歌");
        set.add("武则天");
        System.out.println(set);

        set.remove("author");
        System.out.println("set = " + set);
        System.out.println(set.size());
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
        @Test
        public void test1(){
            Student student1 = new Student("Student", 20);
            Student student2 = new Student("Student", 20);
            Student student3 = new Student("Student", 20);
            Student student4 = new Student("Student", 20);
            Student student5 = new Student("Student", 20);
            HashSet hashSet = new HashSet();
            hashSet.add(student1);
            hashSet.add(student2);
            hashSet.add(student3);
            hashSet.add(student4);
            hashSet.add(student5);
            System.out.println(hashSet);
        }

}


