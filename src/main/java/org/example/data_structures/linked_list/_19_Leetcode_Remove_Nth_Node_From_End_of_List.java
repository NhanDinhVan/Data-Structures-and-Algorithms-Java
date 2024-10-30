package org.example.data_structures.linked_list;

import java.util.List;

/**
 * _19_Leetcode_Remove_Nth_Node_From_End_of_List
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/30/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/30/2024    NhanDinhVan    Create
 */

public class _19_Leetcode_Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int count = 0;

        ListNode prev = dummy;
        ListNode fast = head;

        if(dummy.next.next == null)
            return null;

        while(n > 0){
            fast = fast.next;
            n--;
            count++;
        }

        while(fast.next != null){
            fast = fast.next;
            prev = prev.next;
        }

        prev.next = prev.next.next;
        return dummy.next;
    }
}
