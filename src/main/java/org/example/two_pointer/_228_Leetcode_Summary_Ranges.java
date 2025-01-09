package org.example.two_pointer;

import java.util.ArrayList;
import java.util.List;

/**
 * _228_Leetcode_Summary_Ranges
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/9/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/9/2025    NhanDinhVan    Create
 */

public class _228_Leetcode_Summary_Ranges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums.length == 0) return result;

        int start = 0;
        int end = 0;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i]+1 == nums[i+1]){
                end++;
                continue;
            }
            if(start == end){
                result.add(nums[start]+"");

            }else{
                result.add(nums[start]+"->"+nums[end]);
            }
            start = i + 1;
            end = start;
        }

        if(start == end) {
            result.add(nums[start] + "");
        } else {
            result.add(nums[start] + "->" + nums[end]);
        }

        return result;
    }
}
