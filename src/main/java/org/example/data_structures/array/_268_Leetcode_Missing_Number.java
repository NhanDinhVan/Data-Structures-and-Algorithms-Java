package org.example.data_structures.array;

/**
 * _268_Leetcode_Missing_Number
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/1/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/1/24   NhanDinhVan    Create
 */
public class _268_Leetcode_Missing_Number {
    public int missingNumber(int[] nums) {
        boolean[] n = new boolean[nums.length + 1];

        for(int i = 0; i < nums.length; i++)
            n[nums[i]] = true;
        for(int i = 0; i < n.length; i++)
            if(n[i] == false)
                return i;
        return 0;
    }
}
