package com.atguigu.exer;

import java.util.HashSet;
import java.util.Iterator;

/*
随机产生几个100内的偶数,存放到HashSet<E>中,
并且使用Iterator<E>迭代器遍历显示他们,
保证最后的HashSet<E>集合中有10个元素
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        while (set.size() < 10) {
            int num = (int) (Math.random() * 50);
            num = num * 2;
//            System.out.println(num);
            set.add(num);
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(set.size());

    }
}


