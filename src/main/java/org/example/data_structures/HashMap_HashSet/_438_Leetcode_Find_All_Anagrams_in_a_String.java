package org.example.data_structures.HashMap_HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * _438_Leetcode_Find_All_Anagrams_in_a_String
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/3/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/3/24   NhanDinhVan    Create
 */
public class _438_Leetcode_Find_All_Anagrams_in_a_String {
//    public List<Integer> findAnagrams(String s, String p) {
//        ArrayList<Integer> res = new ArrayList<>();
//        StringBuilder c = new StringBuilder();
//        for(int i = 0; i <= s.length() - p.length(); i++){
//            c.setLength(0);
//            for(int j = i; j < i + p.length(); j++){
//                c.append(s.charAt(j));
//            }
//            if(compare(c.toString(), p)){
//                res.add(i);
//            }
//        }
//        return res;
//    }
//    public static boolean compare(String s, String t){
//         char[] sortedS = s.toCharArray();
//         Arrays.sort(sortedS);
//         char[] sortedT = t.toCharArray();
//         Arrays.sort(sortedT);
//         return Arrays.equals(sortedS, sortedT);
//    }
    public List<Integer> findAnagrams(String s, String p){
        List<Integer> res = new ArrayList<>();

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        if(s.length() < p.length()){
            return res;
        }
        for(char ch : p.toCharArray()){
            pCount[ch - 'a']++;
        }

        for(int i = 0; i < s.length(); i++){
            sCount[s.charAt(i) - 'a']++;
            if(i >= p.length()) {
                sCount[s.charAt(i - p.length()) - 'a']--;
            }
            if(matches(pCount, sCount)){
                res.add(i - p.length() + 1);
            }
        }
        return res;
    }
    public static boolean matches(int[] pCount, int[] sCount){
        for(int i = 0; i < 26; i++){
            if(pCount[i] != sCount[i])
                return false;
        }
        return true;
    }

}
