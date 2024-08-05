package org.example.data_structures.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex1_Reverse_Queue {
    public static Queue<Integer> reversedQueue(Queue<Integer> queue)
    {
        Stack<Integer> temp = new Stack<>();
        while(!queue.isEmpty())
            temp.push(queue.poll());
        while(!temp.isEmpty())
            queue.add(temp.pop());
        return queue;
    }
    public static void printQueue(Queue<Integer> queue)
    {
        while(!queue.isEmpty())
            System.out.print(queue.poll());
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
       printQueue(reversedQueue(queue));
    }
}
