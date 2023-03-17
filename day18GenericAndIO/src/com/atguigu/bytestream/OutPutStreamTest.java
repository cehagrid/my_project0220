package com.atguigu.bytestream;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutStreamTest {
    @Test
    public void test(){
        FileOutputStream fos = null;
        try {
            //1.
            fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\aa.txt");

            //2.
            fos.write("我于杀戮之中绽放,\n亦如黎明中的花朵".getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}


