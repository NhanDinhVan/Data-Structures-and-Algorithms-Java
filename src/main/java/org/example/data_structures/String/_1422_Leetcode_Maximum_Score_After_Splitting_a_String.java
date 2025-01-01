package org.example.data_structures.String;

/**
 * _1422_Leetcode_Maximum_Score_After_Splitting_a_String
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/1/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/1/2025    NhanDinhVan    Create
 */

public class _1422_Leetcode_Maximum_Score_After_Splitting_a_String {
    public int maxScore(String s) {
        int max = 0;
        int l = 0;
        int r = 0;
        for(char i : s.toCharArray()){
            if(i == '1') r++;
        }
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == '0'){
                l++;
            }else{
                r--;
            }
            max = Math.max(max, l+r);
        }
        return max;
    }
}
