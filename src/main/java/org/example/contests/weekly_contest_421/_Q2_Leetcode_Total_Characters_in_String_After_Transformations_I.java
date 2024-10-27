package org.example.contests.weekly_contest_421;

import java.util.Stack;

/**
 * _Q2_Leetcode_Total_Characters_in_String_After_Transformations_I
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/27/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/27/2024    NhanDinhVan    Create
 */

public class _Q2_Leetcode_Total_Characters_in_String_After_Transformations_I {
    public int lengthAfterTransformations(String s, int t) {
        int MOD = 1000000007;
        long[] count = new long[26];

        for(char c  : s.toCharArray()){
            count[c - 'a']++;
        }
        for(int i = 0; i < t; i++){
            long[] newCount = new long[26];
            for(int j = 0; j < 26; j++){
                if(j == 25){
                    newCount[0] = (newCount[0] + count[j]) % MOD;
                    newCount[1] = (newCount[1] + count[j]) % MOD;
                }else{
                    newCount[j + 1] = (newCount[j + 1] + count[j])%MOD;
                }
            }
            count = newCount;
        }
        long lenght = 0;
        for (long c : count){
            lenght = (lenght + c)%MOD;
        }
        return (int)lenght;
    }
}
