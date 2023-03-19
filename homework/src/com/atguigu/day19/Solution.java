package com.atguigu.day19;
//3. 无重复字符的最长子串

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    @Test
    public void test1() {
        String str = "aascdxaaxzcvbn";
        Solution solution = new Solution();
        int length = solution.lengthOfLongestSubstring(str);
        System.out.println("length = " + length);


    }

//    public int lengthOfLongestSubstring(String s) {
//        char[] chars = s.toCharArray();
//        //数组中两个指针指向最长的字符串的首尾,一个int subMax记录长度,另一个遍历是否有重复的指针
//        int head, tail, subMax;
//        head = 0;
//        tail = subMax = 1;
//        //外层循环扩大子串长度
//        for (tail = head; tail < s.length(); tail++) {
//            //内层查重,查到重复,记录长度,head到重复字符后一位
//            for (int j = head; j < tail; j++) {
//                if (chars[tail] == chars[j]) {
//                    head = j + 1;
//                    break;
////                    tail;
//                }
//            }
//            subMax = subMax > tail - head ? subMax + 1 : tail - head;
//        }
//        return subMax;
//    }

    public int lengthOfLongestSubstring(String s) {
        // 哈希集合，记录每个字符是否出现过
//        Set<Character> occ = new HashSet<Character>();
//        int n = s.length();
//        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
//        int rk = -1, ans = 0;
//        for (int i = 0; i < n; ++i) {
//            if (i != 0) {
//                // 左指针向右移动一格，移除一个字符
//                occ.remove(s.charAt(i - 1));
//            }
//            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
//                // 不断地移动右指针
//                occ.add(s.charAt(rk + 1));
//                ++rk;
//            }
//            // 第 i 到 rk 个字符是一个极长的无重复字符子串
//            ans = Math.max(ans, rk - i + 1);
//        }
//        return ans;
        HashSet set = new HashSet();
        int n = s.length();

        int rk = -1, ans = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {//忽略第一次
                set.remove(s.charAt(i - 1));//删除左端点字符
            }
            //如果下一个字符和中间的某个字符重复了,就会一直包含导致i一直右移直到去除掉此此字符为止
            while (rk + 1 < n && !set.contains(s.charAt(rk + 1))) {//指针不断右移,在长度范围内,在集合外则加入集合
                set.add(s.charAt(rk + 1));
                rk++;
            }
            ans = Math.max(ans, rk - i + 1);//重复或结束的时候找一下最大值

        }
        return ans;
    }
}

//    作者：LeetCode-Solution
//    链接：https://leetcode.cn/problems/longest-substring-without-repeating-characters/solution/wu-zhong-fu-zi-fu-de-zui-chang-zi-chuan-by-leetc-2/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
