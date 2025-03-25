package org.example.daily_challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * _3394_Leetcode_Check_if_Grid_can_be_Cut_into_Sections
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/25/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/25/2025    NhanDinhVan    Create
 */

public class _3394_Leetcode_Check_if_Grid_can_be_Cut_into_Sections {
    private boolean canMake(List<int[]> arr) {
        Collections.sort(arr, Comparator.comparingInt(a -> a[0]));
        int count = 0;
        int e = arr.get(0)[0] + 1;

        for (int[] it : arr) {
            int start = it[0];
            int end = it[1];
            if (start >= e) count++;
            e = Math.max(e, end);
        }

        return count >= 2;
    }

    public boolean checkValidCuts(int n, int[][] rectangles) {
        List<int[]> hori = new ArrayList<>() ;
        List<int[]> veri = new ArrayList<>();

        for (int[] rect : rectangles) {
            hori.add(new int[]{rect[0], rect[2]});
            veri.add(new int[]{rect[1], rect[3]});
        }

        return canMake(hori) || canMake(veri);
    }
}
