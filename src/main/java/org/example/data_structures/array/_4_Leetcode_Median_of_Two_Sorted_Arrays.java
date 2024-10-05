package org.example.data_structures.array;

/**
 * _4_Leetcode_Median_of_Two_Sorted_Arrays
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/5/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/5/24   NhanDinhVan    Create
 */
public class _4_Leetcode_Median_of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int p1 = 0;
        int p2 = 0;
        int[] result = new int[nums1.length + nums2.length];
        while(p1 < nums1.length || p2 < nums2.length){
            if(p1 < nums1.length && (p2 >= nums2.length || nums1[p1] <= nums2[p2])){
                result[p1+p2] = nums1[p1];
                p1++;
            }else{
                result[p1+p2] = nums2[p2];
                p2++;
            }
        }
        double r;
        if (result.length % 2 == 0) {
            int mid1 = result.length / 2 - 1;
            int mid2 = result.length / 2;
            r = (result[mid1] + result[mid2]) / 2.0;
        } else {
            int mid = result.length / 2;
            r = result[mid];
        }
        return r;
    }
}
