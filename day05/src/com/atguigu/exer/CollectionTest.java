package com.atguigu.exer;

import org.junit.jupiter.api.Test;

public class CollectionTest {
    @Test
    public void test() {
        //100以内素数
        l:
        for (int i = 2; i < 100; i++) {
            //i挨个除从1到根号i
            for (int j = 2; j <= Math.sqrt(i); j++) {
                //如果i除完没有因数,为质数
                if (i % j == 0) {
                    continue l;
                }
            }
            System.out.println(i + "是质数");
        }

    }

}


