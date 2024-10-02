package org.example.data_structures.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * _973_Leetcode_K_Closest_Points_to_Origin
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/2/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/2/24   NhanDinhVan    Create
 */
public class _973_Leetcode_K_Closest_Points_to_Origin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a,b) -> {
                    int distA = a[0]*a[0] + a[1]*a[1];
                    int distB = b[0]*b[0] + b[1]*b[1];
                    return distA - distB;
                }
        );
        for(int[] i : points)
            pq.add(i);
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }
        return result;
    }
}
