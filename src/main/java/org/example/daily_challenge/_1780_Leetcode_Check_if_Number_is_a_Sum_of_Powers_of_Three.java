package org.example.daily_challenge;

/**
 * _1780_Leetcode_Check_if_Number_is_a_Sum_of_Powers_of_Three
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/4/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/4/2025    NhanDinhVan    Create
 */

public class _1780_Leetcode_Check_if_Number_is_a_Sum_of_Powers_of_Three {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) return false; // Nếu có số 2 trong hệ cơ số 3 => Không thể biểu diễn
            n /= 3;
        }
        return true;
    }
}
