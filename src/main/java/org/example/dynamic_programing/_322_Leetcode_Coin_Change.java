package org.example.dynamic_programing;

import java.util.HashMap;

/**
 * _322_Leetcode_Coin_Change
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/19/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/19/2024    NhanDinhVan    Create
 */

public class _322_Leetcode_Coin_Change {
    HashMap<Integer, Integer> hmap = new HashMap<>();
    public int coinChange(int[] coins, int amount) {
        int result = helper(amount, coins);
        return (result != Integer.MAX_VALUE) ? result : -1;
    }
    public int helper(int amount, int[] coins){
        if(hmap.containsKey(amount))
            return hmap.get(amount);
        if(amount == 0)
            return 0;

        int ans = Integer.MAX_VALUE;
        for(int coin : coins){
            int s = amount - coin;
            if(s < 0) continue;
            int sub = helper(s, coins);
            if(sub != Integer.MAX_VALUE){
                ans = Math.min(ans, sub + 1);
            }
        }
        hmap.put(amount, ans);
        return ans;
    }
}
