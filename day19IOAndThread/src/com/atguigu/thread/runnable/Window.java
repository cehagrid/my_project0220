package com.atguigu.thread.runnable;

import org.junit.Test;

import java.sql.SQLOutput;

//多线程的同步问题,多窗口卖票
/*
原子操作
临界资源 ticket
 */
public class Window implements Runnable {
    private int ticket = 100;//后台的总票数量

    @Override
    public void run() {
        while (true) {
            synchronized (this) {//内部临界资源,监视器this
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "卖票:票号为: " + ticket--);
                } else {
                    System.out.println("已售罄.");
                    break;
                }
            }
        }
    }
}

