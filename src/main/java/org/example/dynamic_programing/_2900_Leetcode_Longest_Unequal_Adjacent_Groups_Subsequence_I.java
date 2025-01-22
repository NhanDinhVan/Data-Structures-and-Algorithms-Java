package org.example.dynamic_programing;

import java.util.ArrayList;
import java.util.List;

/**
 * _2900_Leetcode_Longest_Unequal_Adjacent_Groups_Subsequence_I
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/20/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/20/2025    NhanDinhVan    Create
 */

public class _2900_Leetcode_Longest_Unequal_Adjacent_Groups_Subsequence_I {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
//        int n = words.length;
//        int[] dp = new int[n];
//        int[] prev = new int[n];
//        int maxLength = 0;
//        int endIndex = 0;
//
//        for(int i = 0; i < n; i++){
//            dp[i] = 1;
//            prev[i] = -1;
//        }
//
//        for(int i = 1; i < n; i++){
//            for(int j = 0; j < i; j++){
//                if(groups[j] != groups[i] && dp[i] < dp[j]+1){
//                    dp[i] += dp[j]+1;
//                    prev[i] = j;
//                }
//            }
//
//            if(dp[i] > maxLength){
//                maxLength = dp[i];
//                endIndex = i;
//            }
//        }
//
//        List<String> ans = new ArrayList<>();
//        while(endIndex != -1){
//            ans.add(0, words[endIndex]);
//            endIndex = prev[endIndex];
//        }
//        return ans;
        List<String> list=new ArrayList<>();
        int c=-1;
        for(int i=0;i<words.length;i++){
            if(groups[i]!=c){
                c=groups[i];
                list.add(words[i]);
            }
        }
        return list;
    }
}
