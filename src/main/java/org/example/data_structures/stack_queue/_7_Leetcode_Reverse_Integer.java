package org.example.data_structures.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class _7_Leetcode_Reverse_Integer {
    public static int reverse(int x) {
        boolean isNegative = x < 0;
        int i = 0;
        Queue<Integer> temp = new LinkedList<>();
        if(isNegative)
            x = -x;
        while(x != 0)
        {
            temp.add(x % 10);
            x = x / 10;
            i++;
        }
        while(!temp.isEmpty())
        {
            x += temp.poll()* ((int) Math.pow(10, --i));
        }
       return isNegative ? -x : x;
    }

    public static void main(String[] args) {
        int x = -0;
        System.out.println(reverse(x));
    }
}
