package org.example.data_structures.array;

import java.util.Arrays;

/**
 * _455_Leetcode_Assign_Cookies
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/1/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/1/2024    NhanDinhVan    Create
 */

public class _455_Leetcode_Assign_Cookies {
    public int findContentChildren(int[] g, int[] s) {
        int max = 0;
        int i = 0,j = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        while (i < g.length){
            while (j < s.length){
                if(s[j] >= g[i]){
                    max++;
                    j++;
                    break;
                }
                j++;
            }
            i++;
        }
        return max;
    }
}
