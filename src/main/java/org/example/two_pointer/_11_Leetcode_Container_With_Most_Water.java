package org.example.two_pointer;

/**
 * _11_Leetcode_Container_With_Most_Water
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/2/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/2/24   NhanDinhVan    Create
 */
public class _11_Leetcode_Container_With_Most_Water {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max_container = 0;

        while (l < r){
            int tmp = Math.min(height[l], height[r]) * (r - l);
            if(tmp > max_container)
                max_container = tmp;

            if(height[l] < height[r])
                l++;
            else
                r--;
        }
        return max_container;
    }
}
