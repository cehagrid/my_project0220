package com.atguigu.thread.runnable;

import org.junit.Test;

public class WindowsTest {
    public static void main(String[] args) {

        Window w1 = new Window();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);
        t1.setName("窗口1:");
        t2.setName("窗口2:");
        t3.setName("窗口3:");
        t1.start();
        t2.start();
        t3.start();
    }
    
}


