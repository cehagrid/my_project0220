package com.atguigu.single;

public class LazyHungry {
    private static LazyHungry hungry;

    private LazyHungry() {
    }

    public LazyHungry getHungry() {
        if (hungry == null) {
            synchronized (LazyHungry.class) {
                if (hungry == null) {
                    hungry = new LazyHungry();
                }
            }

        }

        return hungry;
    }


}

