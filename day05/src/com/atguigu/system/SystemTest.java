package com.atguigu.system;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SystemTest {

    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c", "d", "e", "f"};
        String[] arr2 = new String[arr1.length];
        System.arraycopy(arr1, 1, arr2, 0, 3);
        System.out.println(Arrays.toString(arr2));
    }

    @Test
    public void test(){
        Runtime runtime = Runtime.getRuntime();
        System.out.println("runtime.totalMemory() = " + runtime.totalMemory());
        System.out.println("runtime.freeMemory() = " + runtime.freeMemory());
        for (int i = 0; i <10000;i++){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
        System.out.println("runtime.totalMemory() = " + runtime.totalMemory());
        System.out.println("runtime.freeMemory() = " + runtime.freeMemory());
    }

}


