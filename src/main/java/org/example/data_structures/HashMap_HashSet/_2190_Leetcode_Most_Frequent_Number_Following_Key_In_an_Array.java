package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;
import java.util.Map;

/**
 * _2190_Leetcode_Most_Frequent_Number_Following_Key_In_an_Array
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/6/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/6/2025    NhanDinhVan    Create
 */

public class _2190_Leetcode_Most_Frequent_Number_Following_Key_In_an_Array {
    public int mostFrequent(int[] nums, int key) {
        int max = 0;
        int ans = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == key){
                map.put(nums[i+1], map.getOrDefault(nums[i+1], 0)+1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                ans = entry.getKey();
                max = entry.getValue();
            }
        }
        return ans;
    }
}
