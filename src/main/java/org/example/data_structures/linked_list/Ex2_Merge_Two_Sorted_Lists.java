package org.example.data_structures.linked_list;

public class Ex2_Merge_Two_Sorted_Lists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;

        if(list1.val <= list2.val)
        {
            ListNode nextList1 = list1.next;
            ListNode nextElement = mergeTwoLists(nextList1, list2);
            list1.next = nextElement;
            return list1;
        }else {
            ListNode nextList2 = list2.next;
            ListNode nextElement = mergeTwoLists(list1, nextList2);
            list2.next = nextElement;
            return list2;
        }
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
        ListNode list1 = new ListNode(1);
        ListNode l1nodeList1 = new ListNode(1);
        ListNode l1nodeList2 = new ListNode(3);
        ListNode l1nodeList3 = new ListNode(4);
        ListNode l1nodeList4 = new ListNode(5);
        list1.next = l1nodeList1;
        l1nodeList1.next = l1nodeList2;
        l1nodeList2.next = l1nodeList3;
        l1nodeList3.next = l1nodeList4;

        ListNode list2 = new ListNode(1);
        ListNode l2nodeList1 = new ListNode(1);
        ListNode l2nodeList2 = new ListNode(3);
        ListNode l2nodeList3 = new ListNode(4);
        ListNode l2nodeList4 = new ListNode(5);
        list2.next = l2nodeList1;
        l2nodeList1.next = l2nodeList2;
        l2nodeList2.next = l2nodeList3;
        l2nodeList3.next = l2nodeList4;

        traverse(mergeTwoLists(list1, list2));
    }
}
