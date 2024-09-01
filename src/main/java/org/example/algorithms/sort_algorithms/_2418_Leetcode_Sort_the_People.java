package org.example.algorithms.sort_algorithms;

/**
 * _2418_Leetcode_Sort_the_People
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
public class _2418_Leetcode_Sort_the_People {
    public String[] sortPeople(String[] names, int[] heights) {

        for(int i = 0; i < heights.length; i++){
            int min = i;
            for(int j = i + 1; j < heights.length; j++){
                if(heights[j] > heights[min])
                    min = j;
            }
            if(min != i){
                int tmpH = heights[i];
                heights[i] = heights[min];
                heights[min] = tmpH;
                String tmpN = names[i];
                names[i] = names[min];
                names[min] = tmpN;
            }
        }
        return names;
    }
}
