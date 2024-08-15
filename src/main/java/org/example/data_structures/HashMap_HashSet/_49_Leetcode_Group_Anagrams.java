package org.example.data_structures.HashMap_HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * _49_Leetcode_Group_Anagrams
 * <p>
 * Version 1.0
 * <p>
 * Date:  8/15/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 8/15/24   NhanDinhVan    Create
 */
public class _49_Leetcode_Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hsmap = new HashMap<>();
        String sortedString = null;
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            sortedString = new String(chars);
//            sortedString = chars.toString();

            if(!hsmap.containsKey(sortedString)){
                hsmap.put(sortedString, new ArrayList<>());
            }
            hsmap.get(sortedString).add(str);
        }
        return new ArrayList<>(hsmap.values());
    }
}
