package org.example.data_structures.HashMap_HashSet;

import java.util.Arrays;

/**
 * _137_Leetcode_Single_Number_II
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/6/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/6/24   NhanDinhVan    Create
 */
public class _137_Leetcode_Single_Number_II {
    public int singleNumber(int[] nums) {
        //Brute Force
//        boolean isSingle = false;
//        for(int i = 0 ; i < nums.length ; i++){
//            isSingle = true;
//            for(int j = 0 ; j < nums.length; j++){
//                if(j != i && nums[j] == nums[i])
//                    isSingle = false;
//            }
//            if(isSingle)
//                return nums[i];
//        }
//        return 0;

        // Two pointer engineering
        Arrays.sort(nums);
        int f = 0;
        boolean isSingle = true;
        for(int i = 0; i < nums.length; i++){
            f = i + 2;
            if(f > nums.length - 1){
                return nums[nums.length - 1];
            }
            if(nums[i] == nums[f]){
                i = f;
                continue;
            }
            return nums[i];
        }
        return 0;
    }
}
