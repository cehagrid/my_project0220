package com.atguigu.static03.implementsexer;

/*
（3）声明一个三角形Triangle，继承Shape父类

- 属性：a,b,c分别代表三角形的三边，私有化
- 提供get/set
- 提供有参构造，public Triangle(double a, double b, double c)，并验证a,b,c的值是否可以构成三角形，如果可以构成三角形再为a,b,c的属性赋值
- 重写area()和perimeter方法，
- 重写toString方法，返回“边长：xx,xx,xx，面积：xxx，周长：xxx”

 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("输入参数有误!");
        }
    }

    @Override
    public double area() {
        return 0.25 * Math.sqrt((a + b + c) * (a + b - c) * (a + c - b) * (b + c - a));
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }

    @Override
    public String toString() {
        return "边长:"+a+","+b+","+c+","+super.toString();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}


