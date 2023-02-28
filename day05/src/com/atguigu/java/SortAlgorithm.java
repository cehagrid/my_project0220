package com.atguigu.java;

import org.junit.jupiter.api.Test;


import java.util.Arrays;

/**
 * @Description: 排序算法
 * @Title: SortAlgorithm
 * @Package com.atguigu.java
 * @Author: liyao@qq.com
 * @Copyright
 * @CreateTime: 2023/2/27 16:18
 */

public class SortAlgorithm {
    /**
     * @description: bubbleSort
     * @author: liy
     * @date: 2023/2/27 16:18
     * @param:
     * @return:
     */
    @Test
    public void bubbleSort() {
        int[] arr = {5, 3, 7, 23, 98, 54, 34, 23, 17, 0};
        System.out.println("排序前：" + Arrays.toString(arr));

        //设置停止排序标志
        boolean flag;
        //1.外层循环
//        l:
        for (int i = 0; i < arr.length - 1; i++) {
            flag = true;
            //2.内层循环每次都少一次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                    flag = false;
//                    continue l;//优化
                }
            }
            if (flag == true) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    /**
     * @description: selectionSort
     * @author: liy
     * @date: 2023/2/27 16:19
     * @param:
     * @param: null
     * @return:
     * @return: null
     */
    @Test
    public void selectionSort() {
        int[] arr = {56, 3, 23, 12, 79, 44, 50, 1, 33};
        System.out.println("排序前：" + Arrays.toString(arr));
        int front;//有序的边界
        for (front = 0; front < arr.length; front++) {
            int minIndex = front;//最小值下标
            //1.for循环选择最小的数,并与第一位交换，第一位的标记
            for (int i = front + 1; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            if (minIndex != front) {
                arr[minIndex] = arr[minIndex] ^ arr[front];
                arr[front] = arr[minIndex] ^ arr[front];
                arr[minIndex] = arr[minIndex] ^ arr[front];
            }
        }
        System.out.println("排序后："+Arrays.toString(arr));
    }



    /**
     * @description: insertionSort
     * @author: liy
     * @date: 2023/2/27 16:20
     * @param:
     * @param: null
     * @return:
     * @return: null
     */
    @Test
    public void insertionSort() {

    }

    /**
     * @description: quickSort
     * @author: liy
     * @date: 2023/2/27 16:20
     * @param:
     * @param: null
     * @return:
     * @return: null
     */
    @Test
    public void quickSort() {

    }

    /**
     * @description: mergeSort
     * @author: liy
     * @date: 2023/2/27 16:21
     * @param:
     * @param: null
     * @return:
     * @return: null
     */
    @Test
    public void mergeSort() {

    }

    /**
     * @description: shellSort
     * @author: liy
     * @date: 2023/2/27 16:21
     * @param:
     * @param: null
     * @return:
     * @return: null
     */
    @Test
    public void shellSort() {

    }

    /**
     * @description: heapSort
     * @author: liy
     * @date: 2023/2/27 16:50
     * @param:
     * @param: null
     * @return:
     * @return: null
     */
    @Test
    public void heapSort() {

    }


}


