package org.example.data_structures.stack_queue;

import java.util.Queue;
import java.util.Stack;

public class _Exercise_6_Backspace_String_Compare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> tempStack1 = new Stack<>();
        Stack<Character> tempStack2 = new Stack<>();
        for(int i = 0 ; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == '#' && !tempStack1.isEmpty())
                tempStack1.pop();
            else
                tempStack1.push(c);
        }
        for(int i = 0 ; i < t.length(); i++)
        {
            char c = t.charAt(i);
            if(c == '#' && !tempStack2.isEmpty())
                tempStack2.pop();
            else
                tempStack2.push(c);
        }
        while(!tempStack1.isEmpty() && !tempStack2.isEmpty())
        {
                if(tempStack1.pop() != tempStack2.pop())
                    return false;
        }
        return (tempStack2.isEmpty() && tempStack1.isEmpty());
    }
}
