package com.atguigu.references.method;

import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.function.Function;
import java.util.function.Supplier;

interface B{
    int getInt(String s);
}
public class MethodTest {
    @Test
    public void test01(){

//        B b = s -> Integer.valueOf(s);
        B b = Integer::valueOf;
        System.out.println("b = " + b.getInt("12"));

    }

    @Test
    public void test02(){
        Function<Integer,int[]> f = new Function<Integer,int[]>() {
            @Override
            public int[] apply(Integer integer) {
                return new int[integer];
            }
        };

//        Function<Integer,int[]> f2 = i -> new int[i];
        Function<Integer,int[]> f2 = int[]::new;
        int[] apply = f2.apply(43);
        System.out.println("apply.length = " + apply.length);

    }

}


