import org.junit.jupiter.api.Test;
/*
    猴子吃桃每天吃一半,又多一个
 */
public class MorningExer {
    @Test
    public void test(){
        System.out.println(peach(10));
    }
    public int peach(int day){
        if (day == 1) {
            return 1;
        }else {
            return 2*(peach(day-1)+1);
        }
    }
}


