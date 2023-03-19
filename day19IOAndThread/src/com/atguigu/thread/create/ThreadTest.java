package com.atguigu.thread.create;

import org.junit.Test;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        RabbitThread thread = new RabbitThread();
        thread.start();
        int count = 200;
        while (count-- != 0) {
            Thread.sleep(10);
            System.out.println("乌龟离重点还有"+count+"米");
        }
        System.out.println("乌龟到终点了");
    }

    @Test
    public void test02(){
        int count = 100;
        while (count-- != 0) {
            System.out.println(count);
        }
    }
}


