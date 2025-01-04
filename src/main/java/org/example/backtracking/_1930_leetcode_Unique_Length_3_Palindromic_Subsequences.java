package org.example.backtracking;

import java.util.HashMap;
import java.util.HashSet;

/**
 * _1930_leetcode_Unique_Length_3_Palindromic_Subsequences
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/4/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/4/2025    NhanDinhVan    Create
 */

public class _1930_leetcode_Unique_Length_3_Palindromic_Subsequences {
//    Backtracking - Time Limit Exceeded
//    HashSet<String> memo = new HashSet<>();
//    public int countPalindromicSubsequence(String s) {
//        backtracking(new StringBuilder(), 0, s);
//        return memo.size();
//    }
//    public void backtracking(StringBuilder sb,  int start, String s){
//        if(sb.length() == 3){
//            if(checkPalindromic(sb.toString()))
//                memo.add(sb.toString());
//            return;
//        }
//        if(start+1 > s.length()) return;
//        sb.append(s.charAt(start));
//        backtracking(sb, start+1, s);
//        sb.deleteCharAt(sb.length()-1);
//        backtracking(sb, start+1, s);
//    }
//    public boolean checkPalindromic(String s){
//        return s.charAt(0) == s.charAt(2);
//    }

    public int countPalindromicSubsequence(String s) {
        int[] first = new int[26];
        int[] last = new int[26];
        int ans = 0;

        for(int i = 0; i < s.length(); i++){
            first[s.charAt(i) - 'a'] = -1;
            last[s.charAt(i) - 'a'] = -1;
        }
        for(int i = 0; i < s.length(); i++){
            int idx = s.charAt(i) - 'a';
            if(first[idx] == -1)
                first[idx] = i;
            last[idx] = i;
        }
        for(int i = 0; i < 26; i++){
            if(first[i] !=-1 && first[i] < last[i]){
                boolean[] check = new boolean[26];
                for(int j = first[i]+1; j < last[i]; j++){
                    check[s.charAt(j)-'a'] = true;
                }
                for(int k = 0; k < 26; k++)
                    if(check[k]) ans++;
            }
        }
        return ans;
    }
}
