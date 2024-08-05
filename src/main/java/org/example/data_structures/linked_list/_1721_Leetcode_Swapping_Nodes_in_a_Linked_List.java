package org.example.data_structures.linked_list;

import java.util.ArrayList;

/**
 * _1721_Leetcode_Swapping_Nodes_in_a_Linked_List
 * <p>
 * Version 1.0
 * <p>
 * Date:  7/29/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 7/29/2024    NhanDinhVan    Create
 */

public class _1721_Leetcode_Swapping_Nodes_in_a_Linked_List {
    public ListNode swapNodes(ListNode head, int k) {
//        ArrayList<Integer> list = new ArrayList<>();
//        ListNode cur = head;
//        while(cur!=null)
//        {
//            list.add(cur.val);
//            cur = cur.next;
//        }
//        int temp = list.get(k-1);
//        list.set(k-1,list.get(list.size()-k));
//        list.set(list.size()-k, temp);
//
//        ListNode dummy = new ListNode(0);
//        ListNode newHead = dummy;
//        for (int val : list) {
//            newHead.next = new ListNode(val);
//            newHead = newHead.next;
//        }
//
//        return dummy.next;

        ListNode first=head;
        for(int i=1; i<k ;i++){
            first=first.next;
        }
        ListNode temp=first;
        ListNode second=head;
        while(temp.next!=null){
            second=second.next;
            temp=temp.next;
        }
        int tem=first.val;
        first.val=second.val;
        second.val=tem;
        return head;

    }
}
