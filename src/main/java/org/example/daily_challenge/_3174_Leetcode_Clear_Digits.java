package org.example.daily_challenge;

import java.util.Stack;

/**
 * _3174_Leetcode_Clear_Digits
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/10/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/10/2025    NhanDinhVan    Create
 */

public class _3174_Leetcode_Clear_Digits {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack();
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c >= '0' && c <= '9' && !stack.isEmpty()){
                stack.pop();
            }else{
                stack.push(c);
            }
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }


        return sb.reverse().toString();
    }
}
