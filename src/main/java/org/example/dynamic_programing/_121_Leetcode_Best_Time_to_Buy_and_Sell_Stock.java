package org.example.dynamic_programing;

import java.util.HashMap;
import java.util.HashSet;

/**
 * _121_Leetcode_Best_Time_to_Buy_and_Sell_Stock
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/9/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/9/2024    NhanDinhVan    Create
 */

public class _121_Leetcode_Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int minCur = prices[0];
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            int curProfit = prices[i] - minCur;
            profit = Math.max(profit, curProfit);
            minCur = Math.min(minCur, prices[i]);
        }
        return profit;
    }
}
