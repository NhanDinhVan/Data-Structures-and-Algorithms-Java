package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;

/**
 * _383_Leetcode_Ransom_Note
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/9/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/9/2025    NhanDinhVan    Create
 */

public class _383_Leetcode_Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for(char c : magazine.toCharArray())
//            map.put(c, map.getOrDefault(c, 0) + 1);
//
//        for(char c : ransomNote.toCharArray()){
//            if(!map.containsKey(c)) return false;
//            map.put(c, map.get(c) - 1);
//            if(map.get(c) == 0) map.remove(c);
//        }
//        return true;

        int a[] = new int[26];

        for(int i=0;i<magazine.length();i++){
            a[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(--a[ransomNote.charAt(i)-'a']<0)
                return false;
        }
        return true;
    }
}
