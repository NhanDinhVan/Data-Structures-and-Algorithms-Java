package org.example.counting;

import java.util.Arrays;

/**
 * _274_Leetcode_H_Index
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/4/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/4/2025    NhanDinhVan    Create
 */

public class _274_Leetcode_H_Index {
    public static int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        for(int i = 0; i < n; i++){
            int h = n - i;
            if(citations[i] >= h) return h;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] testcase = {3,0,6,1,5};
        System.out.println(hIndex(testcase));
    }
}
