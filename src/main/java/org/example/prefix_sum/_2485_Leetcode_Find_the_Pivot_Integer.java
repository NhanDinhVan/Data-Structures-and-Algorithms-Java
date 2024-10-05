package org.example.prefix_sum;

/**
 * _2485_Leetcode_Find_the_Pivot_Integer
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
public class _2485_Leetcode_Find_the_Pivot_Integer {
    public int pivotInteger(int n) {
        int sum = 0;
        int leftSum = 0;
        for(int i = 1; i <= n; i++)
            sum+=i;
        for(int i = 0; i <= n; i++){
            sum-=i;
            if(leftSum == sum)
                return i;
            leftSum+=i;
        }
        return -1;
    }
}
