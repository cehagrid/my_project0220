package com.atguigu.notify;
/*
线程间通信:不同线程可以进行交流
线程通信通过线程间的等待唤醒机制实现
wait(): 等待
notify():唤醒等待的线程  如果多个线程等待  notify 随机唤醒
notifyAll():唤醒所有等待的线程

注意:
    1.这些方法来自于Object
案例:
    服务员线程  端菜  当吧台上菜的数量为0 服务员休息  当端走一道菜通知厨师做菜
    厨师线程    做菜 当吧台上菜的数量为10 厨师要休息  当做好一道菜通知服务员端菜
    吧台:最多可以放10道菜
 */
public class Base {

    public static void main(String[] args) {



        Base b = new Base();


    }

}
