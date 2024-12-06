package org.example.dynamic_programing;

import java.util.HashMap;

/**
 * _1025_Leetcode_Divisor_Game
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/6/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/6/2024    NhanDinhVan    Create
 */

public class _1025_Leetcode_Divisor_Game {
    HashMap<Integer, Boolean> memo = new HashMap<>();
    public boolean divisorGame(int n) {
        int a = 0;
        int b = 0;
        int turn = 1;
        while (n >= 0){
            if(turn == 1){
                a++;
                turn=2;
            }else{
                turn=1;
                b++;
            }
            n=n-1;
        }
        return a > b;
    }

//    public boolean backtracking(int n){
//        if(n == 1){
//            return
//        }
//        if(memo.containsKey(n)){
//            return memo.get(n);
//        }
//
//    }
}
