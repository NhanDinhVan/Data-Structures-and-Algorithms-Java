package org.example.data_structures.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * _1002_Leetcode_Find_Common_Characters
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/8/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/8/2024    NhanDinhVan    Create
 */

public class _1002_Leetcode_Find_Common_Characters {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i = 0; i < words[0].length(); i++){
            hmap.put(words[0].charAt(i), hmap.getOrDefault(words[0].charAt(i), 0)+1);
        }
        for(int i = 0; i < words.length; i++){
            HashMap<Character, Integer> curMap = new HashMap<>();
            for(int j = 0; j < words[i].length(); j++){
                char c = words[i].charAt(j);
                curMap.put(c , curMap.getOrDefault(c, 0) + 1);
            }

            for(char c : hmap.keySet()){
                if(curMap.containsKey(c)){
                    hmap.put(c, Math.min(hmap.get(c), curMap.get(c)));
                }else{
                    hmap.put(c,0);
                }
            }
        }
        for(Map.Entry<Character, Integer> m : hmap.entrySet()){
            for (int i = 0; i < m.getValue(); i++) {
                ans.add(String.valueOf(m.getKey()));
            }
        }
        return ans;
    }
}
