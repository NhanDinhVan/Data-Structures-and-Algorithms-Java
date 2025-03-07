package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;

/**
 * _2287_Leetcode_Rearrange_Characters_to_Make_Target_String
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/7/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/7/2025    NhanDinhVan    Create
 */

public class _2287_Leetcode_Rearrange_Characters_to_Make_Target_String {
    public int rearrangeCharacters(String s, String target) {
        if(target.length() > s.length() || (s.length() == target.length() && !s.equals(target))){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> tarMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int i = 0; i < target.length(); i++){
            tarMap.put(target.charAt(i), tarMap.getOrDefault(target.charAt(i), 0)+1);
        }

        for(int i = 0; i < target.length(); i++){
            if (!map.containsKey(target.charAt(i))) {
                return 0;
            }

            ans = Math.min(ans, (map.get(target.charAt(i))/tarMap.get(target.charAt(i))));
        }

        return ans;
    }
}
