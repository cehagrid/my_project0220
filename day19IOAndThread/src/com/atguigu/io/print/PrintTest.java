package com.atguigu.io.print;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintTest {
    @Test
    public void test01() throws FileNotFoundException {
        PrintStream ps = new PrintStream("D:/ps.txt");

        ps.println(100);
        ps.println("AA");
        ps.close();
    }
}


