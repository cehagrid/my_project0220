package com.atguigu.static03.implementsexer;

import org.junit.jupiter.api.Test;

/*
### 练习:

#### 几何图形

（1）声明一个抽象图形父类Shape，包含

- public abstract double area()
- public abstract double perimeter()
- public String toString()：返回“面积：xxx，周长：xxx”

（2）声明一个矩形Rectangle，继承Shape父类

- 属性：长和宽，私有化
- 提供get/set
- 提供无参构造和有参构造
- 重写area()和perimeter方法，
- 重写toString方法，返回“长：xx，宽：xx，面积：xxx，周长：xxx”

（3）声明一个三角形Triangle，继承Shape父类

- 属性：a,b,c分别代表三角形的三边，私有化
- 提供get/set
- 提供有参构造，public Triangle(double a, double b, double c)，并验证a,b,c的值是否可以构成三角形，如果可以构成三角形再为a,b,c的属性赋值
- 重写area()和perimeter方法，
- 重写toString方法，返回“边长：xx,xx,xx，面积：xxx，周长：xxx”

（4）在测试类中，

- 创建两个矩形（2,3）,（3,6），创建2个三角形(3,4,5）,（6,6,6)，
- 创建Shape数组中，把上面4个对象放到数组中，遍历显示信息
 */
public class Test1 {
    @Test
    public void test(){
        Rectangle r1 = new Rectangle(2, 3);
        Rectangle r2 = new Rectangle(3, 6);
        Triangle t1 = new Triangle(3, 4, 5);
        Triangle t2 = new Triangle(6, 6, 6);

        Shape[] arr = new Shape[4];
        arr[0] = r1;
        arr[1] = r2;
        arr[2] = t1;
        arr[3] = t2;

        for(Shape s : arr){
            System.out.println(s.toString());
        }
    }
}


