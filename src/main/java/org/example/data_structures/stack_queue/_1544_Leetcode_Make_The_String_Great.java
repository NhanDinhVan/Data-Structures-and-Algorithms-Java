package org.example.data_structures.stack_queue;

import java.util.Stack;

/**
 * _1544_Leetcode_Make_The_String_Great
 * <p>
 * Version 1.0
 * <p>
 * Date:  5/2/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 5/2/2025    NhanDinhVan    Create
 */

public class _1544_Leetcode_Make_The_String_Great {
    public String makeGood(String s) {
        Stack<Character> set = new Stack<>();


        for(int i = 0; i < s.length(); i++){
            if(set.isEmpty()){
                set.add(s.charAt(i));
                continue;
            }
            char c = set.peek();
            if(Math.abs(c - s.charAt(i)) == 32){
                set.pop();
                continue;
            }
            set.add(s.charAt(i));
        }

        StringBuilder ans = new StringBuilder();
        while(!set.isEmpty()){
            ans.append(set.pop());
        }
        return ans.reverse().toString();
    }
}
