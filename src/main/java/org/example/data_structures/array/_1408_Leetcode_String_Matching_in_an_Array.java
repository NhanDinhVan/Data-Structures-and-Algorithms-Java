package org.example.data_structures.array;

import java.util.ArrayList;
import java.util.List;

/**
 * _1408_Leetcode_String_Matching_in_an_Array
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/7/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/7/2025    NhanDinhVan    Create
 */

public class _1408_Leetcode_String_Matching_in_an_Array {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){
                if(j != i && words[j].contains(words[i])){
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
    }
}
