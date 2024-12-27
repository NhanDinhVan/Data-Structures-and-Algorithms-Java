package org.example.two_pointer;

/**
 * _1768_Leetcode_Merge_Strings_Alternately
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/27/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/27/2024    NhanDinhVan    Create
 */

public class _1768_Leetcode_Merge_Strings_Alternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        ans.append(word1.charAt(0));
        if(word1.length()==1){
            ans.append(word2);
            return ans.toString();
        }
        int i = 1;
        int j = 0;

        while (i<word1.length() && j<word2.length()){
            ans.append(word2.charAt(j));
            ans.append(word1.charAt(i));
            i++;j++;
        }
        if(i >= word1.length()){
            ans.append(word2.substring(j));
        }
        if(j >= word2.length()){
            ans.append(word1.substring(i));
        }

        return ans.toString();
    }
}
