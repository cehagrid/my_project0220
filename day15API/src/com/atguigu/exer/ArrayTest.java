package com.atguigu.exer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayTest {
    @Test
    public void test() {
        String s = "abcdabcddsafdfdfdabcd";
        char[] array = s.toCharArray();
        Arrays.sort(array);
        String newStr = new String(array);
        System.out.println(Arrays.toString(array));

        int endIndex;
        for (int startIndex = 0; startIndex < array.length; startIndex = endIndex + 1) {

            char ele = newStr.charAt(startIndex);
            endIndex = newStr.lastIndexOf(ele);
            System.out.println(ele+"----->"+(endIndex-startIndex+1));

        }
        //先去重

        //统计每个字符出现的次数
    }

}


