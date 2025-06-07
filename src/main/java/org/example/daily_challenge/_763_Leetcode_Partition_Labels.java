package org.example.daily_challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * _763_Leetcode_Partition_Labels
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/30/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/30/2025    NhanDinhVan    Create
 */

public class _763_Leetcode_Partition_Labels {
    public List<Integer> partitionLabels(String s) {
        int max = 0;
        int count = 0;
        List<Integer> ans = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;

        while(i < s.length()){
            map.putIfAbsent(s.charAt(i), getIdx(s.charAt(i), s));
            max = Math.max(max, map.get(s.charAt(i)));
            count++;
            if(max == i){
                ans.add(count);
                count = 0;
            }
            i++;
        }

        return ans;
    }

    public static int getIdx(char c, String s){
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == c) return i;
        }
        return -1;
    }
    //763. Partition Labels
}
