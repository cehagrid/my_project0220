package com.atguigu.bytestream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {
    @Test
    public void test() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\aa.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\bb.txt");

        byte[] buff = new byte[1];
        int len;
        while ((len = fis.read(buff))!=-1){
            fos.write(buff, 0,len);
        }
        fos.close();
        fis.close();

    }

}


