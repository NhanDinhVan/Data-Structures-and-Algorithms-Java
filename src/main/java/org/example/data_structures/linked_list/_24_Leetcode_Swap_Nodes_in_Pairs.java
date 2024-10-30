package org.example.data_structures.linked_list;

import java.util.List;

/**
 * _24_Leetcode_Swap_Nodes_in_Pairs
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

public class _24_Leetcode_Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode preNode = dummyNode;

        while (preNode.next != null && preNode.next.next != null){
            ListNode firstNode = preNode.next;
            ListNode secondNode = preNode.next.next;

            // Swap the nodes
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            preNode.next = secondNode;

            // Move preNode two steps ahead for the next swap
            preNode = firstNode;
        }

        return dummyNode.next;
    }
}
