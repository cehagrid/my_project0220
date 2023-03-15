package com.atguigu.map.base;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
    @Test
    public void test() {
        HashMap<Object, Object> map = new HashMap<>();

        map.put("ch", "China");
        map.put("en", "England");
        map.put("jp", "Japan");

        System.out.println(map);
//key关键字的集合
        Set<Object> keys = map.keySet();
        for (Object key : keys) {
            System.out.println("key = " + key);
        }

//        map.clear();
//        System.out.println("map = " + map);

        //value值的集合
//        Collection<Object> values = map.values();
//        for (Object value : values) {
//            System.out.println("value = " + value);
//        }
        //key=value的遍历
        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println("entry = " + entry);
        }

        Object ch = map.get("ch");
        System.out.println(ch);
//修改的返回值是被改前的值
        Object put = map.put("ch", "null");
        System.out.println(map);

    }
}


