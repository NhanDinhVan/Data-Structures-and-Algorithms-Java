package org.example.data_structures.stack_queue;

import java.util.Stack;

public class _20_LeetCode_Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++ )
        {
            char c = s.charAt(i);
            if(c == '{' || c == '(' || c =='[')
                characterStack.push(c);
            else if(c == '}' || c ==')'|| c == ']')
            {
                if(characterStack.isEmpty())
                    return false;
                else
                {
                    char top = characterStack.peek();
                    if((top == '{' && c == '}') || (top == '(' && c == ')') || (top == '[' && c == ']') )
                        characterStack.pop();
                    else
                        characterStack.push(c);
                }
            }
        }
        return characterStack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "";
        System.out.print(isValid(s));
    }
}
