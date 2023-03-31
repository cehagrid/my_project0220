package stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//中间操作
public class MiddleTest {
    @Test
    public void test() {
        String[] sArr = {"李白", "杜甫", "王维", "李商隐"};
        List<String> collect = Arrays.stream(sArr)
                .flatMap(s -> {
                    String[] array = s.split("");
                    return Stream.of(array);

//                }).collect(Collectors.toList());
                }).toList();

        collect.forEach(System.out::print);
    }
    @Test
    public void test02(){
        List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .filter(i -> i % 2 != 0)
                .toList();
        System.out.println("list = " + list);
    }
}


