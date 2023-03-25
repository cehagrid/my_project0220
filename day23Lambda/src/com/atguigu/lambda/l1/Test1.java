package com.atguigu.lambda.l1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.function.DoubleUnaryOperator;

public class Test1 {
    @Test
    public void test01() {
        A1 a1 = a -> System.out.println("a = " + a);
    }

    @Test
    public void test02() {
//        A2 a2 = System.out::println;
    }

    @Test
    public void test03(){
        HashMap hashMap = new HashMap();
        ArrayList<Object> list = new ArrayList<>();
        hashMap.put("李信","我,就是太阳!");
        hashMap.put("元歌","我用喧哗表达寂静,用彩色扮演苍白");
        hashMap.put("凯","无限接近死亡,更能领悟生存的真谛");
        hashMap.put("典韦","彻底疯狂");

        hashMap.forEach((k,v)-> System.out.println(k+" --> "+v));


    }
}


