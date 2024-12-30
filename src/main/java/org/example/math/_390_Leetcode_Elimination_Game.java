package org.example.math;

/**
 * _390_Leetcode_Elimination_Game
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/30/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/30/2024    NhanDinhVan    Create
 */

public class _390_Leetcode_Elimination_Game {
    public int lastRemaining(int n) {
        int head = 1;
        int step = 1;
        int remaining = n;
        boolean leftToRight = true;

        while(remaining > 1){
            if(leftToRight || remaining % 2 == 1){
                head += step;
            }

            remaining /= 2;
            step *= 2;

            leftToRight = !leftToRight;
        }
        return head;
    }
}
