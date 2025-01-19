package org.example.two_pointer;

/**
 * _42_Leetcode_Trapping_Rain_Water
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/19/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/19/2025    NhanDinhVan    Create
 */

public class _42_Leetcode_Trapping_Rain_Water {
    public int trap(int[] height) {
        if(height == null || height.length == 0) return 0;

        int left = 0, right = height.length - 1;
        int maxLeft = 0; int maxRight = 0;
        int waterTrapped = 0;

        while (left < right){
            if(height[left] < height[right]){
                if(height[left] >= maxLeft){
                    maxLeft = height[left];
                }else{
                    waterTrapped += (maxLeft - height[left]);
                }
                left++;
            }else{
                if(height[right] >= maxRight){
                    maxRight = height[right];
                }else{
                    waterTrapped += (maxRight - height[right]);
                }
                right--;
            }
        }
        return waterTrapped;
    }
}
