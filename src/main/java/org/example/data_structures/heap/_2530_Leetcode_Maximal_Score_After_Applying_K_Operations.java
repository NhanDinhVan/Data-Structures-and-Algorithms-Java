package org.example.data_structures.heap;

import java.util.PriorityQueue;

/**
 * _2530_Leetcode_Maximal_Score_After_Applying_K_Operations
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/14/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/14/2024    NhanDinhVan    Create
 */

public class _2530_Leetcode_Maximal_Score_After_Applying_K_Operations {
    public long maxKelements(int[] nums, int k) {
        long finalScore = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b.compareTo(a));
        for(int i = 0; i < nums.length; i++){
            pq.add(nums[i]);
        }
        while(k > 0){
            int i = pq.poll();
            finalScore += i;
            if(i % 3 == 0){
                pq.add(i/3);
            }else{
                pq.add(i/3 + 1);
            }
            k--;
        }
        return finalScore;
    }
}
