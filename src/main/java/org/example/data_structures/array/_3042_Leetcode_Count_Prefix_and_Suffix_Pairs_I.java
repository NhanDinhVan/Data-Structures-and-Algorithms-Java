package org.example.data_structures.array;

/**
 * _3042_Leetcode_Count_Prefix_and_Suffix_Pairs_I
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/30/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/30/24   NhanDinhVan    Create
 */
public class _3042_Leetcode_Count_Prefix_and_Suffix_Pairs_I {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i = 0; i < words.length - 1; i++){
            for(int j = i + 1; j < words.length; j++){
                if(isPrefixAndSuffix(words[i],words[j]))
                    count++;
            }
        }
        return count;
    }
    public boolean isPrefixAndSuffix(String s1, String s2){
        if(s1.length() > s2.length())
            return false;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i))
                return false;
        }
        for(int i = s1.length() - 1, j = s2.length() - 1; i >= 0; i--, j--){
            if(s1.charAt(i) != s2.charAt(j))
                return false;
        }
        return true;
    }
}
