package com.atguigu.day14;

import org.junit.Test;

import java.io.IOException;

public class ExceptionExer {
    @Test
    public void test() {
        int a = -1;
        try {
            if (a > 0) {
                throw new RuntimeException("");
            } else if (a < 0) {
                throw new IOException("");
            } else {
                return;
            }
        } catch (IOException ioe) {
            System.out.println("IOException");
        } catch (Throwable e) {
            System.out.println("Throwable");
        } finally {
            System.out.println("finally");
        }
    }


}





