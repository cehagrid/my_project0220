package com.atguigu.io.other;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOUtilsTest {
    @Test
    public void test1() throws IOException {
        IOUtils.copy(new FileInputStream("C:\\Users\\Administrator\\Desktop\\aa.txt"),
                new FileOutputStream("D:/gg.jpg"));
    }
}


