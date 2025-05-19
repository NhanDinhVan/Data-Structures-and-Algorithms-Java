package org.example.data_structures.array;

/**
 * _3024_Leetcode_Type_of_Triangle
 * <p>
 * Version 1.0
 * <p>
 * Date:  5/19/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 5/19/2025    NhanDinhVan    Create
 */

public class _3024_Leetcode_Type_of_Triangle {
    public String triangleType(int[] nums) {
        if(
                (nums[0] + nums[1] <= nums[2]) ||
                        (nums[0] + nums[2] <= nums[1]) ||
                        (nums[1] + nums[2] <= nums[0])
        ) return "none";
        if(nums[0] == nums[1] && nums[1] == nums[2]) return "equilateral";
        if(nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]) return "isosceles";
        return "scalene";
    }
}
