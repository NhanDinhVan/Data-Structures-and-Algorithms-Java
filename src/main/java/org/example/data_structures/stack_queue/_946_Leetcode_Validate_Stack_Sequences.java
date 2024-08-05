package org.example.data_structures.stack_queue;

import java.util.Stack;

public class _946_Leetcode_Validate_Stack_Sequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> temp = new Stack<>();
        int j = 0;
        for(int i : pushed){
            temp.push(i);
            while(!temp.isEmpty() && temp.peek() == popped[j])
            {
                temp.pop();
                j++;
            }
        }
        return temp.isEmpty();
    }
}
