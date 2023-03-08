package enum01;

import enum01.exer.Month;
import org.junit.Test;
/*

枚举内的方法:
    1. Season.values();
    2. Season.valueOf("AUTUMN");
    3. name();
    4. ordinal();
 注意:
    1.枚举对象需要在属性的上面
    2.valueOf values 由编译器产生
    3.自定义枚举类型 默认继承自Enum类 所以不能继承其他类
    4.switch(表达式)表达式: byte short int char String enum
    5.枚举类型可以实现接口 既可以统一处理持续方法 也可以每一个枚举对象进行自定义处理


 */
public class EnumTest {

    @Test
    public void test05(){

        Gender man = Gender.MAN;

        man.walk();

        Gender woman = Gender.WOMAN;

        woman.walk();

    }


    @Test
    public void test04(){
        Season spring = Season.SPRING;

        switch (spring){
            case SPRING:
                System.out.println(666);
                break;
            case SUMMER:
                System.out.println(999);
                break;
        }






    }

    @Test
    public void test03(){
        Season obj = Season.valueOf("AUTUMN");
        //获取枚举对象的名字
        String name = obj.name();
        System.out.println("name = " + name);

        int ordinal = obj.ordinal();
        System.out.println("ordinal = " + ordinal);

        System.out.println("---------------------------");


        Season[] values = Season.values();
        for (Season value : values) {
            String n = value.name();

            int o = value.ordinal();

            System.out.println("n = " + n+", o = "+o);
        }


    }

    @Test
    public void test02(){
        //2.根据枚举对象的名字获取指定的枚举对象
        Season obj = Season.valueOf("SPRING");

        System.out.println("obj = " + obj);

    }



    @Test
    public void test01(){
        //获取所有的枚举对象
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value);
        }

        Season obj = Season.valueOf("AUTUMN");

        System.out.println(obj);
        Season obj2 = Season.valueOf("SPRING");
        System.out.println(obj2);
        String name = obj.name();
        System.out.println(name);
        int ordinal = obj.ordinal();
        System.out.println(ordinal);

    }

    @Test
    public void Enum(){
        Month june = Month.valueOf("JUNE");
        System.out.println(june);
        for (Month value : Month.values()) {
            System.out.println(value);
        }



    }

}
