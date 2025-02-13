package org.example.data_structures.HashMap_HashSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * _2007_Leetcode_Find_Original_Array_From_Doubled_Array
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/12/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/12/2025    NhanDinhVan    Create
 */

public class _2007_Leetcode_Find_Original_Array_From_Doubled_Array {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) return new int[]{};

        Map<Integer, Integer> map = new HashMap<>();
        int[] origin = new int[n / 2];
        int i = 0;

        Arrays.sort(changed);

        for (int num : changed) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : changed) {
            if (map.get(num) == 0) continue; // Đã dùng hết số này

            if (map.getOrDefault(num * 2, 0) == 0) return new int[]{}; // Không có cặp hợp lệ

            if(i >= n/2) return new int[]{};
            origin[i++] = num; // Thêm vào kết quả

            map.put(num, map.get(num) - 1);
            map.put(num * 2, map.get(num * 2) - 1);
        }

        return origin;
    }
}
