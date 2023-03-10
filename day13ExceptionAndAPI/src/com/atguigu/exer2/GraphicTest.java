package com.atguigu.exer2;

import org.junit.Test;

public class GraphicTest {
    @Test
    public void test() {
        GraphicTools g = new GraphicTools();
        try {
            g.printRectangle(-5,5, (char) 52);
        } catch (InvalidValueException e) {
//            System.out.println("e.getMessage() = " + e.getMessage());
//            System.exit(0);
            System.err.println(e);
            e.printStackTrace();
//            throw new RuntimeException(e);
        }

    }
}


