package com.atguigu.morning;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class MorningExer {
    @Test
    public void test() {
        //创建一个集合
        Collection<Integer> c = new ArrayList<>();

        //求质数
        l:
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue l;
                }
            }
            System.out.println(i);
        }


    }

}


