package com.atguigu.java;

import org.junit.jupiter.api.Test;

public class ArrayTest {
    @Test
    public void test(){
        int arr1[] = new int[3];
        for (int i=0;i<arr1.length;i++) {
            arr1[i] = i;
        }
        for (int j : arr1){
            System.out.println(arr1[j]);
        }
        System.out.println("------------------");
        byte arr2[] = new byte[3];
        System.out.println(arr2[1]);
        System.out.println("------------------");
        short arr3[] = new short[3];
        System.out.println(arr3[1]);
        System.out.println("------------------");
        double arr4[][] = new double[3][3];
        System.out.println(arr4[1][2]);
        System.out.println("------------------");
        char[] arr5[] = new char[3][2];
        System.out.println(arr5[1][1]);

    }
}
