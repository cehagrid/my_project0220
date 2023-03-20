package com.atguigu.notify.n1;
//服务员线程
public class WaiterThread  extends Thread{
    Bar bar;

    public WaiterThread(Bar bar) {
        this.bar = bar;
    }

    @Override
    public void run() {
//
            while (true){
        synchronized (bar) {
            if (bar.count <= Bar.MIN_VALUE) {
                try {
                    bar.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
                //服务员端菜
                bar.count--;

                System.out.println(getName()+" 端走了一道菜,吧台上菜的数量是:"+bar.count);
                bar.notify();
            }
        }
    }
}
