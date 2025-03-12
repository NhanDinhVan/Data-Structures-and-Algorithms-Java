package org.example.data_structures.array;

import java.util.ArrayList;
import java.util.List;

/**
 * _2248_Leetcode_Intersection_of_Multiple_Arrays
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/12/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/12/2025    NhanDinhVan    Create
 */

public class _2248_Leetcode_Intersection_of_Multiple_Arrays {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ans = new ArrayList<>();
        int[] count = new int[1001];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                count[nums[i][j]]++;
            }
        }

        int max = 1;
        for(int i = 0; i < 1001; i++){
            if(count[i] == nums.length){
                ans.add(i);
            }
        }

        return ans;
    }
}
