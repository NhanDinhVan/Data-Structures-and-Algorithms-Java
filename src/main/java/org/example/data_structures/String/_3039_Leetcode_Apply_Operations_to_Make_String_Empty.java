package org.example.data_structures.String;

import javafx.util.Pair;

import java.util.PriorityQueue;

/**
 * _3039_Leetcode_Apply_Operations_to_Make_String_Empty
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/8/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/8/2025    NhanDinhVan    Create
 */

public class _3039_Leetcode_Apply_Operations_to_Make_String_Empty {
    public String lastNonEmptyString(String s) {
        PriorityQueue<Pair<Character, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue()-b.getValue());
        StringBuilder ans = new StringBuilder();
        int[] countArr = new int[26];
        int[] idxArr = new int[26];
        int max = 0;

        for(int i = 0; i < s.length(); i++){
            countArr[s.charAt(i)-'a']++;
            idxArr[s.charAt(i)-'a'] = i;
        }

        for(int i : countArr)
            max = Math.max(max, i);

        for(int i = 0; i < 26; i++){
            if(countArr[i] == max)
                pq.add(new Pair<>((char) ('a' + i), idxArr[i]));
        }


        while (!pq.isEmpty())
            ans.append(pq.poll().getKey());

        return ans.toString();
    }
}
