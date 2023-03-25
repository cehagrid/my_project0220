package com.atguigu.optional;

import org.junit.Test;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalTest {
    @Test
    public void test01(){
        String s = null;
        Optional<String> optional = Optional.ofNullable(s);
        String orElse = optional.orElse("空指针了");
        System.out.println("orElse = " + orElse);
    }

    @Test
    public void test02(){
        String s = null;
        Optional<String> optional = Optional.ofNullable(s);
        optional.orElseGet(new Supplier<String>() {
            @Override
            public String get() {
                return null;
            }
        });
    }
}


