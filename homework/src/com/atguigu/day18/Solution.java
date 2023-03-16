package com.atguigu.day18;

//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode head = null, tail = null;
//        int carry = 0;
//        while (l1 != null || l2 != null) {
//            int n1 = l1 != null ? l1.val : 0;
//            int n2 = l2 != null ? l2.val : 0;
//            int sum = n1 + n2 + carry;
//            if (head == null) {
//                head = tail = new ListNode(sum % 10);
//            } else {
//                tail.next = new ListNode(sum % 10);
//                tail = tail.next;
//            }
//            carry = sum / 10;
//            if (l1 != null) {
//                l1 = l1.next;
//            }
//            if (l2 != null) {
//                l2 = l2.next;
//            }
//        }
//        if (carry > 0) {
//            tail.next = new ListNode(carry);
//        }
//        return head;
//    }
//}

import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {

        ListNode listNode = new ListNode();
        listNode.val = 9;
        listNode.next = new ListNode();
        listNode.next.val = 9;
        listNode.next.next = new ListNode();
        listNode.next.next.val = 9;
        listNode.next.next.next = new ListNode();
        listNode.next.next.next.val = 9;
        listNode.next.next.next.next = new ListNode();
        listNode.next.next.next.next.val = 9;
        listNode.next.next.next.next.next = new ListNode();
        listNode.next.next.next.next.next.val = 9;


        ListNode listNode1 = new ListNode();
        listNode1.val = 9;
        listNode1.next = new ListNode();
        listNode1.next.val = 9;
        listNode1.next.next = new ListNode();
        listNode1.next.next.val = 9;
        listNode1.next.next.next = new ListNode();
        listNode1.next.next.next.val = 9;

        ListNode numbers = Solution.addTwoNumbers(listNode1, listNode);
        while (numbers.next != null) {
            System.out.print(numbers.val + "->");
            numbers = numbers.next;
        }
        System.out.println(numbers.val);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tailNode = null;
        ListNode headNode = null;
        int carry = 0;
        //9 -> 5 -> 7 + 2 -> 4 -> 3
        //759 + 342
        //如果l1和l2都没用完,就进入加法的循环
        while (l1 != null || l2 != null) {//永远不能l1.next循环,会空指针异常
            int n1 = l1 == null ? 0 : l1.val;//先耗尽的补0等待
            int n2 = l2 == null ? 0 : l2.val;
            int sum = n1 + n2 + carry;
            if (headNode == null) {//第一次创建不一样
                headNode = tailNode = new ListNode(sum % 10);
            } else {
                tailNode.next = new ListNode(sum % 10);
                tailNode = tailNode.next;
            }
            carry = sum / 10;


            if (l1 != null) {//进入下一位
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {//循环结束处理最后一位
            tailNode.next = new ListNode(carry);
        }
        return headNode;


//            先考虑边界情况
//            if(l1 == null){
//                while (l2.next!=null){
//                    resNode.next = new ListNode();
//                    resNode = resNode.next;
//                    resNode.val = l2.val+carry;
//                    if(resNode.val/10 == 1){
//                        resNode.val %= 10;
//                        carry = 1;
//                    }
//                    l2 = l2.next;
//                    resNode = resNode.next;
//                }
//                return returnNode;
//            }
//            if(l2 == null){
//                while (l1.next!=null){
//                    resNode.next = new ListNode();
//                    resNode = resNode.next;
//                    resNode.val = l1.val+carry;
//                    l1 = l1.next;
//                    if(resNode.val/10 == 1){
//                        resNode.val %= 10;
//                        carry = 1;
//                    }
//                    l1 = l1.next;
//                    resNode = resNode.next;
//                }
//                return returnNode;
//        }

        //两个链表都存在的情况
        //先判断是否有进位
//        if ((resNode.val = l1.val + l2.val + carry) / 10 == 1) {
//            resNode.val %= 10;
//            carry = 1;
//        } else {
//            carry = 0;
//        }
//        if (l1.next != null)
//            l1 = l1.next;
//        if (l2.next != null)
//            l2 = l2.next;
//        resNode.next = new ListNode();
//        resNode = resNode.next;
//    }
//
//    resNode.val =l1.val +l2.val +carry;
//
//        if(resNode.val /10==1)
//
//    {
//        resNode.val %= 10;
//        resNode.next = new ListNode();
//        resNode = resNode.next;
//        resNode.val = 1;
//    }
//
//        return returnNode;
    }
}


//作者：LeetCode-Solution
//链接：https://leetcode.cn/problems/add-two-numbers/solution/liang-shu-xiang-jia-by-leetcode-solution/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。