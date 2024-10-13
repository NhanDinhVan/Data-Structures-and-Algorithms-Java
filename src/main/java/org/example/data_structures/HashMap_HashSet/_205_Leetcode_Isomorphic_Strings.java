package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;

/**
 * _205_Leetcode_Isomorphic_Strings
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/13/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/13/2024    NhanDinhVan    Create
 */

public class _205_Leetcode_Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hmapS = new HashMap<>();
        HashMap<Character, Character> hmapT = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            Character charS = s.charAt(i);
            Character charT = t.charAt(i);
            if(hmapS.containsKey(charS)){
                if(!hmapS.get(charS).equals(charT))
                    return false;
            }else{
                hmapS.put(charS, charT);
            }
            if(hmapT.containsKey(charT)){
                if(!hmapT.get(charT).equals(charS))
                    return false;
            }else{
                hmapT.put(charT, charS);
            }
        }
        return true;
    }
}
