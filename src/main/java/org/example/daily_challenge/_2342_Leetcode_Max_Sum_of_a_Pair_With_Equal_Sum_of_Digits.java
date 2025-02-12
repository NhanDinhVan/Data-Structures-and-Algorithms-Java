package org.example.daily_challenge;

import java.util.HashMap;

/**
 * _2342_Leetcode_Max_Sum_of_a_Pair_With_Equal_Sum_of_Digits
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/12/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/12/2025    NhanDinhVan    Create
 */

public class _2342_Leetcode_Max_Sum_of_a_Pair_With_Equal_Sum_of_Digits {
    public static int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = -1;

        for(int num : nums){
            int sum = 0;
            int n = num;
            while(n>0){
                sum += n%10;
                n /= 10;
            }
            if(!map.containsKey(sum)){
                map.put(sum, num);
            }else{
                max = Math.max(max, map.get(sum) + num);

                map.put(sum, Math.max(num, map.get(sum)));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] n = {18,43,36,13,7};
        maximumSum(n);
    }
}
