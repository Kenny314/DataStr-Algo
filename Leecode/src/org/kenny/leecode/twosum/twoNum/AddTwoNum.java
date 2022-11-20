package org.kenny.leecode.twosum.twoNum;

import java.util.List;

/**
 * Created by Inte
 *
 * @author Kenny WANG
 * @create 2022/11/19 10:43
 */
public class AddTwoNum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        double l1Num = this.reduceNode2Num(l1);
        double l2Num = this.reduceNode2Num(l2);
        Long result = Long.valueOf((long) (l1Num + l2Num));
        ListNode l = new ListNode();
        l = this.reverseNum2Node(result);
        return l;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return dummyHead.next;
    }


    private double reduceNode2Num(ListNode l) {
        int i = 0;
        double result = 0;
        while (l != null) {
            if(l.val == 0){
                result = result * 1 * Math.pow(10, i);
            } else {
                result = result + l.val * Math.pow(10, i);
            }

            l = l.next;
            i++;
        }
        return result;
    }

    private ListNode reverseNum2Node(Long num) {
        String[] temp = num.toString().split("");
        ListNode head = new ListNode(Integer.parseInt(temp[temp.length-1]),null);
        ListNode point = head;
        for(int i = temp.length-2;i >= 0;i--){
            ListNode node = new ListNode(Integer.parseInt(temp[i]),null);
            point.next = node;
            point = node;
        }
        return head;
    }

    public static void main(String[] args) {
//        ListNode l11 = new ListNode(2);
//        ListNode l12 = new ListNode(4);
//        ListNode l13 = new ListNode(3);
//        l11.next = l12;
//        l12.next = l13;

        int[] t = new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        ListNode l11 = new ListNode(t[0],null);
        ListNode point = new ListNode();
        point = l11;
        for(int i = 1;i < t.length;i++){
            ListNode temp = new ListNode(t[i]);
            point.next = temp;
            point = temp;
        }

        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
        l21.next = l22;
        l22.next = l23;

        AddTwoNum a = new AddTwoNum();

        ListNode ll = a.addTwoNumbers(l11, l21);

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
