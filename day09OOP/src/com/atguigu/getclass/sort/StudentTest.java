package com.atguigu.getclass.sort;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[4];
        arr[0] = new Student("张三", 12);
        arr[1] = new Student("李四", 19);
        arr[2] = new Student("王五", 16);
        arr[3] = new Student("赵六", 21);
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        showInfo(arr);

        bubblySort(arr);

        System.out.println("-------------------");

        showInfo(arr);
    }

    private static void showInfo(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void bubblySort(Student[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j].age > arr[j+1].age){
                    Student temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }
}


