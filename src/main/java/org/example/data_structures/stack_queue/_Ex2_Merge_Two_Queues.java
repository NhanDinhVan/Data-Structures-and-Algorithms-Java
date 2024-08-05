package org.example.data_structures.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class _Ex2_Merge_Two_Queues {
    public static Queue<Integer> mergeTwoQueues(Queue<Integer> q1, Queue<Integer> q2)
    {
        Queue<Integer> mergedQueue = new LinkedList<>();
        while(!q1.isEmpty() && !q2.isEmpty())
        {
            if(q1.peek() < q2.peek())
                mergedQueue.add(q1.poll());
            else
                mergedQueue.add(q2.poll());
        }
        if(q1.isEmpty())
            mergedQueue.add(q2.poll());

        if(q2.isEmpty())
            mergedQueue.add(q1.poll());
        return mergedQueue;
    }
    public static void printQueue(Queue<Integer> queue)
    {
        while(queue.peek()!=null)
            System.out.print(queue.poll());
    }

    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        queue1.add(3);
        queue1.add(5);
        Queue<Integer> queue2 = new LinkedList<>();
        queue2.add(2);
        queue2.add(4);
        queue2.add(6);
        printQueue(mergeTwoQueues(queue1, queue2));
    }
}
