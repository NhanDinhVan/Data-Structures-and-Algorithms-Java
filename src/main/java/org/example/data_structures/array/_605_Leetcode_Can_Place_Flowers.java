package org.example.data_structures.array;

/**
 * _605_Leetcode_Can_Place_Flowers
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/27/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/27/2024    NhanDinhVan    Create
 */

public class _605_Leetcode_Can_Place_Flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;
        if(n==0) return true;

        if (l == 1) {
            if (flowerbed[0] == 0) n--;
            return n <= 0;
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n--;
        }

        for(int i = 1; i < l - 1; i++){
            if(flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1]==0){
                flowerbed[i] = 1;
                n--;
            }
            if (n <= 0) return true;
        }
        if(flowerbed[l-1] == 0 && flowerbed[l-2] == 0){
            flowerbed[n-1] = 1;
            n--;
        }
        return n<=0;
    }
}
