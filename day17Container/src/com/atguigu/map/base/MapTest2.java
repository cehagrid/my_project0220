package com.atguigu.map.base;

import org.junit.Test;

import java.util.*;

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
//        Comparator<Object> c = new Comparator<>() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Student s1 = (Student) o1;
//                Student s2 = (Student) o2;
//                return s1.getAge()-s2.getAge();
//            }
//        };

//        TreeMap map3 = new TreeMap(c);

//        TreeMap map3 = new TreeMap(new Comparator<>() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Student s1 = (Student) o1;
//                Student s2 = (Student) o2;
//                return s1.getAge()-s2.getAge();
//            }
//        });
        TreeMap map3 = new TreeMap(Comparator.comparingInt(Student::getAge));
        Student s1 = new Student("王朝", 28);
        Student s2 = new Student("马汉", 38);
        Student s3 = new Student("张龙", 23);
        Student s4 = new Student("赵虎", 12);
        map3.put(s1, "我是王朝");
        map3.put(s2, "我是马汉");
        map3.put(s3, "我是不马汉");
        map3.put(s4, "我是赵虎");
        System.out.println("map3 = " + map3);

    }
}


