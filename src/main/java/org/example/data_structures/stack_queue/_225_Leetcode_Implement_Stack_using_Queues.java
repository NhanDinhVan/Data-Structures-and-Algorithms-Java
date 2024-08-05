package org.example.data_structures.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class _225_Leetcode_Implement_Stack_using_Queues {
    Queue<Integer> q1,q2;
    int temp = 0;
    public _225_Leetcode_Implement_Stack_using_Queues()
    {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    public void push(int x) {
        if(empty())
            this.q1.add(x);
        else if(this.q1.isEmpty())
            this.q2.add(x);
        else if(this.q2.isEmpty())
            this.q1.add(x);
    }
    public int pop() {
        if(empty())
            return 0;
        if(this.q1.isEmpty())
        {
            while(!this.q1.isEmpty())
            {
                temp = this.q1.poll();
                if(this.q1.peek()==null)
                    return temp;
                q2.add(temp);
            }
        }else if(!this.q2.isEmpty())
        {
            while(!this.q2.isEmpty())
            {
                temp = this.q2.poll();
                if(this.q2.peek()==null)
                    return temp;
                q1.add(temp);
            }
        }
    return temp;
    }

    public int top() {
        if(empty())
            return 0;
        if(this.q1.isEmpty())
        {
            while(!this.q1.isEmpty())
            {
                temp = this.q1.poll();
                if(this.q1.peek()==null)
                {
                    this.q2.add(temp);
                    return temp;
                }
                q2.add(temp);
            }
        }else if(!this.q2.isEmpty())
        {
            while(!this.q2.isEmpty())
            {
                temp = this.q2.poll();
                if(this.q2.peek()==null)
                {
                    this.q1.add(temp);
                    return temp;
                }
                q1.add(temp);
            }
        }
        return temp;
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}
