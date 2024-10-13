package org.example.data_structures.HashMap_HashSet;

import org.example.data_structures.linked_list.ListNode;

import java.util.HashMap;
import java.util.List;

/**
 * _141_Leetcode_Linked_List_Cycle
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/13/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/13/2024    NhanDinhVan    Create
 */

public class _141_Leetcode_Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
//        HashMap<ListNode, Integer> hmap = new HashMap<>();
//        ListNode tmp = head;
//        int pos = 0;
//        while (tmp != null) {
//            if(hmap.containsKey(tmp.next)){
//                return true;
//            }
//            hmap.put(tmp, pos++);
//            tmp = tmp.next;
//        }
//        return false;
        ListNode turtle = head;
        ListNode rabbit = head;
        while(rabbit != null && rabbit.next != null){
            turtle = turtle.next;
            rabbit = rabbit.next.next;
            if(rabbit == turtle){
                return true;
            }
        }
        return false;
    }
}
