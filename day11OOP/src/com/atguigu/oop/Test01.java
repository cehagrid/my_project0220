package com.atguigu.oop;

import org.junit.Test;

public class Test01 {
    @Test
    public void test(){
        Animal animal = new Animal();
        Plant plant = new Plant();
        animal.eat();
        animal.breathe();
        animal.sleep();
        plant.eat();
        plant.breathe();
        plant.sleep();
        LiveAble.drink();
    }
}


