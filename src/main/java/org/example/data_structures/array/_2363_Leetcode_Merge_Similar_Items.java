package org.example.data_structures.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * _2363_Leetcode_Merge_Similar_Items
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/2/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/2/2025    NhanDinhVan    Create
 */

public class _2363_Leetcode_Merge_Similar_Items {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Arrays.sort(items1, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(items2, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0, j = 0;

        while(i < items1.length && j < items2.length){
            if(items1[i][0] == items2[j][0]){
                ans.add(new ArrayList(Arrays.asList(items1[i][0], items1[i++][1] + items2[j++][1])));
            }else if (items1[i][0] < items2[j][0]){
                ans.add(Arrays.asList(items1[i][0], items1[i++][1]));
            }else{
                ans.add(Arrays.asList(items2[j][0], items2[j++][1]));
            }
        }

        while(i < items1.length) ans.add(Arrays.asList(items1[i][0], items1[i++][1]));
        while(j < items2.length) ans.add(Arrays.asList(items2[j][0], items2[j++][1]));


        return ans;
    }
}
