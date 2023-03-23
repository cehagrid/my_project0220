package com.atguigu.examjavase;

public class DateTest {
    public static void main(String[] args) {
        int year1start = 201405;
        int year1end = 201508;

        int year2start = 201403;
        int year2end = 201606;
        //1.先找到交集(i,j)
        int i = Math.max(year1start, year2start);
        int j = Math.min(year1end, year2end);
        //2.看月份需不需要借位
        int mstart = i % 100;
        int mend = j % 100;
        if (mstart > mend) {
            //需要借位的情况
            int num = 12 - mstart  + mend;
            num = num + 1 + ((j/100)-(i/100)-1)*12;
            System.out.println("num = " + num);
        }else{
            //不需要借位
            int num  = mend - mstart;
            num = num + 1 + ((j/100)-(i/100))*12;
            System.out.println("num = " + num);
        }

    }
}


