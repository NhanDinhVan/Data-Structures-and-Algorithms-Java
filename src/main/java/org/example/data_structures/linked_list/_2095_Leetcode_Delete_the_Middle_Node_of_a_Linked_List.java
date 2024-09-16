package org.example.data_structures.linked_list;

import java.util.List;

/**
 * _2095_Leetcode_Delete_the_Middle_Node_of_a_Linked_List
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/16/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/16/24   NhanDinhVan    Create
 */
public class _2095_Leetcode_Delete_the_Middle_Node_of_a_Linked_List {
    public ListNode deleteMiddle(ListNode head) {
//        if(head == null || head.next == null)
//            return head;
//        ListNode tmp = head;
//        int count = 0;
//        while (tmp!=null){
//            tmp = tmp.next;
//            count++;
//        }
//        tmp = head;
//        for (int i = 0; i < count/2 - 1; i++){
//            tmp = tmp.next;
//        }
//        tmp.next = tmp.next.next;
//        return head;

        if(head == null || head.next == null)
            return null;
        ListNode s = head;
        ListNode f = head;
        ListNode p = null;

        while(f != null && f.next != null ){
            p = s;
            s = s.next;
            f = f.next.next;
        }
        if(p != null)
            p.next = p.next.next;
        return head;
    }
}
