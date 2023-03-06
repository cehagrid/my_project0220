package com.atguigu.getclass;

import org.junit.jupiter.api.Test;

import java.util.Objects;

public class GetClassTest {
    @Test
    public void test(){
        Person p = new Person();
        Student s = new Person();
        System.out.println("p = " + p);
        System.out.println("s = " + s);
    }

    int i = 0;
    public GetClassTest() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetClassTest that = (GetClassTest) o;
        return i == that.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }

    @Override
    public String toString() {
        return "GetClassTest{" +
                "i=" + i +
                '}';
    }
}


