package com.atguigu.exer;

import javax.sound.midi.Soundbank;

public class SecondThreadTest {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Thread thread = new Thread(rabbit);
        thread.setName("兔子: ");
        thread.start();
    }

    static class Rabbit implements Runnable{
        @Override
        public void run() {
            int count = 0;
            while (count++ < 50) {
                System.out.println(Thread.currentThread().getName()+"Rabbit 跑了"+count+"次");
            }
        }
    }
}


