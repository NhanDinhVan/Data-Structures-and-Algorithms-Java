package org.example.data_structures.stack_queue;

import org.example.data_structures.linked_list.ListNode;

import java.util.List;

public class _2_Leetcode_Add_Two_Numbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = convertListToNum(l1);
        int num2 = convertListToNum(l2);

        // Cộng hai số nguyên
        int sum = num1 + num2;

        // Chuyển kết quả trở lại danh sách liên kết
        return convertNumToList(sum);
    }
    public static int convertListToNum(ListNode head)
    {
        int num = 0;
        ListNode cur = head;
        while (cur != null) {
            num = num * 10 + cur.val;
            cur = cur.next;
        }
        return num;
    }

    public static ListNode convertNumToList(int num) {
        if (num == 0) return new ListNode(0);

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        // Nếu số nguyên là 0, danh sách liên kết chỉ chứa một nút với giá trị 0
        if (num == 0) {
            return new ListNode(0);
        }

        // Xử lý số nguyên từng chữ số
        while (num > 0) {
            int digit = num % 10;
            cur.next = new ListNode(digit);
            cur = cur.next;
            num /= 10;
        }
        ListNode prev = null;
        ListNode next = null;
        cur = dummy.next;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode n1l1 = new ListNode(1);
        ListNode n2l1 = new ListNode(1);
        l1.next = n1l1;
        n1l1.next = n2l1;
        ListNode l2 = new ListNode(1);
        ListNode n1l2 = new ListNode(1);
        ListNode n2l2 = new ListNode(2);
        l2.next = n1l2;
        n1l2.next = n2l2;

        addTwoNumbers(l1, l2);
    }

}
