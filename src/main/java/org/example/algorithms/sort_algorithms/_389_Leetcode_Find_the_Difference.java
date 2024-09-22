package org.example.algorithms.sort_algorithms;

import java.util.Arrays;

/**
 * _389_Leetcode_Find_the_Difference
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/22/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/22/24   NhanDinhVan    Create
 */
public class _389_Leetcode_Find_the_Difference {
    public char findTheDifference(String s, String t) {
//        char[] sArray = s.toCharArray();
//        Arrays.sort(sArray);
//
//        char[] tArray = t.toCharArray();
//        Arrays.sort(tArray);
//        int i = 0;
//        int j = 0;
//        while(i < sArray.length || j < tArray.length){
//            if(i == sArray.length)
//                return tArray[j];
//            if(sArray[i] != tArray[j])
//                return tArray[j];
//            i++; j++;
//        }
//        return 't';

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != tArray[i]) {
                return tArray[i];
            }
        }

        return tArray[tArray.length - 1];
    }
//    public String quickSort(String s, int l, int r){
//
//    }
//    public int partition(String s, int l, int r, int key){
//
//    }
}
