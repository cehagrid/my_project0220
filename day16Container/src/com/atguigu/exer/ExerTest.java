package com.atguigu.exer;

import com.atguigu.morning.ListTest01;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
（1）随机产生10个20以内的偶数，存放到一个List<E>集合中
（2）然后获取元素的个数
（3）使用foreach循环遍历显示它们
（4）使用ListIterator从后往前遍历显示它们
（5）判断是否存在12这个偶数，如果不存在，就输出不存在12。如果存在，输出其第一次出现的下标，并删除12之后的所有元素。
 */
public class ExerTest {
    @Test
    public void test(){
        //随机产生10个20内的偶数,存到一个List<>
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {

        int num = (int) (Math.random()*10);
        num = num * 2;
//            System.out.println(i+":"+num);
        list.add(num);
        }
//        （2）然后获取元素的个数
        System.out.println("list.size() = " + list.size());
        //使用foreach循环遍历显示它们
        list.forEach(System.out::print);
        System.out.println("---------------------");
//        （4）使用ListIterator从后往前遍历显示它们
        ListIterator<Integer> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous()+" ");
        }

    //（5）判断是否存在12这个偶数，如果不存在，就输出不存在12。如果存在，输出其第一次出现的下标，并删除12之后的所有元素。
        int index = list.indexOf(12);
        if (index == -1) {
            System.out.println("不存在12");
        }else{
            System.out.println("index = " + index);
            //从后往前删
            for (int i = list.size()-1; i > index; i--) {
                list.remove(i);
            }

        }

        System.out.println("---------------------");
        list.forEach(System.out::println);
    }
}


