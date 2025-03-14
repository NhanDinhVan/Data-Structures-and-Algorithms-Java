package org.example.daily_challenge;

/**
 * _2226_Leetcode_Maximum_Candies_Allocated_to_K_Children
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/14/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/14/2025    NhanDinhVan    Create
 */

public class _2226_Leetcode_Maximum_Candies_Allocated_to_K_Children {
    public int maximumCandies(int[] candies, long k) {
        if(k == 0) return 0;
        int result = 0;
        int low = 1;
        int high = Integer.MIN_VALUE;

        for(int i : candies) high = Math.max(high, i);

        while(low <= high){
            int mid = low + (high - low)/2;
            if(check(k, candies, mid)){
                result = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return result;
    }

    public static boolean check(long k, int[] candies, int n){
        if (n == 0) return false; // Tránh chia cho 0
        long count = 0;
        for (int c : candies) {
            count += c / n;
            if (count >= k) return true; // Không cần kiểm tra hết nếu đủ
        }
        return false;
    }
}
