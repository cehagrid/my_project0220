package com.atguigu.morning;
/*
打印12A 34B 56C....

注意:
1.基础功能是什么
2.哪里需要同步
3.哪里需要wait,哪里需要notify
 */
public class Test {
    public static void main(String[] args) {
        NumberThread n1 = new NumberThread();
        LetterThread l1 = new LetterThread();
        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(l1);
        t1.start();
        t2.start();

    }

    static class Count {
        static int count = 1;

    }

    static class NumberThread implements Runnable {

        @Override
        public void run() {

            for (int num = 1; num <= 52; num++) {
                synchronized (Count.class) {
                    while (Count.count % 3 == 0) {
                        try {
                            Count.class.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    System.out.print(num + "");
                    Count.count++;
                    Count.class.notify();
                }

            }


        }
    }


    static class LetterThread implements Runnable {
        @Override
        public void run() {
            for (char c = 'A'; c <= 'Z'; c++) {
                //打印字母要同步
                synchronized (Count.class) {

                    // 1.要判断是否该打印
                    while (Count.count % 3 != 0) {
                        try {
                            Count.class.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    //2.打印
                    System.out.print(c + " ");
                    //3.打印后统计数字+1
                    Count.count++;
                    //4.唤醒别的线程打印
                    Count.class.notify();
                }
            }
        }
    }
}


