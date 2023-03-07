package com.atguigu.exer;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StudentTest {
    @Test
    public void test(){
        Student s1 = new Student("w", 23, 98);
        Student s2 = new Student("s", 234, 198);
        Student s3 = new Student("a",45,92);
        Student s4 = new Student("d",25,902);

        Student arr[] = new Student[4];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        arr[3] = s4;
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

    }

}


