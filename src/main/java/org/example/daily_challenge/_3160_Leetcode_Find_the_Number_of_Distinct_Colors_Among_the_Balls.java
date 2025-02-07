package org.example.daily_challenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * _3160_Leetcode_Find_the_Number_of_Distinct_Colors_Among_the_Balls
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/7/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/7/2025    NhanDinhVan    Create
 */

public class _3160_Leetcode_Find_the_Number_of_Distinct_Colors_Among_the_Balls {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];
        Map<Integer, Integer> idxMapper = new HashMap<>();
        HashMap<Integer, Integer> valMapper = new HashMap<>();

        for(int i = 0; i < n; i++){
            int[] query = queries[i];
            if(!idxMapper.containsKey(query[0])){
                idxMapper.put(query[0], query[1]);
                valMapper.put(query[1], valMapper.getOrDefault(query[1], 0)+1);
            }else{
                int oldValue = idxMapper.get(query[0]);
                int num = valMapper.get(oldValue);

                if(num == 1){
                    valMapper.remove(oldValue);
                }else{
                    valMapper.put(oldValue, num-1);
                }

                idxMapper.put(query[0], query[1]);
                valMapper.put(query[1], valMapper.getOrDefault(query[1], 0) + 1);
            }

            ans[i] = valMapper.size();
        }
        return ans;
    }
}
