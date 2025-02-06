package org.example.daily_challenge;

import java.util.*;

/**
 * _1726_Leetcode_Tuple_with_Same_Product
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/6/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/6/2025    NhanDinhVan    Create
 */

public class _1726_Leetcode_Tuple_with_Same_Product {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Set<List<Integer>>> dict = new HashMap<>();
        int count = 0;

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j < nums.length; j++){
                int product = nums[i] * nums[j];
                List<Integer> tuple = Arrays.asList(Math.min(nums[i], nums[j]), Math.max(nums[i], nums[j]));

                dict.putIfAbsent(product, new HashSet<>());
                Set<List<Integer>> tuples = dict.get(product);

                count += tuples.size();
                tuples.add(tuple);
            }
        }
        return count*8;
    }
}
