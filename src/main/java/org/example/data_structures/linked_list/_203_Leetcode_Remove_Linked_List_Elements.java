package org.example.data_structures.linked_list;

public class _203_Leetcode_Remove_Linked_List_Elements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0,head);
        ListNode cur = head;
        ListNode prev = dummy;
        while(cur != null)
        {
                if(cur.val == val)
                {
                    prev.next = cur.next;
                }else
                {
                    prev = cur;
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
        traverse(removeElements(head, 1));
    }
}
