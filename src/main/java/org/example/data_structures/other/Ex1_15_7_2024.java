package org.example.data_structures.other;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ex1_15_7_2024 {
    public static int solution(int[] nums)
    {
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
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 0, 9, 9, 8};
        System.out.println(solution(nums)+"");
    }
}
