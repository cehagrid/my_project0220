package com.atguigu.oop;

public class Rectangle {
    static int width;
    static int height;
    static {
        width = 2;
        height = 3;
    }

    public int perimeter(){
        return width*2+height*2;
    }
    public int area(){
        return width*height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", 面积="+area()+
                ", 周长="+perimeter()+
                '}';
    }
}


