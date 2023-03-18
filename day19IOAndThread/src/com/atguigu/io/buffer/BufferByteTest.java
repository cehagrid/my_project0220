package com.atguigu.io.buffer;

import org.junit.Test;

import java.io.*;

public class BufferByteTest {
    @Test
    public void test02() throws Exception {
        OutputStream os = new FileOutputStream("D:/os.txt");

        BufferedOutputStream bos = new BufferedOutputStream(os);

        bos.write(65);
        bos.flush();
        System.out.println("finished");


    }


    @Test
    public void test() throws FileNotFoundException {
        InputStream is = new FileInputStream("D:/a.txt");

        BufferedInputStream bis = new BufferedInputStream(is);


    }
}


