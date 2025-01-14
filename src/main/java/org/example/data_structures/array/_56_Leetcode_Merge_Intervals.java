package org.example.data_structures.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * _56_Leetcode_Merge_Intervals
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/14/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/14/2025    NhanDinhVan    Create
 */

public class _56_Leetcode_Merge_Intervals {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 1) return intervals;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> ans = new ArrayList<>();
        int[] currentInterval = intervals[0];

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= currentInterval[1]){
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            }else{
                ans.add(currentInterval);
                currentInterval = intervals[i];
            }
        }
        ans.add(currentInterval);

        return ans.toArray(new int[ans.size()][]);
    }
}
