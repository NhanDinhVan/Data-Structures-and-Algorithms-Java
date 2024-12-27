package org.example.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * _1431_Leetcode_Kids_With_the_Greatest_Number_of_Candies
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

public class _1431_Leetcode_Kids_With_the_Greatest_Number_of_Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = candies[0];
        for(int i : candies)
            max = Math.max(max, i);
        for(int i : candies){
            if(i+extraCandies>=max){
                ans.add(true);
                continue;
            }
            ans.add(false);
        }
        return ans;
    }
}
