package com.atguigu.day13;

import org.junit.Test;

//统计字符出现次数
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
            System.out.println(letter++ + ":" + counts[i]);
        }
    }


    @Test
    public void test1() {
        //获取每一个字符出现的次数
        //获取每一个字符串出现的次数
        String s = "ABCDDCXSA1";

        //toDO:1.去重
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            //获取每一个字符串
            char c = s.charAt(i);
            //判断是否在newStr出现过
            if (!newStr.contains(c + "")) {
                newStr += c;
            }
        }
        //TODO:s遍历newStr统计数量
        for (int j = 0; j < newStr.length(); j++) {
            int count = 0;
            char c = newStr.charAt(j);
            for (int i = 0; i < s.length(); i++) {
                if (c == s.charAt(i)) {
                    count++;
                }
            }
            System.out.println(c+":"+count);
        }

    }


}
///////////////////////////////////
