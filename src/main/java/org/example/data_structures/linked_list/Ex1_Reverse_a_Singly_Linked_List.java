package org.example.data_structures.linked_list;

public class Ex1_Reverse_a_Singly_Linked_List {
    public static Node<Integer> solution(Node<Integer> head)
    {
        Node<Integer> next;
        Node<Integer> cur = null;
        if(head==null)
            return null;
        while(head != null)
        {   next = head.getNext();
            head.setNext(cur);
            cur = head;
            head = next;
        }
        return cur;
    }

    public static void main(String[] args) {

    }
}
