package com.atguigu.examjavase.cookthread;

public class Waiter implements Runnable {
    QueueTest queue;
    Waiter(QueueTest queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        //1.判断队列有没有菜
        while (true) {
            synchronized (queue){
                while (queue.count<=QueueTest.MIN_COUNT){
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                queue.count--;
                System.out.println("端走了一道菜,还剩:"+queue.count+"道菜");
                queue.notify();
            }
        }
        //2.有菜端走
        //3.没菜等待

    }
}


