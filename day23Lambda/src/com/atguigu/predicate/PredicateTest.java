package com.atguigu.predicate;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class PredicateTest {
    @Test
    public void test01(){
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,11,12,13,14,15,16,17,18,19,20,21);
//        list.removeIf(new Predicate<Object>() {
//            @Override
//            public boolean test(Object o) {
//                return false;
//            }
//        });
        list.removeIf(i -> i % 2 == 0);
        System.out.println("list = " + list);

    }
    @Test
    public void test02(){
        Map<String,String> map = new HashMap<>();

        map.put("A","王安石");
        map.put("B","白居易");
        map.put("C","李商隐");
        map.put("D","李白");
        //名字带白的改成安琪拉
//        map.replaceAll(new BiFunction<String, String, String>() {
//            @Override
//            public String apply(String s, String s2) {
//                return s2.contains("白")?"安琪拉":s2;
//            }
//        });
        map.replaceAll((k,v)->v.contains("白")?"an":v);
        System.out.println("map = " + map);

    }
}


