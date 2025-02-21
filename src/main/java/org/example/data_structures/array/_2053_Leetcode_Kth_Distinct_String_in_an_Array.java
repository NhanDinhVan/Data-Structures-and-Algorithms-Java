package org.example.data_structures.array;

import java.util.HashMap;

/**
 * _2053_Leetcode_Kth_Distinct_String_in_an_Array
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/21/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/21/2025    NhanDinhVan    Create
 */

public class _2053_Leetcode_Kth_Distinct_String_in_an_Array {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> dict = new HashMap<>();
        int[] freq = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            dict.put(arr[i], dict.getOrDefault(arr[i], 0) + 1);
        }

        for(int i = 0; i < arr.length; i++){
            if(dict.containsKey(arr[i])){
                freq[i] = dict.get(arr[i]);
                dict.remove(dict.get(arr[i]));
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(freq[i] != 0){
                k--;
            }

            if(k == 0) return arr[i];
        }

        return "";
    }
}
