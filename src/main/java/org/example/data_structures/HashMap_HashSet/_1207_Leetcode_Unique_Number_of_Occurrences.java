package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * _1207_Leetcode_Unique_Number_of_Occurrences
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/28/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/28/2024    NhanDinhVan    Create
 */

public class _1207_Leetcode_Unique_Number_of_Occurrences {
    public boolean uniqueOccurrences(int[] arr) {
//        int[] countArr = new int[2000];
//        Set<Integer> set = new HashSet<>();
//        for(int i = 0; i < arr.length; i++){
//            countArr[arr[i]+1000]++;
//        }
//        int check = countArr[arr[0]+1000];
//        for(int i = 0; i < countArr.length; i++){
//            if(countArr[i] != 0 && set.contains(countArr[i])) return false;
//            set.add(countArr[i]);
//        }
//        return true;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int num: arr)
            map.put(num, map.getOrDefault(num, 0)+1);
        HashSet<Integer> set= new HashSet<>(map.values());
        if(map.size()==set.size()){
            return true;
        }
        return false;
    }
}
