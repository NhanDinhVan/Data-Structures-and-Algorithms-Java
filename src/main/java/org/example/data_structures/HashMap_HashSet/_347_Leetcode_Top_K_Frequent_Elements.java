package org.example.data_structures.HashMap_HashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * _347_Leetcode_Top_K_Frequent_Elements
 * <p>
 * Version 1.0
 * <p>
 * Date:  8/15/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 8/15/24   NhanDinhVan    Create
 */
public class _347_Leetcode_Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hsmap = new HashMap<>();
        for(int num : nums){
            hsmap.put(num, hsmap.getOrDefault(num, 0)+1);
        }
        int maxCount;
        int max = 0;
        int[] result = new int[nums.length];
        int count = 0;
        while(k > 0){
            max = 0;
            maxCount = 0;
            for (Map.Entry<Integer, Integer> entry : hsmap.entrySet()) {
                if(entry.getValue()>maxCount){
                    maxCount = entry.getValue();
                    max = entry.getKey();
                }
            }
            result[count++] = max;
            hsmap.remove(max);
            k--;
        }
//        // Tạo một mảng int[] với kích thước bằng với ArrayList
//        int[] resultArray = new int[result.size()];
//
//        // Duyệt qua ArrayList và gán từng phần tử vào mảng
//        for (int i = 0; i < result.size(); i++) {
//            resultArray[i] = result.get(i);
//        }
        int[] finalResult = new int[count+1];
        for(int i = 0; i < count; i++){
            finalResult[i] = result[i];
        }
        return finalResult ;



    }
}
