package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class BreakTest {
    /*
    break跳出两层循环的方法，类似goto
     */
    @Test
    public void test(){
        label:
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.print(j+" ");
                if (j == 3){
                    System.out.print("跳出两层循环");
                    continue label;
//                    break label;
                }
            }
            System.out.println(" 执行"+i+"次 ");

        }
    }
    //判断输入是否为质数
    @Test
    public void test1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数字：");
        int num = scan.nextInt();
        boolean flag = false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                flag = true;
                break;//可以提前结束
            }
        }
        if (flag == false) {
                System.out.println(num+"是质数！ ");
        }else{
            System.out.println(num+"不是质数 ");
        }
    }
}
