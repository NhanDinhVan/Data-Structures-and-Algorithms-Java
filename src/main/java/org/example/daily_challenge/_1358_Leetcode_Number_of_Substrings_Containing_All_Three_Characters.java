package org.example.daily_challenge;

import java.util.HashMap;

/**
 * _1358_Leetcode_Number_of_Substrings_Containing_All_Three_Characters
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/11/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/11/2025    NhanDinhVan    Create
 */

public class _1358_Leetcode_Number_of_Substrings_Containing_All_Three_Characters {
    public int numberOfSubstrings(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int l = 0;

        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while(map.size() == 3){
                ans += (s.length() - r);
                char z = s.charAt(l);
                map.put(z, map.get(z) - 1);
                if(map.get(z) == 0) map.remove(z);
                l++;
            }
        }

        return ans;
    }
}
