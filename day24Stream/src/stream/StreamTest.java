package stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    @Test
    public void test01() {
        //流不改变数据源
        //每次操作产生一个新的流
        //中间操作12种
        //终结操作12种
        //不写终结操作的流是无效的

        ArrayList<Object> list = new ArrayList<>();
        Collections.addAll(list, 10, 11, 12, 13, 14, 15, 16, 17, 11, 10);
        System.out.println("list = " + list);
        //创建流操作
        Stream<Object> stream = list.stream();
        Stream<Object> distinct = stream.distinct();
//        String s = distinct.toString();
//        System.out.println("s = " + s);
        distinct.forEach(System.out::println);


    }

    @Test
    public void test02(){
        List<Integer> list1 = Stream.of(1, 1, 3, 4, 5, 8, 1, 12, 5, 3, 2, 4, 12)
                .distinct() //去重复
                .sorted() //排序
                .peek(t -> System.out.println(t))
                .collect(Collectors.toList());

        System.out.println("list = " + list1);
    }

    @Test
    public void test03(){
        ArrayList<Object> list = new ArrayList<>();
        Collections.addAll(list, 10,11,12,13,14,15,10,11);
        System.out.println(list);
        //创建
        Stream<Object> stream = list.stream();
        //中间
        Stream<Object> distinct = stream.distinct();
        //终结
        List<Object> list1 = distinct.collect(Collectors.toList());
        System.out.println("list1 = " + list1);

    }
}

