package org.example.data_structures.heap;

import java.util.*;

/**
 * _692_Leetcode_Top_K_Frequent_Words
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/2/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/2/24   NhanDinhVan    Create
 */
public class _692_Leetcode_Top_K_Frequent_Words {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();
        HashMap<String, Integer> hmap = new HashMap<>();
        for(String i : words)
            hmap.put(i, hmap.getOrDefault(i, 0) + 1);

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                (a,b) -> {
                    if(a.getValue() == b.getValue())
                        return a.getKey().compareTo(b.getKey());
                    else
                        return b.getValue() - a.getValue();
                }
        );
        pq.addAll(hmap.entrySet());
        while(k > 0){
            result.add(pq.poll().getKey());
            k--;
        }
        return result;
    }
}
