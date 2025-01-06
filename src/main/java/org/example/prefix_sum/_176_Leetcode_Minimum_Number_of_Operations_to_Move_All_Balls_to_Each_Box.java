package org.example.prefix_sum;

/**
 * _176_Leetcode_Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/6/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/6/2025    NhanDinhVan    Create
 */

public class _176_Leetcode_Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];

        for(int i = 0; i < boxes.length(); i++){
            int steps = 0;
            for(int j = 0; j < boxes.length(); j++){
                if (j != i && boxes.charAt(j) == '1') {
                    steps += Math.abs(j - i);
                }
            }
            ans[i] = steps;
        }
        return ans;
    }
}
