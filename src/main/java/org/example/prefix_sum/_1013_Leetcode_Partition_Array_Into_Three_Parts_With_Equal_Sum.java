package org.example.prefix_sum;

/**
 * _1013_Leetcode_Partition_Array_Into_Three_Parts_With_Equal_Sum
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/4/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/4/2025    NhanDinhVan    Create
 */

public class _1013_Leetcode_Partition_Array_Into_Three_Parts_With_Equal_Sum {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        int check = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++)
            sum += arr[i];

        if(sum%3 != 0) return false;

        int target = sum / 3;

        for (int num : arr) {
            check += num;

            if (check == target) {
                count++;
                check = 0;

                if (count == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
