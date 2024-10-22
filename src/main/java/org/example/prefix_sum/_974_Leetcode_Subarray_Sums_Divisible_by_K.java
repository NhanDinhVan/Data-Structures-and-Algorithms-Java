package org.example.prefix_sum;

import java.util.HashMap;

/**
 * _974_Leetcode_Subarray_Sums_Divisible_by_K
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/22/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/22/2024    NhanDinhVan    Create
 */

public class _974_Leetcode_Subarray_Sums_Divisible_by_K {
    public int subarraysDivByK(int[] nums, int k) {
//        HashMap<Integer, Integer> hmap = new HashMap<>();
//        hmap.put(0,1);
//        int curSum = 0;
//        int count = 0;
//
//        for(int i = 0; i < nums.length; i++){
//            curSum += nums[i];
//            int tmp = curSum % k;
//
//            if(tmp < 0)
//                tmp += k;
//
//            if(hmap.containsKey(tmp)){
//                count += hmap.get(tmp);
//            }
//            hmap.put(tmp, hmap.getOrDefault(tmp,0) + 1);
//        }
//        return count;

    int[] arr = new int[k];
    arr[0] = 1;
    int curSum = 0;
    int count = 0;
    for(int i = 0; i < nums.length; i++){
        curSum += nums[i];
        int tmp = curSum % k;
        if(tmp < 0)
            tmp += k;

        count += arr[tmp];
        arr[tmp]++;
    }
    return count;
    }
}
