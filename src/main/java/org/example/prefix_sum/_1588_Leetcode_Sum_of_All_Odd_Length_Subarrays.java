package org.example.prefix_sum;

import java.util.HashMap;

/**
 * _1588_Leetcode_Sum_of_All_Odd_Length_Subarrays
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
public class _1588_Leetcode_Sum_of_All_Odd_Length_Subarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int sum = 0;
        int l = 0, r = 2;

        for(int i = 0; i < arr.length; i++){
            hmap.put(i, sum);
            sum+=arr[i];
        }

        while(r < arr.length){
            l = 0;
            System.out.println(sum);
            for(int i = r; i < arr.length; i++, l++){
                sum+=(hmap.get(i)-hmap.get(l));
            }
            r+=2;
        }
        return sum;
    }
}
