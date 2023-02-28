package com.atguigu.method;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
    @Test
    public void test() {
        boolean invoke = false;
        try {
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
            invoke = (boolean) isPrime.invoke(reflectionTest, 3);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
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


