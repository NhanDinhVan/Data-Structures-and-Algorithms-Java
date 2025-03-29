package org.example.data_structures.String;

import java.util.HashMap;
import java.util.Map;

/**
 * _2085_LeetcodeCount_Common_Words_With_One_Occurrence
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/29/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/29/2025    NhanDinhVan    Create
 */

public class _2085_Leetcode_Count_Common_Words_With_One_Occurrence {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        int ans = 0;

        for(String s : words1){
            map1.put(s, map1.getOrDefault(s, 0)+1);
        }
        for(String s : words2){
            map2.put(s, map2.getOrDefault(s, 0)+1);
        }
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue() == 1 && map2.getOrDefault(key, 0) == 1) {
                ans++;
            }
        }
        return ans;
    }
}
