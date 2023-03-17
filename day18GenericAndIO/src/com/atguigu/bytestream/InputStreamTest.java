package com.atguigu.bytestream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamTest {
    @Test
    public void test() throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\aa.txt");
        byte[] buffer = new byte[3];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            System.out.print(new String(buffer));
        }
    }
}


