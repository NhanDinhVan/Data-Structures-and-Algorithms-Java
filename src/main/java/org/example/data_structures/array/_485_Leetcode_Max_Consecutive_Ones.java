package org.example.data_structures.array;

/**
 * _485_Leetcode_Max_Consecutive_Ones
 * <p>
 * Version 1.0
 * <p>
 * Date:  8/19/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 8/19/24   NhanDinhVan    Create
 */
public class _485_Leetcode_Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        // Solution 1
//        int count = 0;
//        int max = 0;
//        for(int i = 0; i < nums.length; i++){
//            if(nums[i] == 0){
//                max = (count >= max) ? count : max;
//                count = 0;
//            }else{
//                count++;
//            }
//        }
//        max = (count >= max) ? count : max;
//        return max;

        // Optimize code

        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                // max = (count >= max) ? count : max;
                if(count>max)
                    max = count;
                count = 0;
            }else{
                count++;
            }
        }
        if(count>max)
            max = count;
        return max;
    }
}
