package org.example.greedy;

import java.util.HashMap;
import java.util.Map;

/**
 * _409_Leetcode_Longest_Palindrome
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/19/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/19/2024    NhanDinhVan    Create
 */

public class _409_Leetcode_Longest_Palindrome {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        boolean hasOdd = false;
        int sumEven = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            hmap.put(c, hmap.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character, Integer> m : hmap.entrySet()){
            if(m.getValue() % 2 != 0){
                sumEven += (m.getValue() - 1);
                hasOdd = true;
            }else{
                sumEven += m.getValue();
            }
        }
        if(hasOdd) sumEven++;
        return sumEven;
    }
}
