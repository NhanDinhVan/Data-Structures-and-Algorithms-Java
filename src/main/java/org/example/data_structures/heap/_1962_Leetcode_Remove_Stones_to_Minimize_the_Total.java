package org.example.data_structures.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class _1962_Leetcode_Remove_Stones_to_Minimize_the_Total {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;

        for(int i : piles) maxHeap.add(i);

        while (k > 0){
            int tmp = maxHeap.poll();
            maxHeap.add(tmp - tmp/2);
            k--;
        }

        for(Integer i : maxHeap) sum+=i;

        return sum;
    }
}
