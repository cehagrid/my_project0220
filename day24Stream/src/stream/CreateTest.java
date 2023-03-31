package stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*
创建流操作:
  数组
  集合
  Stream

 */
public class CreateTest {

    @Test
    public void test01() {
        //todo 将数组转为流
        String[] arr = {"Bob", "Jim", "Marry"};
        Stream<String> stream = Arrays.stream(arr);

    }

    @Test
    public void test02() {
        //todo 将集合转为流
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 10, 11, 12, 13, 14, 15);

        Stream<Integer> stream = list.stream();

    }

    @Test
    public void test03() {
        //todo Stream中方法转为流
        Stream<Integer> stream = Stream.of(10, 12, 13, 14, 15, 16);
        stream.forEach(System.out::println);
    }

    @Test
    public void test04() {
        //todo 无限流 Stream中方法转为流
//        Stream.generate(new Supplier<Double>() {
//            @Override
//            public Double get() {
//                return Math.random();
//            }
//        }).forEach(System.out::println);

        Stream.generate(Math::random).forEach(System.out::println);
    }
}
