package org.example.data_structures.String;

/**
 * _2108_Leetcode_Find_First_Palindromic_String_in_the_Array
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

public class _2108_Leetcode_Find_First_Palindromic_String_in_the_Array {
    public String firstPalindrome(String[] words) {
        for(String s : words){
            if(isPalindrome(s)) return s;
        }
        return "";
    }
    public static boolean isPalindrome(String s){
        int l = 0;
        int r = s.length()-1;

        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++; r--;
        }

        return true;
    }
}
