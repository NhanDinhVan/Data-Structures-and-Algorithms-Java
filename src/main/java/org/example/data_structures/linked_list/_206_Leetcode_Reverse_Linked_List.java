package org.example.data_structures.linked_list;

import java.util.Stack;

/**
 * _206_Leetcode_Reverse_Linked_List
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/1/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/1/24   NhanDinhVan    Create
 */
public class _206_Leetcode_Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        Stack<Integer> s = new Stack<>();
        while(cur != null){
            s.push(cur.val);
            cur = cur.next;
        }
        cur = head;
        while(cur != null){
            cur.val = s.pop();
            cur = cur.next;
        }
        return head;
    }
}
