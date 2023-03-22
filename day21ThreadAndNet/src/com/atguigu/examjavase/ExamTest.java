package com.atguigu.examjavase;

import org.junit.Test;

import java.lang.invoke.CallSite;
import java.util.*;

public class ExamTest {
    //冒泡排序
    @Test
    public void test() {
        int[] arr = {5, 7, 3, 9, 2};
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
    }

    @Test
    public void test02() {
        String str = fileExtNameFromUrl("http://localhost:8080/testweb/index.html");
        System.out.println(str);
    }

    public static String fileExtNameFromUrl(String url) {
        return url.substring(url.lastIndexOf('.') + 1);
    }

    @Test
    public void test03() {
        enum Week {
            MONDAY(1, "星期一"),
            TUESDAY(2, "星期二"),
            WEDNESDAY(3, "星期三"),
            THURSDAY(4, "星期四"),
            FRIDAY(5, "星期五"),
            SATURDAY(6, "星期六"),
            SUNDAY(7, "星期日");

            private int number;
            private String decription;

            private Week(int number, String decription) {
                this.number = number;
                this.decription = decription;
            }

            public static Week getByNumber(int number) {
                switch (number) {
                    case 1:
                        return MONDAY;
                    case 2:
                        return TUESDAY;
                    case 3:
                        return WEDNESDAY;
                    case 4:
                        return THURSDAY;
                    case 5:
                        return FRIDAY;
                    case 6:
                        return SATURDAY;
                    case 7:
                        return SUNDAY;
                    default:
                        return null;
                }
            }

            @Override
            public String toString() {
                return super.toString() + "(" + number + "," + decription + ")";
            }
        }


    }

    @Test
    public void test04() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("java");
        list.add("world");

        //迭代
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if ("java".equals(next)) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    @Test
    public void test05() {
        HashMap<String, List<String>> map = new HashMap<>();
//        List<String> strings = Arrays.asList("hello", "world");
//        strings.add("hello");//UnsupportedOperationException
//        strings.add("java");//.UnsupportedOperationException
        map.put("北京市", Arrays.asList("北京市"));
        map.put("海南省",Arrays.asList("海口市","三亚市"));
        map.put("浙江省",Arrays.asList("绍兴市","温州市","湖州市","嘉兴市","台州市","金华市",
                "舟山市","衢州市","丽水市"));
        Set<Map.Entry<String, List<String>>> entries = map.entrySet();
        for (Map.Entry<String, List<String>> entry : entries) {
            System.out.println(entry.getKey());
            for (String s : entry.getValue()) {
                System.out.println("\t " + s);
            }
        }
    }

}


