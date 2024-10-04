package org.example.data_structures.array;

import java.util.HashMap;

/**
 * _2491_LeetcodeDivide_Players_Into_Teams_of_Equal_Skill
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/4/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/4/24   NhanDinhVan    Create
 */
public class _2491_Leetcode_Divide_Players_Into_Teams_of_Equal_Skill {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        if(n%2 != 0) return -1;
        if(n == 2) return skill[0] * skill[1];

        int target = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        long result = 0;
        for(int i : skill){
            target+=i;
        }

        target = target/(n/2);

        for(int i = 0; i < n; i++){
            hmap.put(skill[i], hmap.getOrDefault(skill[i], 0)+1 );
        }
        for(int i = 0; i < n; i++){
            if(hmap.get(skill[i]) != 0){
                hmap.put(skill[i], hmap.get(skill[i])-1);
                if(!hmap.containsKey(target-skill[i]) || hmap.get(target-skill[i]) == 0)
                    return -1;
                if(hmap.get(target - skill[i]) != 0){
                    hmap.put(target - skill[i], hmap.get(target - skill[i])-1);
                    result+= skill[i] * (target - skill[i]);
                }
            }
        }
        return result;
    }
}
