package org.example.dynamic_programing;

import java.util.ArrayList;
import java.util.List;

/**
 * _119_Leetcode_Pascals_Triangle_II
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/9/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/9/2024    NhanDinhVan    Create
 */

public class _119_Leetcode_Pascals_Triangle_II {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0) return new ArrayList<>(List.of(1));
        if(rowIndex == 1) return new ArrayList<>(List.of(1,1));

        List<Integer> ans = new ArrayList<>(List.of(1, 2, 1));;
        if(rowIndex == 2) return ans;

        for (int i = 3; i <= rowIndex; i++) {
            List<Integer> nextRow = new ArrayList<>();
            nextRow.add(1);
            for (int l = 0, r = 1; r < ans.size(); l++, r++) {
                nextRow.add(ans.get(l) + ans.get(r));
            }
            nextRow.add(1);
            ans = nextRow;
        }
       return ans;
    }
}