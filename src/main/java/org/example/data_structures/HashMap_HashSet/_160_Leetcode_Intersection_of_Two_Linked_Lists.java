package org.example.data_structures.HashMap_HashSet;

import org.example.data_structures.linked_list.ListNode;

import java.util.HashMap;
import java.util.List;

/**
 * _160_Leetcode_Intersection_of_Two_Linked_Lists
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

public class _160_Leetcode_Intersection_of_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode, Integer> hmap = new HashMap<>();
        ListNode temp = headA;
        while(temp != null){
            hmap.put(temp, temp.val);
            temp = temp.next;
        }
        temp = headB;
        while(temp != null){
            if(hmap.containsKey(temp)){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}
