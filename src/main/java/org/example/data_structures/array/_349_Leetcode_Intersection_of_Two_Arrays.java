package org.example.data_structures.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * _349_Leetcode_Intersection_of_Two_Arrays
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/23/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/23/24   NhanDinhVan    Create
 */
public class _349_Leetcode_Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
//        HashMap<Integer, Integer> hmap = new HashMap();
//        List<Integer> res = new ArrayList<>();
//        for(int i : nums1){
//            hmap.put(i,hmap.getOrDefault(i,0)+1);
//        }
//        for(int i : nums2){
//            if(hmap.containsKey(i) && hmap.get(i) != 0) {
//                res.add(i);
//                hmap.remove(i);
//            }
//        }
//
//        int[] result = new int[res.size()];
//        for (int i = 0; i < res.size(); i++) {
//            result[i] = res.get(i);
//        }
//
//        return result;
//
        int[] nums = new int[1000];
        ArrayList<Integer> res = new ArrayList<>();
        for(int i : nums1)
            nums[i] = 1;
        for(int i : nums2)
            if(nums[i] == 1){
                nums[i] += 1;
                res.add(i);
            }


        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
