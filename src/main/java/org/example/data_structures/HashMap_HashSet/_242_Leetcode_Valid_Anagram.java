package org.example.data_structures.HashMap_HashSet;

import java.util.Arrays;
import java.util.HashMap;

/**
 * _242_Leetcode_Valid_Anagram
 * <p>
 * Version 1.0
 * <p>
 * Date:  8/10/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 8/10/24   NhanDinhVan    Create
 */
public class _242_Leetcode_Valid_Anagram {

//      Solution 1
//
//    public static boolean isAnagram(String s, String t) {
//        if(s.length() != t.length())
//            return false;
//        String sortedS = sortString(s);
//        String sortedT = sortString(t);
//        System.out.println(sortedS);
//        System.out.println(sortedT);
//        return sortedS.equals(sortedT);
//    }
//    public static String sortString(String s)
//    {
//        char[] c = s.toCharArray();
//        Arrays.sort(c);
//        return new String(c);
//    }

//      Solotion 2 ()
//
//    public static boolean isAnagram(String s, String t) {
//        HashMap<Character, Integer> hmap1 = new HashMap<>();
//        HashMap<Character, Integer> hmap2 = new HashMap<>();
//        for(int i = 0; i < s.length(); i++)
//        {
//            char c = s.charAt(i);
//            hmap1.put(c, hmap1.getOrDefault(c, 0) + 1);
//        }
//        for(int i = 0; i < t.length(); i++)
//        {
//            char c = t.charAt(i);
//            hmap2.put(c, hmap2.getOrDefault(c, 0) + 1);
//        }
//        return hmap1.equals(hmap2);
//    }
//
//      Solution 3

//    public boolean isAnagram(String s, String t) {
//
//        int[] arr = new int[26];
//
//        for(char c : s.toCharArray()) {
//            arr[c-97]++;
//        }
//
//        for(char c : t.toCharArray()) {
//            arr[c-97]--;
//        }
//
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] != 0) {
//                return false;
//            }
//        }
//
//        return true;

//  Solution 4
    public boolean isAnagram(String s, String t){
        char[] charS = s.toCharArray();
        Arrays.sort(charS);
        char[] charT = t.toCharArray();
        Arrays.sort(charT);
        System.out.println(charS);
        System.out.println(charT);
        return charT == charS;
    }

}
