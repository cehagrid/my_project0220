package com.atguigu.morning;

import org.junit.Test;

public class MorningTest {
    @Test
    public void test() {
        int fib[] = new int[10];
//        fibGenerate(fib.length);
        for (int i = 1; i < fib.length; i++) {
            fib[i] = fibGenerate(i);
            System.out.println(fib[i]);
        }

    }

    private int fibGenerate(int length) {
//        if(length <= 0){
//            return 0;
//        }else if(length == 1 || length ==2){
//            return 1;
//        }else{
//            return fibGenerate(length - 1) + fibGenerate(length - 2);
//        }
        int fib = 0;
        int temp1 = 0;
        int temp2 = 1;
        for (int i = 1; i <= length; i++) {
            fib = temp1 + temp2;
            temp1 = temp2;
            temp2 = fib;
//            System.out.println(fib);
        }
        if(length == 1){
            return 1;
        }
        return fib;
    }
}


