package com.atguigu.lambda;

import org.junit.Test;

@FunctionalInterface
public interface ATest {
    void A();

}

class A{
    B b = (int a,int b,int c) -> { return a+b+c;};

    String text = """

    人最宝贵的东西是生命，生命对人来说只有一次。\

    因此，人的一生应当这样度过：当一个人回首往事时，\

    不因虚度年华而悔恨，也不因碌碌无为而羞愧；\

    这样，在他临死的时候，能够说，\

    我把整个生命和全部精力都献给了人生最宝贵的事业\

    ——为人类的解放而奋斗。

    """;


}


