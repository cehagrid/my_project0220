package com.atguigu.oop;

public class Dog implements Creature{
    @Override
    public void show() {
        System.out.println("汪 汪 ");
    }

    @Override
    public void eat() {
        System.out.println("吃");

    }
}


