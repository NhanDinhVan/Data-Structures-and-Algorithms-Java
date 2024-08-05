package org.example.data_structures.other;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _136_LeetCode_Single_Number {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], set.add(nums[i]));
        }

        return getKeyByValue(map , true);
    }
    public static <K, V> K getKeyByValue(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null; // Trả về null nếu không tìm thấy

    }
}
