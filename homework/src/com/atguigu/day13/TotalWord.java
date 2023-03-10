package com.atguigu.day13;

import org.junit.Test;

public class TotalWord {
    @Test
    public void test() {
        String words = "hello123world";

        //创建包含所有可能的数组统计字符串出现的次数,下标为字符
        int[] counts = new int[26];
        for (int i = 0; i < words.length(); i++) {
            counts[words.charAt(i) - 'a']++;
        }

        //遍历统计数组
        for (int i = 0; i < counts.length; i++) {
            System.out.println(counts[i]);
        }
    }

    String ss = "jaj";

    @Test
    public void test1() {


    }


}
///////////////////////////////////
