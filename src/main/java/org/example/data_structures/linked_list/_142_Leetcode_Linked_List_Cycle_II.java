package org.example.data_structures.linked_list;

import java.util.HashMap;
import java.util.List;

/**
 * _142_Leetcode_Linked_List_Cycle_II
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
public class _142_Leetcode_Linked_List_Cycle_II {
    public int checkNode(ListNode cur){
        if(cur == null)
            return -1;
        ListNode slow = cur;
        ListNode fast = cur;
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                if(fast == cur)
                    return 1;
                return 0;
            }
        }
        return -1;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode cur = head;
        while(cur != null){
            int check = checkNode(cur);
            if(check == -1)
                return null;
            else if(check == 1)
                return cur;
            else
                cur = cur.next;
        }
        return null;
    }
}
