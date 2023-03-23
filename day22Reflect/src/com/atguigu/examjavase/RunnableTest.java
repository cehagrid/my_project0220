package com.atguigu.examjavase;

public class RunnableTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(i);
                }
            }
        }).start();
    }
}


