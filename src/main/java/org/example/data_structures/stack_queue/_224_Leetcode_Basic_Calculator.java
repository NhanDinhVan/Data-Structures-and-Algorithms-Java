package org.example.data_structures.stack_queue;

import java.util.Stack;

/**
 * _224_Leetcode_Basic_Calculator
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/17/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/17/2025    NhanDinhVan    Create
 */

public class _224_Leetcode_Basic_Calculator {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int curResult = 0;
        int curNum = 0;
        int sign = 1;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                curNum = curNum * 10 + (c - '0');
            } else if (c == '+') {
                curResult += sign * curNum;
                sign = 1;
                curNum = 0;
            }else if(c == '-'){
                curResult += sign * curNum;
                curNum = 0;
                sign = -1;
            }else if(c == '('){
                stack.push(curResult);
                stack.push(sign);
                curResult = 0;
                sign = 1;
            }else if(c == ')'){
                curResult += sign * curNum;
                curNum = 0;

                curResult *= stack.pop();
                curResult += stack.pop();
            }
        }

        return curResult + sign * curNum;
    }
}
