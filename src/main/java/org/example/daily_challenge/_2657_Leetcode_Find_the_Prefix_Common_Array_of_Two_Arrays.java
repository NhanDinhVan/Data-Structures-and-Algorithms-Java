package org.example.daily_challenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * _2657_Leetcode_Find_the_Prefix_Common_Array_of_Two_Arrays
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/14/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/14/2025    NhanDinhVan    Create
 */

public class _2657_Leetcode_Find_the_Prefix_Common_Array_of_Two_Arrays {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
//        int n = A.length;
//        int[] C = new int[n];
//        int prefix;
//        Set<Integer> set = new HashSet<>();
//
//        for(int i = 0; i < n; i++){
//            prefix = 0;
//            set.add(A[i]);
//            for(int b = 0; b <= i; b++){
//                if(set.contains(B[b])) prefix++;
//            }
//            C[i] = prefix;
//        }
//        return C;

        Set<Integer> s = new HashSet<>();
        Set<Integer> sb = new HashSet<>();
        int n = A.length;
        int cnt = 0;
        int[] ans = new int[n];
        for(int i = 0; i<n; i++){
            if(!s.contains(A[i])){
                s.add(A[i]);
                if(sb.contains(A[i]))
                    cnt++;
            }

            if(!sb.contains(B[i])){
                sb.add(B[i]);
                if(s.contains(B[i]))
                    cnt++;

            }
            ans[i]=cnt;

        }
        return ans;
    }

}
