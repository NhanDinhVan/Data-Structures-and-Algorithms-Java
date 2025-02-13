package org.example.data_structures.HashMap_HashSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * _954_Leetcode_Array_of_Doubled_Pairs
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/13/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/13/2025    NhanDinhVan    Create
 */

public class _954_Leetcode_Array_of_Doubled_Pairs {
    public static boolean canReorderDoubled(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();

            Arrays.sort(arr);

            for(int n : arr){
                map.put(n, map.getOrDefault(n, 0)+1);
            }

            for(int n : arr){
                if(map.get(n) == 0) continue;
                if(n < 0 && n % 2 != 0) return false;

                int x = (n > 0) ? n * 2 : n / 2;

                if(map.getOrDefault(x, 0) == 0) return false;

                map.put(n, map.get(n) - 1);
                map.put(x, map.get(x) - 1);
            }
            return true;
    }
}
