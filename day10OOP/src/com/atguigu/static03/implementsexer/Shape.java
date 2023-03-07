package com.atguigu.static03.implementsexer;

/*
1）声明一个抽象图形父类Shape，包含

- public abstract double area()
- public abstract double perimeter()
- public String toString()：返回“面积：xxx，周长：xxx”
 */
abstract public class Shape {
    public abstract double area();

    public abstract double perimeter();

    public String toString() {
        return " 面积：" + area() + "，周长：" + perimeter();
    }
}


