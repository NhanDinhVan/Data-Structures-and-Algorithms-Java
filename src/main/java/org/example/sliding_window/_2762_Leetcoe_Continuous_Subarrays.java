package org.example.sliding_window;

import java.util.Collections;
import java.util.HashMap;

public class _2762_Leetcoe_Continuous_Subarrays {
    public long continuousSubarrays(int[] nums) {
        if(nums.length == 1) return 1;
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        long total = 0;
        int l = 0;
        int r = 0;

        while(r < nums.length){
            frequencyMap.put(nums[r], frequencyMap.getOrDefault(nums[r], 0)+1);
            while(Collections.max(frequencyMap.keySet()) - Collections.min(frequencyMap.keySet()) > 2){
                frequencyMap.put(nums[l], frequencyMap.get(nums[l]) - 1);
                if(frequencyMap.get(nums[l]) == 0) frequencyMap.remove(nums[l]);
                l++;
            }
            total += r - l + 1;
            r++;
        }
        return total;
    }
}
