package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;

/**
 * _290_Leetcode_Word_Pattern
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/5/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/5/2024    NhanDinhVan    Create
 */

public class _290_Leetcode_Word_Pattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hmap = new HashMap<>();
        String[] sArray = s.split(" ");

        if(sArray.length != pattern.length()) return false;

        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            System.out.println(c);
            if(!hmap.containsKey(c)){
                if (hmap.containsValue(sArray[i])) return false;
                hmap.put(c, sArray[i]);
            }else{
                if(!sArray[i].equals(hmap.get(c))) return false;
            }
        }
        return true;
    }
}
