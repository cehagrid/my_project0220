package com.atguigu.oop;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void test(){
        Person person = new Person();
        person.setArmor(100);
        System.out.println("person = " + person);
    }
}


