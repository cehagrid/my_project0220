package com.atguigu.examjavase.cookthread;

import java.util.concurrent.FutureTask;

public class ThreadTest{
    public static void main(String[] args) {
        QueueTest queue = new QueueTest();
        Cook cook = new Cook(queue);
        Waiter waiter = new Waiter(queue);

        new Thread(cook).start();
        new Thread(waiter).start();

    }
}


