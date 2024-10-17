package org.example.data_structures.stack_queue;

import java.util.Stack;

/**
 * _155_Leetcode_Min_Stack
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/17/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/17/2024    NhanDinhVan    Create
 */

public class _155_Leetcode_Min_Stack {
    class MinStack {
        class Node{
            int value;
            int MIN;
            public Node(int newValue){value = newValue;}
        }
        Stack<Node> stack = new Stack<>();
        public MinStack() {

        }

        public void push(int val) {
            Node node = new Node(val);
            if(stack.isEmpty())
                node.MIN = val;
            else
                node.MIN = Math.min(stack.peek().MIN, val);
            stack.add(node);
        }

        public void pop() {
            if(!stack.isEmpty())
                stack.pop();
        }

        public int top() {
            return stack.peek().value;
        }

        public int getMin() {
            if(!stack.isEmpty())
                return stack.peek().MIN;
            return 0;
        }
    }
}
