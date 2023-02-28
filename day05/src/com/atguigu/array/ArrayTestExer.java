package com.atguigu.array;

import org.junit.jupiter.api.Test;


import java.util.Scanner;

/**
 * @Description: 数组练习
 * @Title: ArrayTestExer
 * @Package com.atguigu.java
 * @Author: liyao@qq.com
 * @Copyright
 * @CreateTime: 2023/2/27 15:38
 */

public class ArrayTestExer {
    @Test
    public void test() {
        int arr[] = {1, 23, 23, 14, 45,2 , 56, 4, 756, 0, 564, 576};
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数字：");
        //接受数字
        int num = scan.nextInt();
        //设置标志
        boolean flag = false;
        //遍历数组
        for (int i : arr) {
            if (i == num) {
                flag = true;
            }
        }
        if (flag == true) {
            System.out.println("在数组中");
        } else {
            System.out.println("不在数组中");
        }

    }

}


