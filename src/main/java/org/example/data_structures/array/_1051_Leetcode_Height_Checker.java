package org.example.data_structures.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * _1051_Height_Checker
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/18/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/18/2024    NhanDinhVan    Create
 */

public class _1051_Leetcode_Height_Checker {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] expect = heights.clone();
        Arrays.sort(expect);
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != expect[i])
                count++;
        }
        return count;

    }
}
