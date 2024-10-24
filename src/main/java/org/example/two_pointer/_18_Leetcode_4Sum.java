package org.example.two_pointer;

import java.util.*;

/**
 * _18_Leetcode_4Sum
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/24/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/24/2024    NhanDinhVan    Create
 */

public class _18_Leetcode_4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++){
            for(int j = i + 1; j < nums.length - 2; j++){
                int l = j + 1;
                int r = nums.length - 1;

                while(l < r){
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];
                    if(sum == target){
                        set.add(List.of(nums[i],nums[j],nums[l],nums[r]));
                        // Bỏ qua các giá trị trùng lặp tiếp theo cho l và r
                        while (l < r && nums[l] == nums[l + 1]) l++;
                        while (l < r && nums[r] == nums[r - 1]) r--;

                        l++;
                        r--;
                    }else if(sum < target){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
