package com.atguigu.array;

import org.junit.jupiter.api.Test;

/**
 * @Description: 2维数组练习
 * @Title: DoubleArrayExer
 * @Package com.atguigu.java
 * @Author: liyao@qq.com
 * @Copyright
 * @CreateTime: 2023/2/28 14:06
 */

public class DoubleArrayExer {
    @Test
    public void test(){
        int arr[][] = new int[5][];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= new int[i+1];
            for (int j = 0; j < i+1; j++) {
                arr[i][j] = i+1;
            System.out.print(" arr[i][j] = " + arr[i][j]);
            }
            System.out.println();
        }



    }
}


