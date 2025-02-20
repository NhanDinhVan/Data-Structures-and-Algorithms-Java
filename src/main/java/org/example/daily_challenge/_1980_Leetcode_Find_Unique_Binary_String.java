package org.example.daily_challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * _1980_Leetcode_Find_Unique_Binary_String
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/20/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/20/2025    NhanDinhVan    Create
 */

public class _1980_Leetcode_Find_Unique_Binary_String {
    Set<String> dict = new HashSet<>();
    String ans = "";

    public String findDifferentBinaryString(String[] nums) {
        for(String s : nums){
            dict.add(s);
        }

        backtracking(nums[0].length(), new StringBuilder());

        return ans;
    }

    public boolean backtracking(int size, StringBuilder sb) {
        if (sb.length() == size) {
            if (!dict.contains(sb.toString())) {
                ans = sb.toString();
                return true;
            }
            return false;
        }

        sb.append('0');
        if (backtracking(size, sb)) return true;
        sb.deleteCharAt(sb.length() - 1);

        sb.append('1');
        if (backtracking(size, sb)) return true;
        sb.deleteCharAt(sb.length() - 1);

        return false;
    }
}
