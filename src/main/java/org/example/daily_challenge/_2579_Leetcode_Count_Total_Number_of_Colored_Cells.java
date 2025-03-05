package org.example.daily_challenge;

/**
 * _2579_Leetcode_Count_Total_Number_of_Colored_Cells
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/5/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/5/2025    NhanDinhVan    Create
 */

public class _2579_Leetcode_Count_Total_Number_of_Colored_Cells {
    public long coloredCells(int n) {
        return (long) n * n + (long) (n - 1) * (n - 1);
    }
}
