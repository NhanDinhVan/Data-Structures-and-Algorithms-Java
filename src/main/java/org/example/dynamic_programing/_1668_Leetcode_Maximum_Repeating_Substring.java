package org.example.dynamic_programing;

/**
 * _1668_Leetcode_Maximum_Repeating_Substring
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/19/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/19/2024    NhanDinhVan    Create
 */

public class _1668_Leetcode_Maximum_Repeating_Substring {
    public int maxRepeating(String sequence, String word) {
        int max = 0;
        int count = 0;
        for (int i = 0; i <= sequence.length() - word.length(); i++) {
            int l = i;
            while(l <= sequence.length() - word.length()){
                if(sequence.substring(l, l + word.length()).equals(word)){
                    count++;
                    l += word.length();
                }else{
                    max = Math.max(max, count);
                    count = 0;
                    break;
                }
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
