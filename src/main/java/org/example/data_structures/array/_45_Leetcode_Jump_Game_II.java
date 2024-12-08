package org.example.data_structures.array;

/**
 * _45_Leetcode_Jump_Game_II
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/8/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/8/2024    NhanDinhVan    Create
 */

public class _45_Leetcode_Jump_Game_II {
//    public int jump(int[] nums) {
//        int n = nums.length - 1;
//        int count = 0;
//        while(n > 0){
//            for(int i = 0; i <= n; i++){
//                if(nums[i] + i >= n){
//                    count++;
//                    n = i;
//                    break;
//                }
//            }
//        }
//        return count;
//    }

    public int jump(int[] nums) {
        if(nums.length == 1) return 0;
        int max = 0;
        int cur = 0;
        int jumps = 0;

        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, i + nums[i]);

            if(i == cur){
                jumps++;
                cur = max;
                if(cur >= nums.length - 1) break;
            }
        }
        return jumps;
    }
}
