package org.example.math;

/**
 * _3232_Leetcode_Find_if_Digit_Game_Can_Be_Won
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/30/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/30/2025    NhanDinhVan    Create
 */

public class _3232_Leetcode_Find_if_Digit_Game_Can_Be_Won {
    public boolean canAliceWin(int[] nums) {
        int sg = 0;
        int db = 0;

        for(int n : nums){
            if(n > 9) db+=n;
            else sg+=n;
        }
        return sg!=db;
    }
}
