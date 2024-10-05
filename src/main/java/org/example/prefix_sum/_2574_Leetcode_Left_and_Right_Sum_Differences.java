package org.example.prefix_sum;

/**
 * _2574_Leetcode_Left_and_Right_Sum_Differences
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/5/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/5/24   NhanDinhVan    Create
 */
public class _2574_Leetcode_Left_and_Right_Sum_Differences {
    public int[] leftRightDifference(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i < nums.length; i++)
            rightSum -= nums[i];
        for(int i = 0; i < nums.length; i++){
            rightSum+=nums[i];
            System.out.println(rightSum);
            int tmp = leftSum + nums[i];
            nums[i] = Math.abs(leftSum + rightSum);
            leftSum = tmp;
        }
        return nums;
    }
}
