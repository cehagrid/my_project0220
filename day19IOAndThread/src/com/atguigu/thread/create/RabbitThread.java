package com.atguigu.thread.create;

public class RabbitThread extends Thread {
    @Override
    public void run() {
        int i = 100;
        while (i-- != 0) {
            try {
                Thread.sleep(7);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("兔子距离重点还有"+i+"米");
        }
        System.out.println("------------兔子到终点了--------------");
    }

}


