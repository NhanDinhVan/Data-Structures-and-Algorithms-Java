package org.example.daily_challenge;

/**
 * _2698_Leetcode_Find_the_Punishment_Number_of_an_Integer
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/15/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/15/2025    NhanDinhVan    Create
 */

public class _2698_Leetcode_Find_the_Punishment_Number_of_an_Integer {
    public int punishmentNumber(int n) {
        int ans = 0;
        for(int i = 1; i <= n; i++){
            int square = i * i;
            if(canPatrition(String.valueOf(square), 0, 0, i)) ans += square;
        }
        return ans;
    }

    public static boolean canPatrition(String s, int index, int sum, int target){
        if(index == s.length()) return sum == target;

        int num = 0;
        for(int i = index; i < s.length(); i++){
            num = num * 10 + (s.charAt(i) - '0');

            if(num + sum > target) break;

            if(canPatrition(s, i + 1, num + sum, target)) return true;
        }

        return false;
    }
}
