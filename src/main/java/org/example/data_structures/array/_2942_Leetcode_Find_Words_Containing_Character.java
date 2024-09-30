package org.example.data_structures.array;

import java.util.ArrayList;
import java.util.List;

/**
 * _2942_Leetcode_Find_Words_Containing_Character
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/30/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/30/24   NhanDinhVan    Create
 */
public class _2942_Leetcode_Find_Words_Containing_Character {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            String w = words[i];
            for(int j = 0; j < w.length(); j++){
                if(w.charAt(j) == x){
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }
}
