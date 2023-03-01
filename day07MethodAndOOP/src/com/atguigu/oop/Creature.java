package com.atguigu.oop;

interface Creature {
    public abstract void show();

    public static void blood(int num) {
        System.out.println("血量："+num);
    }
    public abstract void eat();

    public default void attack(int num) {
        System.out.println("攻击力：" + num);
    }
}


