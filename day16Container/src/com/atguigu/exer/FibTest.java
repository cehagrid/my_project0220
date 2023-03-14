package com.atguigu.exer;

import org.junit.jupiter.api.Test;

public class FibTest {

    @Test
    public void fib() {
        long fib = 0;
        long temp1 = 0;
        long temp2 = 1;
        for (int i = 0; i < 10; i++) {
            fib = temp1 + temp2;
            temp1 = temp2;
            temp2 = fib;
            System.out.print(fib + " ");
        }

    }

    @Test
    public void primeNumber() {
        l:
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i == 2) {
                    System.out.println(i);
                } else if (i % j == 0) {
                    continue l;
                }
            }
            System.out.println(i);
        }
    }
}


