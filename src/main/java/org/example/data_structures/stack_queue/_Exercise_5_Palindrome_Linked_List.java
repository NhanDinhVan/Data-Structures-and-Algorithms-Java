package org.example.data_structures.stack_queue;

import org.example.data_structures.linked_list.ListNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class _Exercise_5_Palindrome_Linked_List {
    public static boolean solution(ListNode head)
    {
        Stack<Integer> tempStack = new Stack<>();
        Queue<Integer> tempQueue = new LinkedList<>();

        ListNode cur = head;
        while(cur != null )
        {
            tempStack.push(cur.val);
            tempQueue.add(cur.val);
            cur = cur.next;
        }
        while(!tempQueue.isEmpty())
        {
            if(tempQueue.peek() == tempStack.peek())
            {
                tempStack.pop();
                tempQueue.poll();
            }else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, null);
        ListNode node1 = new ListNode(1, null);
        ListNode node2 = new ListNode(1, null);
        head.next = node1;
        node1.next = node2;
        System.out.println(
                solution(head)
        );
    }
}
