package org.example.recursion;

import java.util.HashMap;
import java.util.PriorityQueue;

public class _2593_Leetcode_Find_Score_of_an_Array_After_Marking_All_Elements {
//    int score = 0;
//    HashMap<Integer, Integer[]> map = new HashMap<>();
    public long findScore(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> {
            if(nums[a] != nums[b]) return nums[a] - nums[b];
            return a-b;
        });
        boolean[] marked = new boolean[nums.length];
        long score = 0;

        for(int i = 0; i < nums.length; i++) minHeap.add(i);

        while (!minHeap.isEmpty()) {
            int min = minHeap.poll();
            if(marked[min] || nums[min] == 0) continue;

            score += nums[min];
            for(int i = Math.max(min-1, 0); i <= Math.min(min+1, nums.length - 1); i++) {
                marked[i] = true;
            }
        }
        return score;
    }

}
