package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;

/**
 * _13_Leetcode_Roman_to_Integer
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/13/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/13/2024    NhanDinhVan    Create
 */

public class _13_Leetcode_Roman_to_Integer {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        hmap.put('I', 1);
        hmap.put('V', 5);
        hmap.put('X', 10);
        hmap.put('L', 50);
        hmap.put('C', 100);
        hmap.put('D', 500);
        hmap.put('M', 1000);
        int result = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(hmap.get(s.charAt(i)) < hmap.get(s.charAt(i + 1))){
                result -= hmap.get(s.charAt(i));
            }else{
                result += hmap.get(s.charAt(i));
            }
        }
        return result + hmap.get(s.charAt(s.length() - 1));
    }
}
