package com.atguigu.array;

import org.junit.jupiter.api.Test;

/**
 * @Description: 求2-100的质数
 * @Title: PrimeNumber
 * @Package com.atguigu.java
 * @Author: liyao@qq.com
 * @Copyright
 * @CreateTime: 2023/2/28 8:41
 */

public class PrimeNumber {
    @Test
    public void test(){
        //外层循环2-100
        boolean flag;//标志位
        for (int i = 2; i <= 100; i++) {
        //每个数判断是否为质数
            flag = true;
            //for循环除根号下的每个数
            for (int j = 2; j <= Math.sqrt(i); j++) {
                //每次循环判断是否是质数
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag == true){
                System.out.println(i+"是质数");
            }
        }
    }

    /*
    优化求质数continue l;
     */
    @Test
    public void test2(){
        l:
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0) {
                    continue l;//如果不是质数直接执行外层循环
                }
            }
            System.out.println(i);
        }

    }
}


