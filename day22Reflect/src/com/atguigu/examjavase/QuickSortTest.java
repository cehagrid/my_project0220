package com.atguigu.examjavase;

import java.util.Arrays;

public class QuickSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 5, 7, 2, 3, 4, 9, 6, 10};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("arr = " + Arrays.toString(arr));
    }

//    public static int Partition(int[] arr, int left, int right) {
//        int pivot = arr[left];//第一个元素为枢轴
//        while (left < right){//用left,right搜索枢轴的最终位置
//            while (left < right && arr[right] >= pivot)
//                --right;
//            arr[left] = arr[right];//比枢轴小的元素移动到左端
//            while (left < right && arr[left] <= pivot)
//                ++left;
//            arr[right] = arr[left];//比枢轴大的元素移动到右端
//        }
//        arr[left] = pivot;//枢轴元素存放的最终位置
//        return left;//返回枢轴
//    }
//     static void quickSort(int[] arr, int left, int right) {
//        if (left < right) {//递归跳出等等条件
//            int pivotpos = Partition(arr,left,right);
//            quickSort(arr,left,pivotpos-1);//划分左子表
//            quickSort(arr,pivotpos+1,right);//划分右子表
//        }
//    }

    public static int partion(int[] arr, int left, int right){
        int pivot = arr[left];
        while (left < right) {
            while (left < right && pivot <= arr[right]) right--;
            arr[left] = arr[right];
            while(left < right && pivot >= arr[left]) left++;
            arr[right] = arr[left];
        }
        arr[left] = pivot;
        return left;
    }

    static void quickSort(int[] arr,int left,int right){
        if (left < right) {
            int pivotPos = partion(arr, left, right);
            quickSort(arr,left,pivotPos-1);
            quickSort(arr,pivotPos+1,right);
        }
    }

}


