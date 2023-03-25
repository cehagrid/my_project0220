package com.atguigu.annoation.a1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno1 {
    //public interface MyAnno1 extends Annotation
    String name();
    double salary() default 99999.9;
    int number();
}

@interface MyAnno2{
    String name() default "张飞";
    int d();
}




@MyAnno1(name = " ",number = 99999)
class AA{
    @MyAnno1(name="赵云",number = 99,salary =20000000)
     void show(){

    }
    @MyAnno2(d=1)
    int name;
}
