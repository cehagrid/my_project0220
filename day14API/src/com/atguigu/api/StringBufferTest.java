package com.atguigu.api;

import org.junit.Test;

public class StringBufferTest {
    @Test
    public void test(){
        string ();
        stringBuffer();
        stringBuilder();
    }

    private void string() {
        String str = new String();
        long start = System.currentTimeMillis();
        for(int i = 0; i<1_0000;i++){
            str+=i;
        }
        long end = System.currentTimeMillis();
        System.out.println("String 1万次用时:"+(end - start));
    }

    private void stringBuilder() {
        StringBuilder str = new StringBuilder();
        long start = System.currentTimeMillis();
        for(int i = 0; i<1_000_000;i++){
            str.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder 100万次用时:"+(end - start));
    }

    private void stringBuffer() {
        StringBuffer str = new StringBuffer();
        long start = System.currentTimeMillis();
        for(int i = 0; i<1_000_000;i++){
            str.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuffer 100万次用时:"+(end - start));
    }
}


