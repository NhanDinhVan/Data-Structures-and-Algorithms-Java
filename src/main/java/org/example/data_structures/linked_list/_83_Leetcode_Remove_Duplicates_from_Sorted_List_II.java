package org.example.data_structures.linked_list;

public class _83_Leetcode_Remove_Duplicates_from_Sorted_List_II {
    public static ListNode solution(ListNode head)
    {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode cur = head;
        ListNode tmp = null;
        Boolean isDup;

        if(head == null)
            return null;
        while(cur.next != null)
        {
            isDup = false;
            while(cur.next != null && cur.val == cur.next.val)
            {
                isDup = true;
                cur = cur.next;
            }
            if(isDup)
            {
                prev.next = cur.next;
            }else
            {
                prev = prev.next;
            }

            cur = cur.next;

        }
        return dummy.next;
    }
    public static void traverse(ListNode tmp)
    {   int count = 1;
        while(tmp != null)
        {
            System.out.print("Node "+count+": " + tmp.val);
            tmp = tmp.next;
            System.out.print("  ->  ");
            if(tmp == null)
                System.out.println("");
            count++;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        traverse(solution(head));
    }
}
