package org.example.sliding_window;

import java.util.HashSet;

/**
 * _1456_Leetcode_Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/8/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/8/2025    NhanDinhVan    Create
 */

public class _1456_Leetcode_Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();

        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        for(int i = 0; i < k; i++){
            if(set.contains(s.charAt(i))) count++;
        }

        max = count;

        for(int i = 0, j = k; j < s.length(); i++, j++){
            if(set.contains(s.charAt(i))) count--;
            if(set.contains(s.charAt(j))) count++;
            max = Math.max(max, count);
        }

        return max;
    }
}
