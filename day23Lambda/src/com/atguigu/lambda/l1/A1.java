package com.atguigu.lambda.l1;

public interface A1 {
    void show(String message);
}

interface A2 {
    static void show(String s) {
        System.out.println(s);
    }
}


