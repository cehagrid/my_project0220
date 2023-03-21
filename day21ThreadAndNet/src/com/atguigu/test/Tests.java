package com.atguigu.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

class Tests1 {
    @Test
    public void test() {
        Integer[] datas = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(datas);
        list.add(5);
        System.out.println(list.size());
    }
    
    @Test
    public void test02(){

    }
}

public class Tests {
    public static void main(String[] args) throws InterruptedException {
        MyThread m = new MyThread();
        Thread t = new Thread(m);
        t.start();

        t.interrupt();
//t.join();
        int j = m.i;
        System.out.println(j);
    }
}
class MyThread implements Runnable{
    int i;
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i=100;
    }
}



