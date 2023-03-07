package com.atguigu.oop;

interface LiveAble {
    void eat();
    void breathe();

    default void sleep(){
        System.out.println("静止不动");
    }

    static void drink(){
        System.out.println("喝水");
    }

}

class Animal implements LiveAble{
    @Override
    public void eat() {
        System.out.println("吃东西");
    }

    @Override
    public void breathe() {
        System.out.println("吸入氧气,呼出二氧化碳");
    }

    @Override
    public void sleep() {
        System.out.println("躺下闭眼睡觉");
    }
}

class Plant implements LiveAble{
    @Override
    public void eat() {
        System.out.println("吸收营养");
    }

    @Override
    public void breathe() {
        System.out.println("吸入二氧化碳呼出氧气");
    }
}

