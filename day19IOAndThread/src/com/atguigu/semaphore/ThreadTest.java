package com.atguigu.semaphore;

import java.util.concurrent.*;

public class ThreadTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (Thread.currentThread()) {

                    while (true) {
                        System.out.println("小兔子乖乖.....");
                    }
//                    Thread.wait();
                }
            }
        }).start();

        new Thread(() -> System.out.println("大兔子乖乖*******")).start();


    }


     public static class NumThread implements Callable{
        //2.实现call方法，将此线程需要执行的操作声明在call()中
        @Override
        public Object call() throws Exception {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                if(i % 2 == 0){
                    System.out.println(i);
                    sum += i;
                }
            }
            return sum;
        }
    }

    public class ThreadNew {
        public static void main(String[] args) {
            //3.创建Callable接口实现类的对象
            NumThread numThread = new NumThread();
            //4.将此Callable接口实现类的对象作为传递到FutureTask构造器中，创建FutureTask的对象
            FutureTask futureTask = new FutureTask(numThread);
            //5.将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()
            new Thread(futureTask).start();

            try {
                //6.获取Callable中call方法的返回值
                //get()返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值。
                Object sum = futureTask.get();
                System.out.println("总和为：" + sum);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

    }

    static class NumberThread implements Runnable{

        @Override
        public void run() {
            for(int i = 0;i <= 100;i++){
                if(i % 2 == 0){
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        }
    }

    static class NumberThread1 implements Runnable{

        @Override
        public void run() {
            for(int i = 0;i <= 100;i++){
                if(i % 2 != 0){
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        }
    }

    public class ThreadPool {

        public static void main(String[] args) {
            //1. 提供指定线程数量的线程池
            ExecutorService service = Executors.newFixedThreadPool(10);
            ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;
            //设置线程池的属性
//        System.out.println(service.getClass());
//        service1.setCorePoolSize(15);
//        service1.setKeepAliveTime();


            //2.执行指定的线程的操作。需要提供实现Runnable接口或Callable接口实现类的对象
            service.execute(new NumberThread());//适合适用于Runnable
            service.execute(new NumberThread1());//适合适用于Runnable

//        service.submit(Callable callable);//适合使用于Callable
            //3.关闭连接池
            service.shutdown();
        }

    }


}


