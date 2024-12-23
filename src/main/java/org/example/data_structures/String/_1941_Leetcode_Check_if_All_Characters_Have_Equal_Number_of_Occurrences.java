package org.example.data_structures.String;

import java.util.HashMap;
import java.util.Map;

/**
 * _1941_Leetcode_Check_if_All_Characters_Have_Equal_Number_of_Occurrences
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/23/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/23/2024    NhanDinhVan    Create
 */

public class _1941_Leetcode_Check_if_All_Characters_Have_Equal_Number_of_Occurrences {
    public boolean areOccurrencesEqual(String s) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        int check = 0;
//        for(int i = 0; i < s.length(); i++){
//            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
//        }
//        for(Map.Entry<Character,Integer> e : map.entrySet()){
//            int i = e.getValue();
//            if(check==0) check = i;
//            if(i!=check) return false;
//        }
//        return true;
        int[] fre = new int[26];

        for(int c : s.toCharArray())
            fre[c-'a']++;

        int check = fre[s.charAt(0) - 'a'];

        for(int i : fre){
            if(i != 0 && i != check) return false;
        }
        return true;
    }
}
