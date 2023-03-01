package com.atguigu.oop;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RectangleTest {
    @Test
    public void test() throws Exception {
        ClassLoader classLoader = Rectangle.class.getClassLoader();
        Class<?> clazz = classLoader.loadClass("com.atguigu.oop.Rectangle");

        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Rectangle r = (Rectangle) constructor.newInstance();

        Method toString = clazz.getDeclaredMethod("toString",null);
        toString.setAccessible(true);
        toString.invoke(r,null);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
    }

}


