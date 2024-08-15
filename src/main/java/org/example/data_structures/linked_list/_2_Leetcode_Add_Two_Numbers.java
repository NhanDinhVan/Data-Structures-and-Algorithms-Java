package org.example.data_structures.linked_list;

import java.util.ArrayList;

/**
 * _2_Leetcode_Add_Two_Numbers
 * <p>
 * Version 1.0
 * <p>
 * Date:  8/13/24
 * <p>
 * Copyright`
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 8/13/24   NhanDinhVan    Create
 */
public class _2_Leetcode_Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum/10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
        }
        return dummy.next;
    }
}
