package org.example.data_structures.stack_queue;

import org.example.data_structures.linked_list.ListNode;

public class LinkedListStack implements Stack_Queue_Interface{
    ListNode topNode;

    public LinkedListStack()
    {
        topNode = null;
    }
    @Override
    public boolean push(int value) {
        return false;
    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void print() {

    }
}
