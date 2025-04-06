package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;

/**
 * _2283_Leetcode_Check_if_Number_Has_Equal_Digit_Count_and_Digit_Value
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/6/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/6/2025    NhanDinhVan    Create
 */

public class _2283_Leetcode_Check_if_Number_Has_Equal_Digit_Count_and_Digit_Value {
    public boolean digitCount(String num) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(char c : num.toCharArray()){
            map.put(c-'0', map.getOrDefault(c-'0', 0)+1);
        }

        for(int i = 0; i < num.length(); i++){
            if(map.getOrDefault(i, 0) != num.charAt(i) - '0') return false;
        }
        return true;
    }
}
