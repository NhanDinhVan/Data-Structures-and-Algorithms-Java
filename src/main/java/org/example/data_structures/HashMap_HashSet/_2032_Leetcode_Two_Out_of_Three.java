package org.example.data_structures.HashMap_HashSet;

import java.util.*;

/**
 * _2032_Leetcode_Two_Out_of_Three
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/1/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/1/2025    NhanDinhVan    Create
 */

public class _2032_Leetcode_Two_Out_of_Three {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        Set<Integer> ans = new HashSet<>();

        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);
        for (int num : nums3) set3.add(num);

        for (int num : set1) {
            if (set2.contains(num) || set3.contains(num)) {
                ans.add(num);
            }
        }
        for (int num : set2) {
            if (set3.contains(num)) {
                ans.add(num);
            }
        }

        return new ArrayList<>(ans);
    }
}
