package org.example.data_structures.array;

/**
 * _303_Leetcode_Range_Sum_Query_Immutable
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/30/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/30/2025    NhanDinhVan    Create
 */

public class _303_Leetcode_Range_Sum_Query_Immutable {
    class NumArray {
        private int[] arr;
        public NumArray(int[] nums) {
            arr = nums;
        }

        public int sumRange(int left, int right) {
            int ans = 0;
            for(int i = left; i <= right; i++){
                ans += arr[i];
            }
            return ans;
        }
    }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
}
