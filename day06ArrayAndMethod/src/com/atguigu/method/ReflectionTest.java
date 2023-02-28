package com.atguigu.method;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionTest {
    @Test
    public void test() throws Exception {
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class<?> clazz = classLoader.loadClass("com.atguigu.method.ReflectionTest");

        //1.创建构造器,创建对象（可以带参，更普适，构造器就是对象）
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        //2.
        constructor.setAccessible(true);
        //3.构造器传参数
        ReflectionTest reflectionTest = (ReflectionTest) constructor.newInstance();

        Method isPrime = clazz.getDeclaredMethod("isPrime", int.class);
        isPrime.setAccessible(true);
        boolean invoke = (boolean) isPrime.invoke(reflectionTest, 3);
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


