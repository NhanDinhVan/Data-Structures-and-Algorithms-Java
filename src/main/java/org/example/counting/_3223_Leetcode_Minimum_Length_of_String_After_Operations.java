package org.example.counting;

/**
 * _3223_Leetcode_Minimum_Length_of_String_After_Operations
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

public class _3223_Leetcode_Minimum_Length_of_String_After_Operations {
    public int minimumLength(String s) {
        int ans = 0;
        int[] freq = new int[26];

        for(int c : s.toCharArray()){
            freq[c - 'a']++;
        }

        for(int i : freq){
            if(i != 0){
                if(i % 2 == 1){
                    ans += 1;
                    continue;
                }
                ans += 2;
            }
        }
        return ans;
    }
}
