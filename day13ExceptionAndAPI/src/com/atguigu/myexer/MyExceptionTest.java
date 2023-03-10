package com.atguigu.myexer;

import org.junit.Test;


public class MyExceptionTest {
    @Test
    public void test(){

        try {
            extracted();
        } catch (MyException e) {
            System.err.println(e);
//            e.getMessage();
//            e.printStackTrace();
        }


    }

    private static void extracted() throws MyException {
//        int arr[] = new int[1];
//        if (arr != null)
//            arr[0] = 1;
//            throw new MyException("你在搞事情!");
        throw new MyException("你在搞事情!");
    }
}


