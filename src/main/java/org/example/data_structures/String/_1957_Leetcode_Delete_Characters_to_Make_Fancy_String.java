package org.example.data_structures.String;

import java.util.Stack;

/**
 * _1957_Leetcode_Delete_Characters_to_Make_Fancy_String
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/1/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/1/2024    NhanDinhVan    Create
 */

public class _1957_Leetcode_Delete_Characters_to_Make_Fancy_String {
    public String makeFancyString(String s) {
        if(s.length() < 3)
            return s;
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        boolean check = false;
        stack.add('B');
        for(int i = 0; i < s.length(); i++){
            if(stack.peek() != s.charAt(i)){
                check = false;
                ans.append(s.charAt(i));
                stack.push(s.charAt(i));
            }else if(stack.peek() == s.charAt(i) && !check){
                check = true;
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
