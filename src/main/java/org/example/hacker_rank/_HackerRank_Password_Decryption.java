package org.example.hacker_rank;

import java.util.Stack;

/**
 * _HackerRank_Password_Decryption
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/14/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/14/2025    NhanDinhVan    Create
 */

public class _HackerRank_Password_Decryption {
    public static String decryptPassword(String s) {
        // Write your code here
        int idx = 0;
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        while(idx < s.length()){
            if(idx+2 < s.length()
                    && Character.isUpperCase(s.charAt(idx))
                    && Character.isLowerCase(s.charAt(idx+1))
                    && s.charAt(idx+2) == '*'){

                ans.append(s.charAt(idx+1));
                ans.append(s.charAt(idx));
                idx+=3;

            }else if(s.charAt(idx) == '0'){

                ans.append(stack.pop());
                idx++;

            }else if (Character.isDigit(s.charAt(idx))){

                stack.push(s.charAt(idx));
                idx++;

            }else{

                ans.append(s.charAt(idx));
                idx++;

            }
        }
        return ans.toString();
    }
}
