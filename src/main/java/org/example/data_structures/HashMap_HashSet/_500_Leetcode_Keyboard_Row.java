package org.example.data_structures.HashMap_HashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * _500_Leetcode_Keyboard_Row
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/20/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/20/2024    NhanDinhVan    Create
 */

public class _500_Leetcode_Keyboard_Row {
    public String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        List<String> result = new ArrayList<>();
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i = 0; i < firstRow.length(); i++){
            hmap.put(firstRow.charAt(i), 1);
            hmap.put(Character.toUpperCase(firstRow.charAt(i)), 1);
        }
        for(int i = 0; i < secondRow.length(); i++){
            hmap.put(secondRow.charAt(i), 2);
            hmap.put(Character.toUpperCase(secondRow.charAt(i)), 2);
        }
        for(int i = 0; i < thirdRow.length(); i++){
            hmap.put(thirdRow.charAt(i), 3);
            hmap.put(Character.toUpperCase(thirdRow.charAt(i)), 3);
        }

        for(int i = 0; i < words.length; i++){
            boolean check = true;
            for(int j = 0; j < words[i].length() - 1; j++){
                if(hmap.get(words[i].charAt(j)) != hmap.get(words[i].charAt(j+1))) {
                    check = false;
                    break;
                }
            }
            if(check)
                result.add(words[i]);
        }
        return result.toArray(new String[0]);
    }
}
