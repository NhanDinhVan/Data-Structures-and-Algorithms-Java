package org.example.data_structures.linked_list;

import java.util.LinkedList;

/**
 * _1389_Leetcode_Create_Target_Array_in_the_Given_Order
 * <p>
 * Version 1.0
 * <p>
 * Date:  7/29/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 7/29/2024    NhanDinhVan    Create
 */

public class _1389_Leetcode_Create_Target_Array_in_the_Given_Order {
    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i],nums[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return nums;

//        int n = nums.length;
//        int[] result = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            result[i] = -1; // Giá trị mặc định
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            int idx = index[i];
//            int value = nums[i];
//
//            for (int j = n - 1; j > idx; j--) {
//                result[j] = result[j - 1];
//            }
//
//            result[idx] = value;
//        }
//
//        return result;
    }
}
