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
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, double.class, int.class, char.class);
        constructor.setAccessible(true);
        Object instance = constructor.newInstance("东皇太一", 99999.9, 26, '蛇');
        System.out.println("instance = " + instance);

        //Method
//        Person p = (Person) instance;

        Class<?> aClass = PersonTest.class.getClassLoader().loadClass("com.atguigu.constructor.Person");
        Method method = aClass.getDeclaredMethod("toString", null);
        method.setAccessible(true);
        //todo:静态方法对象可以传入null
        Object invoke = method.invoke(instance, null);
        System.out.println("invoke = " + invoke);

        //Field
        Class<?> aClass1 = PersonTest.class.getClassLoader().loadClass("com.atguigu.constructor.Person");
        Field name = aClass1.getDeclaredField("name");
        name.setAccessible(true);
        name.get(instance);
        name.set(instance, "大乔");
        System.out.println("name = " + instance);


        Class<?> aClass2 = Class.forName("com.atguigu.constructor.PersonTest").
                getClassLoader().loadClass("com.atguigu.constructor.Person").
                getClassLoader().loadClass("com.atguigu.constructor.PersonTest").
                getClassLoader().loadClass("com.atguigu.constructor.Person").
                getClassLoader().loadClass("com.atguigu.constructor.PersonTest").
                getClassLoader().loadClass("com.atguigu.constructor.Person");

        System.out.println("aClass2 = " + aClass2);
    }
}


