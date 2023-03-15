package com.atguigu.map.base;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class MapTest2 {
    @Test
    public void test(){
        HashMap<Object, Object> map = new HashMap<>();
        LinkedHashMap<Object, Object> map1 = new LinkedHashMap<>();
        TreeMap<Object, Object> map2 = new TreeMap<>();

        map.put("李","李清照");
        map.put("张","张三");
        map.put("王","王阳明");

        boolean key = map.containsKey("李");
        System.out.println(key);

        map1.putAll(map);
        System.out.println("map1 = " + map1);

//        map2.putAll(map1);
        map2.put(1,23);
        map2.put(22,23);
        map2.put(3,23);
        map2.put(14,23);
        System.out.println("map2 = " + map2);

    }
}


