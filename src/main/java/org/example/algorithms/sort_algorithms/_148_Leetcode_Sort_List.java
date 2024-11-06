package org.example.algorithms.sort_algorithms;

import org.example.data_structures.linked_list.ListNode;

import java.util.List;

/**
 * _148_Leetcode_Sort_List
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/6/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/6/2024    NhanDinhVan    Create
 */

public class _148_Leetcode_Sort_List {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null, slow = head, fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        return merge(l1 , l2);
    }

    public ListNode merge(ListNode left, ListNode right){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(left != null && right != null){
            if(left.val < right.val){
                tail.next = left;
                left = left.next;
            }else{
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }
        if(left != null){
            tail.next = left;
        }
        if(right != null){
            tail.next = right;
        }
        return dummy.next;
    }
}
