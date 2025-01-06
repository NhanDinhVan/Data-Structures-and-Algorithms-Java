package org.example.math;

import java.util.PriorityQueue;

/**
 * _2578_Leetcode_Split_With_Minimum_Sum
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/6/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/6/2025    NhanDinhVan    Create
 */

public class _2578_Leetcode_Split_With_Minimum_Sum {
    public int splitNum(int num) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n1 = 0;
        int n2 = 0;

        while (num != 0){
            pq.add(num % 10);
            num = num / 10;
        }

        while(!pq.isEmpty()){
            n1 = (n1*10) + pq.poll();
            if(!pq.isEmpty())
                n2 = (n2*10) + pq.poll();
        }
        return n1 + n2;
    }
}
