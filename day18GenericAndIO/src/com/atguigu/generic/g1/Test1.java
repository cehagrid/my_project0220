package com.atguigu.generic.g1;

import org.junit.Test;

public class Test1 {
    @Test
    public void test(){
        Student<String> student = new Student<>("李明","98");
        Student<Object> student1 = new Student<>("韩梅梅",1000);
    }

}


