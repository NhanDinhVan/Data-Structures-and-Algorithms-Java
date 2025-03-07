package org.example.daily_challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * _2523_Leetcode_Closest_Prime_Numbers_in_Range
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/7/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/7/2025    NhanDinhVan    Create
 */

public class _2523_Leetcode_Closest_Prime_Numbers_in_Range {
    public int[] closestPrimes(int left, int right) {
        List<Integer> list = new ArrayList<>();
        int[] ans = new int[2];
        for(int i = left; i <= right; i++){
            if(isPrime(i)) list.add(i);
        }

        if(list.size() < 2) return new int[] {-1, -1};
        ans = new int[] {list.get(0), list.get(1)};
        if(list.size() == 2) return ans;


        for(int i = 0; i < list.size() - 1; i++){
            if((list.get(i+1) - list.get(i)) < (ans[1] - ans[0])){
                ans[0] = list.get(i);
                ans[1] = list.get(i+1);
            }
        }

        return ans;
    }

    public static boolean isPrime(int n){
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;

        for(int i = 5; i * i <= n; i += 6){
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        // System.out.println(n);

        return true;
    }
}
