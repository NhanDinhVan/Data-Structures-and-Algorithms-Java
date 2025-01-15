package org.example.data_structures.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * _229_Leetcode_Majority_Element_II
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/15/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/15/2025    NhanDinhVan    Create
 */

public class _229_Leetcode_Majority_Element_II {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> dict = new HashMap<>();
        int n = nums.length/3;

        for(int i : nums){
            dict.put(i, dict.getOrDefault(i, 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : dict.entrySet()){
            if (entry.getValue() > n) ans.add(entry.getKey());
        }
        return ans;
    }
}
