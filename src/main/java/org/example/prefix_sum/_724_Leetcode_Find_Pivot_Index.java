package org.example.prefix_sum;

/**
 * _724_Leetcode_Find_Pivot_Index
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/4/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/4/24   NhanDinhVan    Create
 */
public class _724_Leetcode_Find_Pivot_Index {
    public int pivotIndex(int[] nums) {
//        int l = 0;
//        int r = nums.length - 1;
//        int suml = nums[l], sumr = nums[r];
//        while(l != r){
//            if(suml > sumr){
//                r--;
//                sumr += nums[r];
//            }else if(suml < sumr){
//                l++;
//                suml += nums[l];
//            }else{
//                l++;
//                r--;
//                if(r==l){
//                    return l;
//                }
//            }
//        }
//        return l;
        int totalSum = 0;
        int leftSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            totalSum -= nums[i];

            if (leftSum == totalSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
