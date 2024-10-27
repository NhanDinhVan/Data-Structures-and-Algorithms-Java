package org.example.contests.weekly_contest_420;

/**
 * _Q2_Count_Substrings_With_K_Frequency_Characters_I
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/20/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/20/2024    NhanDinhVan    Create
 */

public class _Q2_Count_Substrings_With_K_Frequency_Characters_I {
    public int numberOfSubstrings(String s, int k) {
        int count = 0;
        for(int l = 0; l < s.length(); l++){
            int[] fre = new int[26];
            for(int r = l; r <s.length(); r++){
                fre[s.charAt(r) - 'a']++;
                if(fre[s.charAt(r) - 'a'] == k){
                    count += (s.length() - r);
                    break;
                }
            }
        }
        return count;
    }
}
