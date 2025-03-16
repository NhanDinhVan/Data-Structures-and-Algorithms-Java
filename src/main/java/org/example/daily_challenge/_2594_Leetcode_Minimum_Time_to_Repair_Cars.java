package org.example.daily_challenge;

/**
 * _2594_Leetcode_Minimum_Time_to_Repair_Cars
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/16/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/16/2025    NhanDinhVan    Create
 */

public class _2594_Leetcode_Minimum_Time_to_Repair_Cars {
    public long repairCars(int[] ranks, int cars) {
        int n = ranks.length;
        long left = 1;
        long right = (long)ranks[0] * (long)cars * (long)cars;

        while(left < right){
            long mid = left + (right-left)/2;
            if(check(ranks, cars, mid)){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }

    public boolean check(int[] rank, int cars, long time){
        long count = 0;

        for(int r : rank){
            long maxCars = (long) Math.sqrt(time / r);
            count += maxCars;
            if(count >= cars) return true;
        }
        return count >= cars;
    }
}
