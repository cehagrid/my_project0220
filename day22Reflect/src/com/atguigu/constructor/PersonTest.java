package com.atguigu.constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PersonTest {
    @Test
    public void test01() throws Exception {
        //1.class
        Class clazz = Class.forName("com.atguigu.constructor.Person");
        //2.获取构造器
        Constructor constructor = clazz.getDeclaredConstructor(String.class, double.class, int.class, char.class);
        //3.跳过检查
        constructor.setAccessible(true);
        //4.创建一个实例
        Object instance = constructor.newInstance("云樱", 8888.9, 22, '女');
        //5.数据展示
        System.out.println("instance = " + instance);

    }

    @Test
    public void test02() throws Exception {
        //Constructor
        Class<?> clazz = PersonTest.class.getClassLoader().loadClass("com.atguigu.constructor.Person");
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class,double.class,int.class,char.class);
        constructor.setAccessible(true);
        Object instance = constructor.newInstance("东皇太一", 99999.9, 26, '蛇');
        System.out.println("instance = " + instance);

        //Method
        Person p = (Person) instance;

        Class<?> aClass = PersonTest.class.getClassLoader().loadClass("com.atguigu.constructor.Person");
        Method method = aClass.getDeclaredMethod("toString", null);
        method.setAccessible(true);
        Object invoke = method.invoke(p, null);
        System.out.println("invoke = " + invoke);

        Class<?> aClass1 = PersonTest.class.getClassLoader().loadClass("com.atguigu.constructor.Person");
        Field name = aClass1.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p,"大乔");
        System.out.println("name = " + p);

    }
}


