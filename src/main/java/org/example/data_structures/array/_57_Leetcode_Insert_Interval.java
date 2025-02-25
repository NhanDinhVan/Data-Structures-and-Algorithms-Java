package org.example.data_structures.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * _57_Leetcode_Insert_Interval
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/25/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/25/2025    NhanDinhVan    Create
 */

public class _57_Leetcode_Insert_Interval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int count = 0;
        int start = -1, end = -1;

        for(int i = 0; i < intervals.length; i++){
            int[] cur = intervals[i];
            if((cur[0] >= newInterval[0] && cur[0] <= newInterval[1]) || (cur[1] >= newInterval[0] && cur[1] <= newInterval[1]) || (newInterval[0] > cur[0] && newInterval[0] < cur[1])){
                count++;
                newInterval[0] = Math.min(newInterval[0], cur[0]);
                newInterval[1] = Math.max(newInterval[1], cur[1]);
                if(start == -1) start = i;
                end = i;
            }
        }

        int[][] ans = new int[intervals.length - count + 1][2];
        int idx = 0;

        for(int i = 0; i < intervals.length; i++){
            if(i == start){
                ans[idx++] = newInterval;
            }else if ( i < start || i > end){
                ans[idx++] = intervals[i];
            }
        }

        if(start == -1){
            ans[idx++] = newInterval;
            Arrays.sort(ans, Comparator.comparingInt(a -> a[0]));
        }

        return ans;
    }
}
