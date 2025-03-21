package org.example.daily_challenge;

import java.util.*;

/**
 * _2115_Leetcode_Find_All_Possible_Recipes_from_Given_Supplies
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/21/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/21/2025    NhanDinhVan    Create
 */

public class _2115_Leetcode_Find_All_Possible_Recipes_from_Given_Supplies {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Set<String> sup = new HashSet<>(Arrays.asList(supplies));
        Set<String> added = new HashSet<>();
        List<String> ans = new ArrayList<>();
        boolean changed = true;

        while (changed) {
            changed = false;
            for (int i = 0; i < recipes.length; i++) {
                if (!added.contains(recipes[i])) {
                    boolean canMake = true;
                    for (String ing : ingredients.get(i)) {
                        if (!sup.contains(ing)) {
                            canMake = false;
                            break;
                        }
                    }
                    if (canMake) {
                        sup.add(recipes[i]);
                        ans.add(recipes[i]);
                        added.add(recipes[i]);
                        changed = true;
                    }
                }
            }
        }
        return ans;
    }
}
