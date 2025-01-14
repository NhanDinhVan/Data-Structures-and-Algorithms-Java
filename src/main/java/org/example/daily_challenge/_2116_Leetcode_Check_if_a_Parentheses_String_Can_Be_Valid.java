package org.example.daily_challenge;

/**
 * _2116_Leetcode_Check_if_a_Parentheses_String_Can_Be_Valid
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/14/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/14/2025    NhanDinhVan    Create
 */

public class _2116_Leetcode_Check_if_a_Parentheses_String_Can_Be_Valid {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if(n%2!=0) return false;

        int open = 0, free = 0;
        for(int i = 0; i < n; i++){
            if(locked.charAt(i) == '1'){
                open+= (s.charAt(i) == '(' ? 1 : -1);
            }else{
                free++;
            }

            if(open + free < 0) return false;
        }

        open = 0; free = 0;
        for(int i = n - 1; i >= 0; i--){
            if(locked.charAt(i) == '1'){
                open+=(s.charAt(i) == ')' ? 1 : -1);
            }else{
                free++;
            }
            if(open+free < 0) return false;
        }

        return true;
    }
}
