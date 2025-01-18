package org.example.data_structures.linked_list;

/**
 * _86_Leetcode_Partition_List
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/17/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/17/2025    NhanDinhVan    Create
 */

public class _86_Leetcode_Partition_List {
    public ListNode partition(ListNode head, int x) {
        ListNode lessHead = new ListNode(0);
        ListNode greaterHead = new ListNode(0);

        ListNode less = lessHead;
        ListNode greater = greaterHead;

        while(head != null){
            if(head.val < x) {
                less.next = head;
                less = less.next;
            }else {
                greater.next = head;
                greater = greater.next;
            }
            head = head.next;
        }

        greater.next = null;
        less.next = greaterHead.next;

        return lessHead.next;
    }
}
