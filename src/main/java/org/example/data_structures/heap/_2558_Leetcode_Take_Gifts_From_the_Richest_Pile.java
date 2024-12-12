package org.example.data_structures.heap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class _2558_Leetcode_Take_Gifts_From_the_Richest_Pile {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;

        for(int i : gifts) maxHeap.add(i);

        while (k > 0){
            int tmp = maxHeap.poll();
            maxHeap.add((int) Math.sqrt(tmp));
            k--;
        }

        for(Integer i : maxHeap) sum+=i;

        return sum;
    }
}
