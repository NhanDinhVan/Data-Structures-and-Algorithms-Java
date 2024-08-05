package org.example.data_structures.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _219_Leetcode_Contains_Duplicate_II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Boolean result = false;
        int x ;
        for (int i = 0; i < nums.length; i++) {
            x = i - map.get(nums[i]);
            if (map.put(nums[i], i) != null && x <= k)
            {
                System.out.println(x);
                result = true;
            }else if(map.put(nums[i], i) != null && (i - map.get(nums[i])) > k)
                result = false;

            System.out.println(nums[i] + " " + map.get(nums[i]));

            map.put(nums[i], i);
        }
            return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        _219_Leetcode_Contains_Duplicate_II test = new _219_Leetcode_Contains_Duplicate_II();
        if(test.containsNearbyDuplicate(nums, k))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
