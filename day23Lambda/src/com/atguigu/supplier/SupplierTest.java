package com.atguigu.supplier;

import org.junit.Test;

import java.util.function.Supplier;

public class SupplierTest {
    @Test
    public void test01(){
        //原始方法:
        Supplier s = new Supplier(){

            @Override
            public Object get() {
                return Math.random();
            }
        };
        Object o = s.get();
        System.out.println("o = " + o);

        System.out.println("--------------------");
        //lambda {return }一起省略
        Supplier s1 = ()-> Math.random();
        Object o1 = s1.get();
        System.out.println("o1 = " + o1);
        //方法引用
        Supplier s2 = Math::random;
        System.out.println("s2.get() = " + s2.get());

    }
}


