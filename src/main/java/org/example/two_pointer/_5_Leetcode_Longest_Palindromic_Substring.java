package org.example.two_pointer;

/**
 * _5_Leetcode_Longest_Palindromic_Substring
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

public class _5_Leetcode_Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        if(s.length() == 1)
            return s;
        StringBuilder result = new StringBuilder();
        for(int l = 0; l < s.length() - 1; l++){
            for(int r = l; r < s.length(); r++){
                if(checkPalindromic(s, l, r) && (r-l+1) > result.length()){
                    result.setLength(0);
                    for(int i = l; i <= r; i++){
                        result.append(s.charAt(i));
                    }
                }
            }
        }
        return result.toString();
    }
    public static boolean checkPalindromic(String s, int l, int r){
        if(l == r)
            return true;
        while(l < r){
            if(s.charAt(l) == s.charAt(r)){
                l++; r--;
            }else{
                return false;
            }
        }
        return true;
    }
}
