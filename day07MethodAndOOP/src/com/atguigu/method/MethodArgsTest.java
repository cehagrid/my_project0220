package com.atguigu.method;

import org.junit.jupiter.api.Test;

public class MethodArgsTest {
    /**
     * @description: 可变形参的求和
     * @author: liy
     * @date: 2023/3/1 10:38
     * @param:
     * @return:
     */
    @Test
    public void test(){
        getSum(10,20,30,40,50);
    }

    private void getSum(int...args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum+=args[i];
        }
        System.out.println("sum = " + sum);
    }
/**
 * @description: 可变形参的字符串拼接
 * @author: liy
 * @date: 2023/3/1 10:37
 * @param:
 * @return:
 */
    @Test
    public void test1(){
        System.out.println(concat('-', "a", "b", "c", "d"));
    }

    private String concat(char c,String ...s) {
        String str = "";
        for (int i = 0; i < s.length; i++) {
            if (i!=s.length-1)
                str=str+s[i]+c;
            else
                str=str+s[i];
        }
        return str;
    }
    /**
     * @description: 定义一个方法接受一个整型数组返回数组的最大值
     * @author: liy
     * @date: 2023/3/1 10:38
     * @param:
     * @return:
     */
    @Test
    public void test2(){
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println("maxValue of arr[] = " + getMax(arr));
    }

    private int getMax(int...arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public int getMin(int...arr){
        int minValue = arr[0];
        for (int i : arr) {
            if (i < minValue) {
                minValue = i;
            }
        }
        return minValue;
    }

    @Test
    public void test4(){
        int[] arr = {23,345,233,247,78,45,89,12};

        int[] arr1 = {997,997,997,997};
        int[] arr2 = {23,46};
//        getMaxCommonDivisor(23,345,233,247,78,45,89,12);
        //可变形参可接收多个参数和数组，数组形参只能接收数组
        System.out.println(getMaxCommonDivisor(arr1));
    }

    private int getMaxCommonDivisor(int[] arr) {
        //方法一：
//        int maxCommonDivisor = 1;//最大公约数
//        boolean flag = false;
//        //外层累加公约数
//        for (int i = 1; i <= getMax(arr); i++) {
//            //内层循环数组
//            flag = true;
//            for (int j = 0; j < arr.length; j++) {
//                //全部通过测试max++
//                if(arr[j] % i != 0){
//                }else {
//                    flag = false;
//                }
//            }
//            if(flag != false){
//                maxCommonDivisor = i;
//            }
//        }
//        return maxCommonDivisor;

        //方法二：更好的方法
        //先找数组中最小值
        int minValue = getMin(arr);

        //所有的数与之相与
        l:for (int i = 1; i <= minValue; i++) {
            for (int ele : arr) {
                if(ele % i != 0){
                    continue l;
                }
               return minValue;
            }
        }
        return 1;
        //如果不是最小值则minValue--，继续相与
    }

}


