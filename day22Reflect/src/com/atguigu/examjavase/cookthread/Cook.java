package com.atguigu.examjavase.cookthread;

import java.util.concurrent.Callable;

public class Cook implements Runnable {
    //传入公共的队列
    QueueTest queue;

    public Cook(QueueTest queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                //1.做饭前要判断能不能做
                while (queue.count >= queue.MAX_COUNT) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            //2.如果剩余的做菜空间>10则可以做
            queue.count++;
            System.out.println("队列中已经有"+queue.count+"道菜");

            //5.做好后通知服务员
            queue.notify();
            }
        }
    }
}


