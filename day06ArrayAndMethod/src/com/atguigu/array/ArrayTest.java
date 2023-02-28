package com.atguigu.array;

import org.junit.jupiter.api.Test;

/**
 * @Description: 2维数组，多维数组
 * @Title: ArrayTest
 * @Package com.atguigu.java
 * @Author: liyao@qq.com
 * @Copyright
 * @CreateTime: 2023/2/28 11:57
 */

public class ArrayTest {
    @Test
    public void test() {
        String[][] strArr = new String[][]{{"啊", "s"}, {"ss", "sdas", "sa"}, {"1"}};
        for (String[] s : strArr) {
            for (String ss : s) {
                System.out.print(ss+"\t");
            }
            System.out.println();
        }
    }
}


