package org.example.prefix_sum;

/**
 * _1732_Leetcode_Find_the_Highest_Altitude
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
public class _1732_Leetcode_Find_the_Highest_Altitude {
    public int largestAltitude(int[] gain) {
        int prefix_sum = 0;
        int max = 0;
        for(int i = 0; i < gain.length; i++){
            prefix_sum += gain[i];
            if(prefix_sum > max)
                max = prefix_sum;
        }
        return max;
    }
}
