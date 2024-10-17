package org.example.data_structures.array;

/**
 * _496_Leetcode_Next_Greater_Element_I
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/17/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/17/2024    NhanDinhVan    Create
 */

public class _496_Leetcode_Next_Greater_Element_I {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i = 0; i < nums1.length; i++){
            int j = 0;
            while(nums2[j] != nums1[i]){
                j++;
            }
            int k;
            for(k = j + 1; k < nums2.length; k++){
                if(nums2[k] > nums2[i]){
                    nums1[i] = nums2[k];
                    break;
                }
            }
            if(k == nums2.length){
                nums1[i] = -1;
            }
        }
        return nums1;
    }
}
