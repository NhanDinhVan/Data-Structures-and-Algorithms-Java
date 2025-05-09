package org.example.data_structures.String;

import java.util.Stack;

/**
 * _682_Leetcode_Baseball_Game
 * <p>
 * Version 1.0
 * <p>
 * Date:  5/10/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 5/10/2025    NhanDinhVan    Create
 */

public class _682_Leetcode_Baseball_Game {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for(String s : operations){
            if(s.equals("+")){
                // Sum of last two points
                int last = stack.peek();
                stack.push(last + stack.get(stack.size() - 2));
                ans += stack.peek();
            }else if (s.equals("D")){
                stack.add(stack.peek()*2);
                ans += stack.peek();
            }else if (s.equals("C")){
                ans -= stack.pop();
            }else{
                // The operation is a number
                int num = Integer.parseInt(s);
                stack.push(num);
                ans += num;
            }
        }
        return ans;
    }
}
