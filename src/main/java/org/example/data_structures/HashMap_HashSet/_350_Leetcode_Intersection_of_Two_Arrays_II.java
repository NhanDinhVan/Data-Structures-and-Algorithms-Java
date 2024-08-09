package org.example.data_structures.HashMap_HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * _350_Leetcode_Intersection_of_Two_Arrays_II
 * <p>
 * Version 1.0
 * <p>
 * Date:  8/8/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 8/8/24    NhanDinhVan    Create
 */
public class _350_Leetcode_Intersection_of_Two_Arrays_II {
    public int[] intersect(int[] nums1, int[] nums2) {
//        HashMap<Integer, Integer> hmap = new HashMap<>();
//        ArrayList<Integer> intersection = new ArrayList<>();
//        for(int i : nums1){
//            hmap.put(i , i);
//        }
//        for(int i : nums2 ){
//            if(hmap.containsKey(i)){
//                intersection.add(i);
//                hmap.remove(i);
//            }
//        }
//        return intersection.toArray();

        //  Solution 2:
        // nums1: 4  9  5
        // nums2: 9  4  9  8  4 

        // count: 0
        // temp: 
        // result: 

        int temp[]=new int[1001];
        int result[]=new int[1001];

        for(int num:nums1){
            temp[num]++;
        }
        int count = 0;
        for (int num : nums2) {
            if (temp[num] > 0) {
                result[count++] = num;
                temp[num]--;
            }
        }

        return Arrays.copyOfRange(result, 0, count);
    }
}
