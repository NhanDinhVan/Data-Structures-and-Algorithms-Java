package org.example.data_structures.HashMap_HashSet;

import java.util.Arrays;
import java.util.HashMap;

/**
 * _645_Leetcode_Set_Mismatch
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/20/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/20/2024    NhanDinhVan    Create
 */

public class _645_Leetcode_Set_Mismatch {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int max = 0;
        int dup = 0;
        for(int i = 0; i < nums.length; i++){
            if(hmap.containsKey(nums[i])){
                dup = nums[i];
            }else{
                hmap.put(nums[i],nums[i]);
            }
        }
        for(int i = 1; i <= nums.length; i++){
            if(!hmap.containsKey(i))
                return new int[] {dup,i};
        }
        return null;
    }
}
