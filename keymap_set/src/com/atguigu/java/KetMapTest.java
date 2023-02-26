package com.atguigu.java;

import org.junit.jupiter.api.Test;

public class KetMapTest {
    public static void main(String[] args) {
        System.out.println("1.智能提示： alt + enter");
        System.out.println("2.向上移动一行：alt + shift + ↑");
        System.out.println("3.向上移动一行：ctrl + shift + ↑");
        System.out.println("4.删除一行代码：ctrl + y");
        System.out.println("5.复制一行代码：ctrl + d");
        System.out.println("6.方法形参列表的提醒：ctrl + p");
        System.out.println("7.调出生成器构造器：alt + insert");
        System.out.println("8.生成返回值：ctrl + alt + v");
        System.out.println("9.生成try-catch等环绕：ctrl + alt + t");
        System.out.println("10.方法的形参提醒列表：ctrl + p");
        System.out.println("11.提醒代码模板：ctrl + j");
        System.out.println("12.切换到下/上一行代码空位：shift +[+alt] enter");
        System.out.println("13.格式化对齐：Ctrl + alt + L");
    }

    @Test
    public void test() {
        System.out.println("@Test已加载");
        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test1() {
        int i, j;
        for (i = 2; i <= 1000; i++) {
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j > i / 2) {
                System.out.println(i + "是素数");
            }

        }

    }

    @Test
    public void test2() {
        for (int i = 1; i < 200; i += 2) {
//            if (i % 3 == 0 | i % 5 == 0 | i % 7 == 0)
            System.out.print(i + ": ");
            if (i % 3 == 0)
                System.out.print("foo ");
            if (i % 5 == 0)
                System.out.print("baz ");
            if (i % 7 == 0)
                System.out.print("biz ");
//            if (i % 3 == 0 | i % 5 == 0 | i % 7 == 0)
            System.out.println();
        }
    }

    @Test
    public void test2_1() {
        String message;
        for (int i = 1; i < 201; i++) {
            message = "";
            if (i % 3 == 0)
                message = " foo";
            if (i % 5 == 0)
                message += " baz";
            if (i % 7 == 0)
                message += " biz";
            System.out.println(i + message);

        }
    }

    //todo:git maven,ClassLoader,Date
    @Test
    public void test3() {
        System.out.println(oddSum(100));

    }

    public int oddSum(int num) {
        if (num % 2 == 0) {
            num--;
        }
        if (num == 1) {
            return 1;
        } else {
            return oddSum(num - 2) + num;
        }
    }

    /*
    [m,n]产生指定范围的随机数（整数，小数的范围到 n+1）
    int num = (int)(math.random()*(n-m+1)+m);
    （random * 区间差+1）+ 左区间
     */
    @Test
    public void test4() {
        double random;
        for (int i = 0; i < 300; i++) {
            random = (Math.random() * (10 - 0) + 1) + 10;
            System.out.println(i+": "+random);
        }
    }
}
