package org.example.data_structures.array;

import java.util.HashMap;
import java.util.Stack;

/**
 * _1346_Leetcode_Check_If_N_and_Its_Double_Exist
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/17/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/17/2024    NhanDinhVan    Create
 */

public class _1346_Leetcode_Check_If_N_and_Its_Double_Exist {
    public boolean checkIfExist(int[] arr) {
//        for(int i = 0; i < arr.length - 1; i++){
//            for(int j = i + 1;j < arr.length; j++){
//                if(arr[i] == 2*arr[j] || arr[i]*2 == arr[j])
//                    return true;
//            }
//        }
//        return false;

        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(hmap.containsKey(arr[i]*2) || (arr[i] % 2 == 0 && hmap.containsKey(arr[i]/2)))
                return true;
            hmap.put(arr[i], i);
        }
        return false;
    }
}
