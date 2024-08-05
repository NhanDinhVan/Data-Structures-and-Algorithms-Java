package org.example.data_structures.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class _Exercise_3_Find_Maximum_Value_in_Queue {
    public static int solution(Queue<Integer> queue)
    {
        int max = 0;
        while(queue.peek()!= null)
        {
           int temp = queue.poll();
            max = (temp > max) ? temp : max;
        }
        return max;
    }

    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        queue1.add(0);
        queue1.add(5);
        queue1.add(7);
        System.out.print(solution(queue1));
    }
}
