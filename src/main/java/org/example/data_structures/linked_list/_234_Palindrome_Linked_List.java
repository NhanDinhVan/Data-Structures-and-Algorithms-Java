package org.example.data_structures.linked_list;

public class _234_Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        ListNode cur = head;
        int count = 0;
        while(cur != null)
        {
            count++; cur = cur.next;
        }
        return true;
    }
    public ListNode reverselist(ListNode head)
    {
        ListNode prev = null;
        ListNode cur = head;
        ListNode tmp;
        while(cur != null)
        {
            tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
        return prev;
    }
}
