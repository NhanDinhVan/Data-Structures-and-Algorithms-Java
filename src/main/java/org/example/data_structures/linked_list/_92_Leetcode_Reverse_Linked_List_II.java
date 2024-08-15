package org.example.data_structures.linked_list;

import com.sun.source.tree.WhileLoopTree;

/**
 * _92_Leetcode_Reverse_Linked_List_II
 * <p>
 * Version 1.0
 * <p>
 * Date:  8/15/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 8/15/24   NhanDinhVan    Create
 */
public class _92_Leetcode_Reverse_Linked_List_II {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode leftNode = new ListNode(0);
        ListNode rightNode = new ListNode(0);
        ListNode dummy = new ListNode(0, head);
        ListNode preLeft = dummy.next;
        ListNode nextRight =  dummy.next;

        for(int i = 1; i < left; i++){
            preLeft = preLeft.next;
        }
        leftNode = preLeft.next;
        for(int i = 1; i < left; i++){
            nextRight = nextRight.next;
        }
        rightNode = nextRight.next;

        ListNode pre = null;
        ListNode cur2 = leftNode;
        while (cur2 != rightNode){
            cur2.next = pre;
            pre = cur2;
            cur2 = cur2.next;
        }
        preLeft.next = rightNode;
        leftNode.next = nextRight;
        return dummy.next;
    }
}
