package com.atguigu.examjavase;

public class ArraySumTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5,  3,  2, 4, 2};
//        //1,求长度,for循环左右同时加和判断哪边小哪边加
//        int i = 0, j = arr.length - 1;
//        int sumbefore = arr[i];//前部分求和
//        int sumafter = arr[j];//后部分求和
//        int numbefore = 0;//中间数
//        int numafter = arr.length-1;
//        while (i < j) {
//            if (sumbefore < sumafter) {
//                sumbefore += arr[++i];
//                numbefore = i+1;
//            }else if (sumbefore > sumafter) {
//                sumafter += arr[--j];
//                numafter = j-1;
//            }else if(sumbefore == sumafter) {
//                if (numafter == numbefore)
//                    System.out.println(numafter);
//                break;
//            }
//        }
        //1.穷举法,左右分别求和
        int index = 1;
        while (index < arr.length) {
        int sumbefore = 0, sumafter = 0;
            for (int i = 0; i < index; i++) {
                sumbefore += arr[i];
            }
            for (int i = index + 1; i < arr.length; i++) {
                sumafter += arr[i];
            }
            if (sumafter == sumbefore) {
                System.out.println(index);
                break;
            }
            index++;
        }


    }
}


