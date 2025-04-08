package org.example.data_structures.HashMap_HashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * _599_Leetcode_Minimum_Index_Sum_of_Two_Lists
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/8/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/8/2025    NhanDinhVan    Create
 */

public class _599_Leetcode_Minimum_Index_Sum_of_Two_Lists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> ans = new ArrayList<>();
        HashMap<String, Integer> m1 = new HashMap<>();

        for(int i = 0; i < list1.length; i++){
            m1.put(list1[i], i);
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list2.length; i++){
            if(m1.containsKey(list2[i])){
                if(m1.get(list2[i]) + i < min){
                    ans.clear();
                    ans.add(list2[i]);
                    min = m1.get(list2[i]) + i;
                }else if(m1.get(list2[i]) + i == min){
                    ans.add(list2[i]);
                }
            }

        }

        String[] res = new String[ans.size()];

        for(int i = 0; i < res.length; i++){
            res[i] = ans.get(i);
        }

        return res;
    }
}
