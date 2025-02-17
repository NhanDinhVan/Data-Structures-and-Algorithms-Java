package org.example.daily_challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * _1079_Leetcode_Letter_Tile_Possibilities
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/17/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/17/2025    NhanDinhVan    Create
 */

public class _1079_Leetcode_Letter_Tile_Possibilities {
    public int numTilePossibilities(String tiles) {
        Set<String> set = new HashSet<>();
        boolean[] used = new boolean[tiles.length()];

        backtracking(tiles, set, used, new StringBuilder());

        return set.size();
    }

    public void backtracking(String tiles, Set<String> set, boolean[] used, StringBuilder sb){
        if(sb.length() > 0) set.add(sb.toString());

        for(int i = 0; i < tiles.length(); i++){
            if(used[i]) continue;
            used[i] = true;

            sb.append(tiles.charAt(i));
            backtracking(tiles, set, used, sb);
            sb.deleteCharAt(sb.length() - 1);
            used[i] = false;
        }
    }
}
