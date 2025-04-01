package org.example.data_structures.String;

/**
 * _680_Leetcode_Valid_Palindrome_I
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/1/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/1/2025    NhanDinhVan    Create
 */

public class _680_Leetcode_Valid_Palindrome_II {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return isPalindrome(l+1, r, s) || isPalindrome(l, r-1, s);
            }
            l++; r--;
        }
        return true;
    }
    public static boolean isPalindrome(int l, int r, String s){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
