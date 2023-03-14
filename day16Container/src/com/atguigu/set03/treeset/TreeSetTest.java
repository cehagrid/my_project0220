package com.atguigu.set03.treeset;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
    @Test
    public void test(){
        TreeSet treeSet = new TreeSet();
//        treeSet.add(11);
//        treeSet.add(2);
//        treeSet.add(31);
//        treeSet.add(4);
//        treeSet.add(4);

        treeSet.add("汉升");
        treeSet.add("");
        treeSet.add("文远");
        treeSet.add("公瑾");
        treeSet.add("伯符");
        System.out.println("treeSet = " + treeSet);
    }
/*
TreeSet需要制定比较规则才能加入 Comparable Comparator
alt 加 鼠标左击选中
 */
    @Test
    public void test1(){
        Student student1 = new Student("孟德", 20);
        Student student2 = new Student("汉升", 22);
        Student student3 = new Student("伯符", 14);
        Student student4 = new Student("张三", 56);
        Student student5 = new Student("云长", 43);
        Student student6 = new Student("翼德", 92);


        Comparator c = new Comparator<>(){
            @Override
            public int compare(Object o1, Object o2) {
                Student student1 = (Student) o1;
                Student student2 = (Student) o2;
                return student1.getAge() - student2.getAge();
            }
        };

        TreeSet<Student> set = new TreeSet<>(c);
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        set.add(student5);
        set.add(student6);
        System.out.println(set);
    }
    
}


