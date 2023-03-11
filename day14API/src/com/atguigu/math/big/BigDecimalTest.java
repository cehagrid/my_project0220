package com.atguigu.math.big;

import org.junit.Test;

import java.math.BigDecimal;

public class BigDecimalTest {
    @Test
    public void test(){
        BigDecimal b1 = new BigDecimal("10.0");
        BigDecimal b2 = new BigDecimal("19.65323231232231");
        System.out.println("b1.add(b2) = " + b1.add(b2));
        System.out.println("b1.subtract(b2) = " + b1.subtract(b2));
        System.out.println("b1.multiply(b2) = " + b1.multiply(b2));
//        System.out.println("b1.divide(b2) = " + b1.divide(b2));//
        System.out.println("b1.remainder(b2) = " + b1.remainder(b2));
    }
}


