package org.example.data_structures.HashMap_HashSet;

import java.util.*;

/**
 * _2215_Leetcode_Find_the_Difference_of_Two_Arrays
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/27/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/27/2024    NhanDinhVan    Create
 */

public class _2215_Leetcode_Find_the_Difference_of_Two_Arrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            set2.add(nums2[i]);
        }
        for(int i : set2){
            if(!set1.contains(i)){
                l2.add(i);
            }
        }
        for(int i :set1){
            if(!set2.contains(i)){
                l1.add(i);
            }
        }
        return new ArrayList<>(List.of(l1,l2));
    }
}
