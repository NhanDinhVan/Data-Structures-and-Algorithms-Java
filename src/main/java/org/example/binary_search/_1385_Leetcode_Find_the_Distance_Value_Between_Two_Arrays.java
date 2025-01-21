package org.example.binary_search;

/**
 * _1385_Leetcode_Find_the_Distance_Value_Between_Two_Arrays
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/21/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/21/2025    NhanDinhVan    Create
 */

public class _1385_Leetcode_Find_the_Distance_Value_Between_Two_Arrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;

        for(int i = 0; i < arr1.length; i++){
            boolean check = true;
            for(int j = 0; j < arr2.length; j++){
                if(Math.abs(arr1[i] - arr2[j]) > d){
                    continue;
                }
                check = false;
                break;
            }
            if(check) count++;
        }
        return count;
    }
}
