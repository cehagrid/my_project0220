package com.atguigu.day13;

import org.junit.Test;

public class TotalWord {
    @Test
    public void test() {
        String words = "helloworld";

        //创建包含所有可能的数组统计字符串出现的次数,下标为字符
        int[] counts = new int[26];
        String s;
        for (int i = 0; i < words.length(); i++) {
            //大写转小写,
            s = words.toLowerCase();
            counts[s.charAt(i) - 'a']++;
        }

        //遍历统计数组
        char letter = 'a';
        for (int i = 0; i < counts.length; i++) {
            System.out.println(letter+++":"+counts[i]);
        }
    }



    @Test
    public void test1() {


    }


}
///////////////////////////////////
