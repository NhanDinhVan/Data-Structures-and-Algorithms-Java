package org.example.data_structures.String;

import java.util.ArrayList;
import java.util.List;

/**
 * _476_Leetcode_Number_Complement
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/3/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/3/2024    NhanDinhVan    Create
 */

public class _476_Leetcode_Number_Complement {
    public int findComplement(int num) {
        List<Integer> asc = new ArrayList<>();
        while (num != 0){
            asc.add(num % 2);
            num = num / 2;
        }

        for(int i = 0; i < asc.size(); i++){
            num += Math.pow(2, i) * (1 - asc.get(i));
        }
        return num;
    }
}
