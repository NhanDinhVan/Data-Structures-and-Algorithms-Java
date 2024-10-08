package org.example.data_structures.stack_queue;

import java.util.Stack;

/**
 * _921_LeetcodeMinimum_Add_to_Make_Parentheses_Valid
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/9/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/9/2024    NhanDinhVan    Create
 */

public class _921_Leetcode_Minimum_Add_to_Make_Parentheses_Valid {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(!stack.isEmpty() && stack.peek() == '(' && s.charAt(i) == ')'){
                stack.pop();
                continue;
            }
            stack.push(s.charAt(i));
        }
        return stack.size();
    }
}
