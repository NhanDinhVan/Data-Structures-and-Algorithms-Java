package org.example.data_structures.String;

import java.util.Arrays;

/**
 * _2000_Leetcode_Reverse_Prefix_of_Word
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/28/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/28/2025    NhanDinhVan    Create
 */

public class _2000_Leetcode_Reverse_Prefix_of_Word {
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ch){
                int l = 0, r = i;
                while(l < r){
                    char tmp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = tmp;
                    l++; r--;
                }
                break;
            }
        }

        StringBuilder ans = new StringBuilder();

        for(char c : arr){
            ans.append(c);
        }
        return ans.toString();
    }
}
