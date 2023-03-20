package com.atguigu.notify.n1;

public class Test {

    public static void main(String[] args) {

        //公共的吧台
        Bar bar = new Bar();


        CookThread c1 = new CookThread(bar);
        c1.setName("粤菜大厨");

        WaiterThread w1 = new WaiterThread(bar);
        w1.setName("靓仔");



        c1.start();
        w1.start();




    }
}
