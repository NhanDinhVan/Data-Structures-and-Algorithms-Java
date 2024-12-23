package org.example.data_structures.HashMap_HashSet;

import java.util.HashSet;

/**
 * _2103_Leetcode_Rings_and_Rods
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/23/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/23/2024    NhanDinhVan    Create
 */

public class _2103_Leetcode_Rings_and_Rods {
    public int countPoints(String rings) {
        int n = rings.length();
        if(n<6) return 0;
        int count = 0;
        HashSet<Integer> R = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();
        HashSet<Integer> G = new HashSet<>();

        for(int i = 0; i < n; i+=2){
            char c = rings.charAt(i);
            int k = rings.charAt(i+1) - '0';
            if(c == 'R') R.add(k);
            else if(c == 'B') B.add(k);
            else if(c == 'G') G.add(k);
        }

        for (int rod : R) {
            if (B.contains(rod) && G.contains(rod)) {
                count++;
            }
        }
        return count;
    }
}
