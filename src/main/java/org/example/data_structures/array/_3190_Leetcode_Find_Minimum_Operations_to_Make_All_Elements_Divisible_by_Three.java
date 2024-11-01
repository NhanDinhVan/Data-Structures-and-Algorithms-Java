package org.example.data_structures.array;

/**
 * _3190_Leetcode_Find_Minimum_Operations_to_Make_All_Elements_Divisible_by_Three
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/1/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/1/2024    NhanDinhVan    Create
 */

public class _3190_Leetcode_Find_Minimum_Operations_to_Make_All_Elements_Divisible_by_Three {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int i : nums){
            if(i % 3 != 0)
                count++;
        }
        return count;
    }
}
