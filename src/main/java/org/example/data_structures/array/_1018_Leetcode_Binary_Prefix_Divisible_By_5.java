package org.example.data_structures.array;

import org.example.data_structures.linked_list.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * _1018_Leetcode_Binary_Prefix_Divisible_By_5
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/8/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/8/2024    NhanDinhVan    Create
 */

public class _1018_Leetcode_Binary_Prefix_Divisible_By_5 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int curNum = 0;
        for(int i = 0; i < nums.length; i++){
            curNum = curNum*2 + nums[i];
            if(curNum % 5 == 0){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}
