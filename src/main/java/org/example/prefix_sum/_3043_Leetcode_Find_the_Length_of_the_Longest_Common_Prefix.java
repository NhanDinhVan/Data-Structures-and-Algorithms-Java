package org.example.prefix_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * _3043_Leetcode_Find_the_Length_of_the_Longest_Common_Prefix
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/8/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/8/2025    NhanDinhVan    Create
 */

public class _3043_Leetcode_Find_the_Length_of_the_Longest_Common_Prefix {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int max = 0;
        Map<String, Integer> prefixMap = new HashMap<>();

        // Lưu trữ tất cả các tiền tố của các phần tử trong arr1
        for (int num : arr1) {
            String s = String.valueOf(num);
            String prefix = "";
            for (int i = 0; i < s.length(); i++) {
                prefix += s.charAt(i);
                prefixMap.put(prefix, Math.max(prefixMap.getOrDefault(prefix, 0), s.length()));
            }
        }

        // Kiểm tra tiền tố chung trong arr2
        for (int num : arr2) {
            String s = String.valueOf(num);
            String prefix = "";
            for (int i = 0; i < s.length(); i++) {
                prefix += s.charAt(i);
                if (prefixMap.containsKey(prefix)) {
                    max = Math.max(max, i + 1); // i+1 là độ dài tiền tố
                }
            }
        }

        return max;
    }
}
