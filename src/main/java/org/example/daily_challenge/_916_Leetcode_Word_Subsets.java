package org.example.daily_challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * _916_Leetcode_Word_Subsets
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/10/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/10/2025    NhanDinhVan    Create
 */

public class _916_Leetcode_Word_Subsets {
    public List<String> wordSubsets(String[] words1, String[] words2) {

        List<String> ans = new ArrayList<>();
        int[] W2MaxfreQ = new int[26];

        for(String i : words2){
            int[] W2freQ = new int[26];
            for(int j = 0; j < i.length(); j++){
                W2freQ[i.charAt(j) - 'a']++;
                W2MaxfreQ[i.charAt(j) - 'a'] = Math.max(W2MaxfreQ[i.charAt(j) - 'a'], W2freQ[i.charAt(j) - 'a']);
            }
        }

        for(String i : words1){
            int[] W1freQ = new int[26];
            for(int j = 0; j < i.length(); j++){
                W1freQ[i.charAt(j) - 'a']++;
            }

            if(checkSubset(W1freQ, W2MaxfreQ)) ans.add(i);
        }
        return ans;
    }

    public boolean checkSubset(int[] w1, int[] w2){
        for(int i = 0; i < 26; i++){
            if(w2[i] > w1[i]) return false;
        }
        return true;
    }
}
