package com.atguigu.semaphore;

import java.util.concurrent.Semaphore;

public class WaitNotifyTest {
    //生成信号量对象
    //提供三种搭配
    //烟+胶水
    static Semaphore offer1 = new Semaphore(0);
    //烟+纸
    static Semaphore offer2 = new Semaphore(0);
    //胶水+纸
    static Semaphore offer3 = new Semaphore(0);
    //生产者仓库余量
    static Semaphore finish = new Semaphore(0);
    //桌子
    static Semaphore desk = new Semaphore(1);

    static int i = 0;

    public static void main(String[] args) {
        Thread s1 = new Thread(new Smoker1());
        Thread s2 = new Thread(new Smoker2());
        Thread s3 = new Thread(new Smoker3());
        Thread provider = new Thread(new Prodiver());
        provider.setName("provider");
        s1.setName("1号吸烟者: ");
        s2.setName("2号吸烟者: ");
        s3.setName("3号吸烟者: ");
        provider.start();
        s1.start();
        s2.start();
        s3.start();

    }

    //生产者的类
    static class Prodiver implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    //桌子互斥操作
                    desk.acquire();//P--
                    if (i == 0) {
                        offer1.release();//V++,生产了一个组合一
                    } else if (i == 1) {
                        offer2.release();//V++
                    } else {
                        offer3.release();
                    }
                    i = (i + 1) % 3;
                    //对生产者来说,还能生产的数量-1
                    finish.acquire();
                    //桌子释放
                    desk.release();
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }//run end
    }

    //三个吸烟者类
    static class Smoker1 implements Runnable {
        static int num = 0;//统计抽烟的数量

        @Override
        public void run() {
            while (true) {
                try {
                    offer1.acquire();//消耗了一个产品一
                    num++;
                    System.out.println(Thread.currentThread().getName() + "Smoke1正在抽第 " + num + " 根烟");
                    finish.release();//给生产者增加了一个生产指标
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Smoker2 implements Runnable {
        static int num = 0;//统计抽烟的数量

        @Override
        public void run() {
            while (true) {
                try {
                    offer2.acquire();//消耗了一个产品2
                    num++;
                    System.out.println(Thread.currentThread().getName() + "Smoke3正在抽第 " + num + " 根烟");
                    finish.release();//给生产者增加了一个生产指标
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Smoker3 implements Runnable {
        static int num = 0;//统计抽烟的数量

        @Override
        public void run() {
            while (true) {
                try {
                    offer3.acquire();//消耗了一个产品一
                    num++;
                    System.out.println(Thread.currentThread().getName() + "Smoke3正在抽第 " + num + " 根烟");
                    finish.release();//给生产者增加了一个生产指标
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}





