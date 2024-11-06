package org.example.math;

/**
 * _441_Leetcode_Arranging_Coins
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/6/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/6/2024    NhanDinhVan    Create
 */

public class _441_Leetcode_Arranging_Coins {
    public int arrangeCoins(int n) {
// Basic Solution:
//
//        int row = 1;
//        while(n >= row){
//            n -= row;
//            row++;
//        }
//        return row;
//
// Binary Search :
// n = 9
// 1    2   3   4   5   6   7   8   9
// l
//                                  r
//                  m
// totalCoins = (row*(row + 1))/2
// totalCoins <= n
// Coding solution:

        long l = 1;
        long r = n;
        long ans = 1;

        while(l <= r){
            long row = l + (r - l)/2;
            long coins = (row * (row+1))/2;
            if(coins <= n){
                l = row + 1;
                ans = row;
            }else{
                r = row-1;
            }
        }
        return (int) ans;
    }
}
