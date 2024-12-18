package org.example.data_structures.array;

public class _1475_Leetcode_Final_Prices_With_a_Special_Discount_in_a_Shop {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        if(n<=1) return prices;
        for(int i = 0; i < n - 1; i ++){
            for(int j = i + 1; j < n; j++){
                if(prices[j] <= prices[i]){
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
