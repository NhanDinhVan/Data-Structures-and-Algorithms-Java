package org.example.math;

import java.util.HashMap;

/**
 * _1399_Leetcode_Count_Largest_Group
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/25/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/25/2025    NhanDinhVan    Create
 */

public class _1399_Leetcode_Count_Largest_Group {
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> group = new HashMap<>();
        int max = 0;
        int count = 0;

        for(int i = 1; i <= n; i++){
            int num = i;
            int sum = 0;
            while(num > 0){
                sum += num%10;
                num = num/10;
            }
            group.put(sum, group.getOrDefault(sum, 0)+1);
            if(group.get(sum) > max){
                count = 1;
                max = group.get(sum);
            }else if (group.get(sum) == max){
                count++;
            }
        }

        return count;
    }
}
