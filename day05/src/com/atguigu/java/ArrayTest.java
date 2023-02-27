package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class ArrayTest {
    //for循环遍历数组
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

    /**
     * 1.练习1:用一个数组存储26个小写英文字母，并遍历显示，显示要求如: a->A
     */
    @Test
    public void test1(){
        System.out.println("----------方法一：------------");
        char[] letters = new char[26];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char)(i+97);
        }
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]+"->"+(char)(i+65));
//            i-=32;//此时不用强转char
        }

        System.out.println("---------方法二：-----------");
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i + "->" + (char)(i-32));
        }
    }

    /**
     * 2.练习3:用一个数组存储本组学员的姓名，从键盘输入，并遍历显示
     */
    @Test
    public void test2(){
        String[] name = new String[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < name.length; i++) {
            System.out.println("请输入姓名：");
            name[i] = scan.nextLine();
        }
        //方式一：普通for循环
        for (int i = 0; i <name.length; i++) {
            System.out.print(name[i]+" ");
        }
        System.out.println("-------------------");
        //方式2：增强for循环
        for (String str : name) {
            System.out.print(str+" ");
        }
    }
}
