package org.example.binary_search;

import java.util.HashSet;

/**
 * _888_Leetcode_Fair_Candy_Swap
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

public class _888_Leetcode_Fair_Candy_Swap {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
//        int aliceSum = 0;
//        int bobSum = 0;
//
//        for(int i : aliceSizes) aliceSum += i;
//        for(int i : bobSizes) bobSum += i;
//
//        for(int i = 0; i < aliceSizes.length; i++){
//            for (int j = 0; j < bobSizes.length; j++){
//                if(aliceSum - aliceSizes[i] + bobSizes[j] == (aliceSum + bobSum)/2)
//                    return new int[] {aliceSizes[i], bobSizes[j]};
//            }
//        }
//        return new int[] {};

        int aliceSum = 0, bobSum = 0;

        for (int a : aliceSizes) aliceSum += a;
        for (int b : bobSizes) bobSum += b;

        int delta = (bobSum - aliceSum) / 2; // Số chênh lệch cần bù

        HashSet<Integer> bobSet = new HashSet<>();
        for (int b : bobSizes) bobSet.add(b);

        for (int a : aliceSizes) {
            if (bobSet.contains(a + delta)) {
                return new int[] {a, a + delta};
            }
        }

        return new int[] {};
    }
}
