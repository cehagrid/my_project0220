package com.atguigu.exer;

public class FirstThreadTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            int count = 0;
            @Override
            public void run() {
                while (count++ < 10) {
                    System.out.println("乌龟线程跑"+count+"次");
                }
            }
        }).start();

    }
}


