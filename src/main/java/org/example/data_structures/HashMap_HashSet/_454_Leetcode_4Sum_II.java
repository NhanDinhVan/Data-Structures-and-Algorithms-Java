package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;

/**
 * _454_Leetcode_4Sum_II
 * <p>
 * Version 1.0
 * <p>
 * Date:  8/19/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 8/19/24   NhanDinhVan    Create
 */
public class _454_Leetcode_4Sum_II {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int count = 0;
        for(int i :nums1)
            for(int j : nums2)
                hmap.put(i + j, hmap.getOrDefault(i + j,0)+1);
        for(int i :nums3)
            for(int j : nums4)
                count += hmap.getOrDefault(-(i+j),0);

        return count;
    }
}
