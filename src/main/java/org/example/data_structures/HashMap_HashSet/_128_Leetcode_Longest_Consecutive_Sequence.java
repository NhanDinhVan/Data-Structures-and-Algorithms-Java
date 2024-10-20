package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * _128_Leetcode_Longest_Consecutive_Sequence
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

public class _128_Leetcode_Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
//        if(nums.length == 0)
//            return 0;
//        int min = nums[0];
//        int max = nums[0];
//        int longest = 0;
//        int count = 0;
//        HashSet<Integer> hset = new HashSet<>();
//        for(int i = 0; i < nums.length; i++){
//            min = Math.min(min, nums[i]);
//            max = Math.max(max, nums[i]);
//            hset.add(nums[i]);
//        }
//        for(int i = min; i <= max; i++){
//            if(hset.contains(i)) {
//                count++;
//            }else{
//                longest = Math.max(longest, count);
//                count = 0;
//            }
//        }
//        longest = Math.max(longest, count);
//        return longest;

        if(nums.length == 0)
            return 0;
        Set<Integer> hs = new HashSet<>();
        int longest = 0;
        for(int i : nums)
            hs.add(i);
        for(int i : hs){
            if(!hs.contains(i - 1)){
                int count = 1;
                int curNum = i;
                while (hs.contains(curNum+1)){
                    count++;
                    curNum++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
