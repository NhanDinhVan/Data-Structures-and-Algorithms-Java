package org.example.data_structures.linked_list;

import java.util.ArrayList;
import java.util.Stack;

/**
 * _143_Leetcode_Reorder_List
 * <p>
 * Version 1.0
 * <p>
 * Date:  8/19/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 8/19/24   NhanDinhVan    Create
 */
public class _143_Leetcode_Reorder_List {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) return;

        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode dummy = new ListNode(0,head);
        ListNode h = head;

        while(h != null){
            arr.add(h.val);
            s.push(h.val);
            h = h.next;
        }

        h = head;
        int n = arr.size();

        for(int i = 0; i < n / 2; i++){
            h.val = arr.get(i);
            h.next.val = s.pop();
            h = h.next.next;
        }
        if (n % 2 != 0) {
            h.val = arr.get(n / 2);
        }
    }
}
