package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;

/**
 * _1814_Leetcode_Count_Nice_Pairs_in_an_Array
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/11/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/11/2025    NhanDinhVan    Create
 */

public class _1814_Leetcode_Count_Nice_Pairs_in_an_Array {
    public int countNicePairs(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int mod = 1_000_000_007;
        int ans = 0;

        for(int n : nums){
            int diff = n - reverse(n);
            ans = (ans + freq.getOrDefault(diff, 0))%mod;
            freq.put(diff, freq.getOrDefault(diff, 0)+1);
        }
        return ans;
    }
    public static int reverse(int n){
        int rev = 0;
        while(n>0){
            rev = rev*10 + n%10;
            n = n/10;
        }
        return rev;
    }
}
