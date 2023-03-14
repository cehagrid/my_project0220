package com.atguigu.exer;

import org.junit.Test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class TotalWordTest {
    @Test
    public void test() {
        //从键盘输入单词统计出现的字母和没有出现的字母
        totalWord(5);

    }

    private static void totalWord(int num) {
        Scanner scan = new Scanner(System.in);
        HashSet set = new HashSet();

        for (int i = 0; i < num; i++) {
            System.out.println("请输入单词:");
            String s = scan.nextLine();
            s.toLowerCase();
            char[] chars = s.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                set.add(chars[j]);
            }
        }

        System.out.println(set);

        HashSet set1 = new HashSet();
        for (char c = 'a'; c <= 'z'; c++) {
            set1.add(c);
        }

        set1.removeAll(set);
        System.out.println(set1);
    }

    @Test
    public void test1() {

        TreeSet<Object> set = new TreeSet<>();
        Circle circle1 = new Circle(10.2);
        Circle circle2 = new Circle(90.0);
        Circle circle3 = new Circle(5.90);
        Circle circle4 = new Circle(2.0);
        set.add(circle1);
        set.add(circle2);
        set.add(circle3);
        set.add(circle4);
        System.out.println(set);
    }

}


