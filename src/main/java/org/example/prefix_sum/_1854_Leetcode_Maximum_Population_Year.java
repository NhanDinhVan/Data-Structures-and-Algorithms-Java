package org.example.prefix_sum;

/**
 * _1854_Leetcode_Maximum_Population_Year
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
public class _1854_Leetcode_Maximum_Population_Year {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101];
        int max = 0;

        for(int i = 0; i < logs.length; i++) {
            int b = logs[i][0] - 1950;
            int d = logs[i][1] - 1950;
            for(int j = b; j < d; j++){
                years[j]++;
                max = Math.max(max, years[j]);
            }
        }
        for(int i = 0; i < years.length; i++) {
            if(years[i] == max) return i+1950;
        }
        return max;
    }
}
