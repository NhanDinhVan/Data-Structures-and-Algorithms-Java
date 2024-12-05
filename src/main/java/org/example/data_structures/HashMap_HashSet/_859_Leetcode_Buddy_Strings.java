package org.example.data_structures.HashMap_HashSet;

import java.util.*;

/**
 * _859_Leetcode_Buddy_Strings
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/5/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/5/2024    NhanDinhVan    Create
 */

public class _859_Leetcode_Buddy_Strings {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;

        if(s.equals(goal)){
            Set<Character> set = new HashSet<>();
            for(char c : s.toCharArray())
                if(!set.add(c)) return true;
            return false;
        }
        List<Integer> tmp = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != goal.charAt(i))
                tmp.add(i);
            if (tmp.size()>2) return false;
        }

        return tmp.size()==2 &&
                s.charAt(tmp.get(0)) == goal.charAt(tmp.get(1)) &&
                goal.charAt(tmp.get(0)) == s.charAt(tmp.get(1));
    }
}
