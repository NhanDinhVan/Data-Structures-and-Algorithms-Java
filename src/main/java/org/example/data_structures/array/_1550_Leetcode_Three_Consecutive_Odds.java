package org.example.data_structures.array;

/**
 * _1550_Leetcode_Three_Consecutive_Odds
 * <p>
 * Version 1.0
 * <p>
 * Date:  5/11/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 5/11/2025    NhanDinhVan    Create
 */

public class _1550_Leetcode_Three_Consecutive_Odds {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 0; i < arr.length - 2; i++){
            if(arr[i] % 2 == 1 && arr[i+1] % 2 == 1 && arr[i+2] % 2 == 1){
                return true;
            }
        }
        return false;
    }
}
