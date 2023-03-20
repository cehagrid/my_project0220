package com.atguigu.notify.n1;
//厨师线程
public class CookThread  extends Thread{

    Bar bar;

    public CookThread(Bar bar) {
        this.bar = bar;
    }

    @Override
    public void run() {
            while (true){
        synchronized (bar) {
            if (bar.count >= Bar.MAX_VALUE) {

                try {
                    bar.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
                //厨师做菜
                bar.count++;

                System.out.println(getName()+" 做了一道菜,吧台上菜的数量是:"+bar.count);
                bar.notify();
            }
        }
    }
}
