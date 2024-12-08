package org.example.data_structures.HashMap_HashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * _12_Leetcode_Integer_to_Roman
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/8/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/8/2024    NhanDinhVan    Create
 */

public class _12_Leetcode_Integer_to_Roman {
    public String intToRoman(int num) {
        String[] symbols = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < values.length; i++){
            if(num == 0) break;
            while(num >= values[i]){
                ans.append(symbols[i]);
                num -= values[i];
            }
        }
        return ans.toString();
    }
}
