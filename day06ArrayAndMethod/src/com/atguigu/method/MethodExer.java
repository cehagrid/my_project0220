package com.atguigu.method;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodExer {
    @Test
    public void test() throws NoSuchMethodException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        ClassLoader classLoader = MethodExer.class.getClassLoader();
        Class<?> clazz = classLoader.loadClass("com.atguigu.method.MethodExer");

        MethodExer methodExer = (MethodExer)clazz.newInstance();

        Method printRectangle = clazz.getDeclaredMethod("PrintRectangle",int.class,int.class);
        printRectangle.setAccessible(true);
//        Object returnValue = printRectangle.invoke(methodExer, 3, 5);
        printRectangle.invoke(methodExer, 3, 5);
//        System.out.println(returnValue);
//        PrintRectangle(3,5);
        oddJudge(3);
    }

    private void PrintRectangle(int wide,int height){
        for (int i = 0; i < wide; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    private void oddJudge(int num){
        if(num % 2 !=0){
            System.out.println(num+"是奇数");
        }else {
            System.out.println(num+"不是奇数");
        }
    }
    
    @Test
    public void test1() throws Exception {
        ClassLoader classLoader = MethodExer.class.getClassLoader();
        Class<?> clazz = classLoader.loadClass("com.atguigu.method.MethodExer");
        MethodExer methodExer = (MethodExer)clazz.newInstance();

        Method isPrime = clazz.getDeclaredMethod("isPrime", int.class);
        isPrime.setAccessible(true);
        boolean invoke = (Boolean) isPrime.invoke(methodExer, 37);

        System.out.println(invoke);


    }

    private boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


