package org.example.data_structures.HashMap_HashSet;

import java.util.HashSet;

/**
 * _2351_Leetcode_First_Letter_to_Appear_Twice
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/13/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/13/2025    NhanDinhVan    Create
 */

public class _2351_Leetcode_First_Letter_to_Appear_Twice {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))) return s.charAt(i);
            set.add(s.charAt(i));
        }
        return 'c';
    }
}
