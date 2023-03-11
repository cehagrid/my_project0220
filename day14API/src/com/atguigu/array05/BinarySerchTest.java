package com.atguigu.array05;

public class BinarySerchTest {

    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};

        int key = 35;//目标元素
        int startIndex = 0;//索引
        int endIndex = arr.length - 1;
        int midIndex = (startIndex + endIndex) / 2;

        while (startIndex <= endIndex) {
            if (arr[midIndex] < key) {
                startIndex = midIndex + 1;
            } else if (arr[midIndex] > key) {
                endIndex = midIndex - 1;
            } else {
                System.out.println("找到了" + key + "的元素");
                break;
            }
            midIndex = (startIndex + endIndex) / 2;
            if(midIndex < startIndex || midIndex > endIndex) {
                System.out.println("不找了,找不到了");
            }
        }


    }
}



















