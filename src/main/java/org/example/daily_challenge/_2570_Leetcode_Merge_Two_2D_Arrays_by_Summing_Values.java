package org.example.daily_challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * _2570_Leetcode_Merge_Two_2D_Arrays_by_Summing_Values
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/2/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/2/2025    NhanDinhVan    Create
 */

public class _2570_Leetcode_Merge_Two_2D_Arrays_by_Summing_Values {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        // HashMap<Integer, Integer> dict = new HashMap<>();
        // for(int[] nums : nums1){
        //     dict.put(nums[0], dict.getOrDefault(nums[0], 0) + nums[1]);
        // }
        // for(int[] nums : nums2){
        //     dict.put(nums[0], dict.getOrDefault(nums[0], 0) + nums[1]);
        // }

        // int[][] ans = new int[dict.size()][2];
        // int idx = 0;

        // for(Map.Entry<Integer, Integer> entry : dict.entrySet()){
        //     ans[idx++] = new int[] {entry.getKey(), entry.getValue()};
        // }

        // Arrays.sort(ans, (a, b) -> Integer.compare(a[0], b[0]));

        // return ans;

        List<int[]> ans = new ArrayList<>();
        int i = 0, j =0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i][0] == nums2[j][0]){
                ans.add(new int[] {nums1[i][0], nums1[i++][1] + nums2[j++][1]});
            }else if(nums1[i][0] < nums2[j][0]){
                ans.add(nums1[i++]);
            }else{
                ans.add(nums2[j++]);
            }
        }

        while(i < nums1.length){
            ans.add(nums1[i++]);
        }

        while(j < nums2.length){
            ans.add(nums2[j++]);
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
