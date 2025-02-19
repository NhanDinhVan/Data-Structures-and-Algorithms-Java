package org.example.daily_challenge;

/**
 * _1415_Leetcode_The_k_th_Lexicographical_String_of_All_Happy_Strings_of_Length_n
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/19/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/19/2025    NhanDinhVan    Create
 */

public class _1415_Leetcode_The_k_th_Lexicographical_String_of_All_Happy_Strings_of_Length_n {
    int count = 0;
    String result = "";

    public String getHappyString(int n, int k) {
        backtracking('\0', n, k, new StringBuilder());
        return result;
    }

    public void backtracking(char prev, int n, int k, StringBuilder sb){
        if(sb.length() == n){
            count++;
            if(count == k){
                result = sb.toString();
            }
            return;
        }

        for(char c : new char[] {'a', 'b', 'c'}){
            if(c != prev){
                sb.append(c);
                backtracking(c, n, k, sb);
                sb.deleteCharAt(sb.length()-1);
                if (!result.isEmpty()) return;
            }
        }
    }

}
