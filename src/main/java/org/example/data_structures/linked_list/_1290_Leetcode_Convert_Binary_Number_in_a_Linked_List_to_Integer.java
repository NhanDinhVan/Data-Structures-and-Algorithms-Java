package org.example.data_structures.linked_list;

/**
 * _1290_Leetcode_Convert_Binary_Number_in_a_Linked_List_to_Integer
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/31/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/31/2024    NhanDinhVan    Create
 */

public class _1290_Leetcode_Convert_Binary_Number_in_a_Linked_List_to_Integer {
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        int count = 0;
        ListNode curNode = head;
        while(curNode != null){
            count++;
            curNode = curNode.next;
        }
        curNode = head;
        while(curNode != null){
            if (curNode.val == 1){
                ans += (int) Math.pow(2, count - 1);
            }
            count--;

            curNode = curNode.next;
        }
        return ans;
    }
}
