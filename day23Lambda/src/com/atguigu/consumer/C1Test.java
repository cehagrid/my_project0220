package com.atguigu.consumer;

import org.junit.Test;

import java.util.*;

public class C1Test {
    @Test
    public void test01(){
        HashMap hashMap = new HashMap();
        ArrayList<Object> list = new ArrayList<>();
        hashMap.put("李信","我,就是太阳!");
        hashMap.put("元歌","我用喧哗表达寂静,用彩色扮演苍白");
        hashMap.put("凯","无限接近死亡,更能领悟生存的真谛");
        hashMap.put("典韦","彻底疯狂");

        hashMap.forEach((k,v)-> System.out.println(k+" --> "+v));

    }

    @Test
    public void test02(){
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "关羽","刘备","黄忠","赵云","张飞");
//        list.forEach(a-> System.out.println(a));
//        list.forEach(System.out::println);
        ListIterator<String> iterator = list.listIterator(list.size());//传入最后一个的位置
        while (iterator.hasPrevious()) {
            System.out.println("iterator.next() = " + iterator.previous());
        }

    }
    @Test
    public void test03(){
        HashSet<Object> hashSet = new HashSet<>();
        Collections.addAll(hashSet, "关羽","刘备","黄忠","赵云","张飞");
        //方式1
//        hashSet.forEach(System.out::println);
        //方式2
//        Iterator<Object> iterator = hashSet.iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        //方式3
//        for (Object ele : hashSet){
//            System.out.println(ele);
//        }
        //方式4
        ArrayList<Object> list = new ArrayList<>(hashSet);
        for (int i = 0; i < hashSet.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}


