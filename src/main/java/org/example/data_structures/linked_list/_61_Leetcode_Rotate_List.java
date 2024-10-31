package org.example.data_structures.linked_list;

/**
 * _61_Leetcode_Rotate_List
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/31/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/31/2024    NhanDinhVan    Create
 */

public class _61_Leetcode_Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)
            return head;
        ListNode last = head;
        ListNode mid = head;
        int size = 1;
        while(last.next != null){
            last = last.next;
            size++;
        }

        // Find the position to break the list
        int locate = size - k % size;
        if (locate == size) {
            return head;  // No rotation needed as k is a multiple of the list size
        }

        for (int i = 1; i < locate; i++) {
            mid = mid.next;
        }

        ListNode tmp = mid.next;
        mid.next = null;
        last.next = head;

        return tmp;
    }
}
