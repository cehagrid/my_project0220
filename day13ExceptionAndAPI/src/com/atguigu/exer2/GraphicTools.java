package com.atguigu.exer2;

public class GraphicTools {


    public static void printRectangle(int line,int column,char sign) throws InvalidValueException {
        if (line <= 0 || column <= 0) {

            throw new InvalidValueException("矩形的长和宽必须是正整数!");
        }
        if (sign < 33 || sign > 126) {
            throw new InvalidValueException("组成矩形的字符必须是数字字母和基本标点符号!");
        }
        //外层循环line
        for (int i = 0; i < line; i++) {
            //内层循环column
            for (int j = 0; j < column; j++) {
                System.out.print(sign);
            }
            System.out.println();
        }
    }
}


