package com.atguigu.clone;

import org.junit.Test;

public class StudentTest {
    @Test
    public void test() throws CloneNotSupportedException {
        Student s1 = new Student("z",1,23);;
        System.out.println(s1);
        Object clone = s1.clone();
        System.out.println(clone);
        Student s2 = (Student) clone;
        s2.name="a";
        System.out.println(s1);
        System.out.println(s2);
    }

}


