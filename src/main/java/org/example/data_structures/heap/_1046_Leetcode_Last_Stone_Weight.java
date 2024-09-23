package org.example.data_structures.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * _1046_Leetcode_Last_Stone_Weight
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/23/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/23/24   NhanDinhVan    Create
 */
public class _1046_Leetcode_Last_Stone_Weight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : stones)
            maxHeap.add(i);

        while (maxHeap.size() > 1){
            int y = maxHeap.poll();
            int x = maxHeap.poll();
            if(x == y && maxHeap.size()==0)
                return 0;
            if(x != y)
                maxHeap.add(y - x);
        }
        return maxHeap.poll();
    }
}
