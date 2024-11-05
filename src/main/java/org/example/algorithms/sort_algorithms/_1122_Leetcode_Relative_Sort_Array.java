package org.example.algorithms.sort_algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/**
 * _1122_Leetcode_Relative_Sort_Array
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/5/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/5/2024    NhanDinhVan    Create
 */

public class _1122_Leetcode_Relative_Sort_Array {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> head = new ArrayList<>();
        PriorityQueue<Integer> tail = new PriorityQueue<>();
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr1.length; j++){
                hmap.put(arr2[i], 0);
                if(arr2[i] == arr1[j]){
                    head.add(arr1[j]);
                }
            }
        }

        for(int i = 0; i < arr1.length; i++){
            if(!hmap.containsKey(arr1[i]))
                tail.add(arr1[i]);
        }

        while (!tail.isEmpty()){
            head.add(tail.poll());
        }

        int[] result = new int[head.size()];
        for (int i = 0; i < head.size(); i++) {
            result[i] = head.get(i);
        }

        return result;
    }
}
