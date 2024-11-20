package org.example.greedy;

import java.util.PriorityQueue;

/**
 * _1710_Leetcode_Maximum_Units_on_a_Truck
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/20/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/20/2024    NhanDinhVan    Create
 */

public class _1710_Leetcode_Maximum_Units_on_a_Truck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int sum = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(b[1], a[1]) // Descending order of the first element
        );
        for(int i = 0; i < boxTypes.length; i++){
            pq.add(boxTypes[i]);
        }

        while (truckSize > 0 && !pq.isEmpty()){
            int[] k = pq.poll();
            if(k[0] >= truckSize){
                sum+= (truckSize*k[1]);
                truckSize = 0;
                break;
            }
                sum += (k[0] * k[1]);
                truckSize -= k[0];
        }
        return sum;
    }
}
