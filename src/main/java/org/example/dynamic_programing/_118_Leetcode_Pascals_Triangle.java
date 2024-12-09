package org.example.dynamic_programing;

import java.util.ArrayList;
import java.util.List;

/**
 * _118_Leetcode_Pascals_Triangle
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

public class _118_Leetcode_Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            if(i == 1){
                ans.add(List.of(1));
                continue;
            }
            if(i == 2){
                ans.add(List.of(1,1));
                continue;
            }
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            List<Integer> pre = ans.get(i-2);
            for(int l = 0, r = 1; r < i - 1; l++, r++){
                tmp.add(pre.get(l)+pre.get(r));
            }
            tmp.add(1);
            ans.add(tmp);
        }
        return ans;
    }
}
