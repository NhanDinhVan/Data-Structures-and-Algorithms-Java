package org.example.data_structures.HashMap_HashSet;

import java.util.*;

/**
 * _1331_Leetcode_Rank_Transform_of_an_Array
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/30/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/30/24   NhanDinhVan    Create
 */
public class _1331_Leetcode_Rank_Transform_of_an_Array {
    public int[] arrayRankTransform(int[] arr) {
        // two loop
//        int count = 0;
//        Set<Integer> hset = new HashSet<>();
//        List<Integer> results = new ArrayList<>();
//        for(int i = 0; i < arr.length; i++){
//            hset.clear();
//            count = 1;
//            for(int j = 0; j < arr.length; j++){
//                if(!hset.contains(arr[j])){
//                    if(arr[j] < arr[i]){
//                        count++;
//                        hset.add(arr[j]);
//                    }
//                }
//            }
//            results.add(count);
//        }
//        return results.stream().mapToInt(Integer::intValue).toArray();
        if(arr.length == 1){
            arr[0] = 1;
            return arr;
        }
        if(arr.length == 0)
            return arr;

        HashMap<Integer, Integer> hmap = new HashMap<>();
        int count = 1;
        int[] results = new int[arr.length];
        for(int i = 0; i < results.length; i++){
            results[i] = arr[i];
        }
        Arrays.sort(arr);
        hmap.put(arr[0], count);
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i - 1]){
                count++;
                hmap.put(arr[i],count);
            }
        }
        for(int i = 0; i < results.length; i++){
            results[i] = hmap.get(results[i]);
        }
        return results;
    }
}
