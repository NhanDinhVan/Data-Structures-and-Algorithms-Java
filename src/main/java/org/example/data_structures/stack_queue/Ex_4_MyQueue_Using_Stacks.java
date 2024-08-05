package org.example.data_structures.stack_queue;

import java.util.Stack;

public class Ex_4_MyQueue_Using_Stacks {
    private Stack<Integer> stack1,stack2;
     public Ex_4_MyQueue_Using_Stacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        this.stack1.push(x);
    }

    public int pop() {
        if(!empty())
        {
            if(this.stack2.isEmpty())
            {
                while(!this.stack1.isEmpty())
                {
                    this.stack2.push(this.stack1.pop());
                }
            }
            return this.stack2.pop();
        }else{
            return -1;
        }
    }

    public int peek() {
        if(!empty())
        {
            if(this.stack2.isEmpty())
                while(!this.stack1.isEmpty())
                    this.stack2.push(stack1.pop());
            return this.stack2.peek();
        }else{
            return -1;
        }
    }

    public boolean empty() {
        return (stack1.isEmpty() && stack2.isEmpty());
    }

    public static void main(String[] args) {
        Ex_4_MyQueue_Using_Stacks queue = new Ex_4_MyQueue_Using_Stacks();
        queue.push(1);
        queue.push(3);
        queue.push(2);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}
