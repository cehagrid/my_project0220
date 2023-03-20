package com.atguigu.stop;

public class TortoiseThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20 ; i++) {
            if (i % 2 == 0) {
                interrupt();
            }
//            if(isInterrupted()){//只判断有没有打过标记,不清除标记
            if (Thread.interrupted()) {//会清除标记
                System.out.println("打过标记了 i = " + i);
            }
        }
    }
}


