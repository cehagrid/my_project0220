package com.atguigu.oop2;

public class Triangle {
    private double LineA,LineB,LineC;

    public Triangle(double lineA, double lineB, double lineC) {
        LineA = lineA;
        LineB = lineB;
        LineC = lineC;
        setBases(lineA ,lineB, lineC);
    }

    public double getLineA() {
        return LineA;
    }

    public void setLineA(double lineA) {
        LineA = lineA;
    }

    public double getLineB() {
        return LineB;
    }

    public void setLineB(double lineB) {
        LineB = lineB;
    }

    public double getLineC() {
        return LineC;
    }

    public void setLineC(double lineC) {
        LineC = lineC;
    }
    /*
    判断是否是合格的三角形
     */
    public boolean setBases(double a,double b,double c){
        if (a>=0 && b>=0 && c>=0 && a+b>c && a+c>b && b+c>a){
            return true;
        }else{
//            System.out.println("Error");
            return false;
        }
    }
    /*
    返回三角形的面积
     */
    public double getArea(){
        double p =  (LineA+LineB+LineC)/2;
        return Math.sqrt(p*(p-LineA)*(p-LineB)*(p-LineC));
    }
    /*
    返回三角形的周长
     */
    public double getPerimeter(){
        return LineA+LineB+LineC;
    }


    public String getInfo() {
        if (setBases(LineA, LineB, LineC)){

        return "TriAngle{" +
                "LineA=" + LineA +
                ", LineB=" + LineB +
                ", LineC=" + LineC +
                ",area=" + getArea() +
                ",getPerimeter=" + getPerimeter()+
                '}';
        }else{
            return "Error";
        }
    }
}


