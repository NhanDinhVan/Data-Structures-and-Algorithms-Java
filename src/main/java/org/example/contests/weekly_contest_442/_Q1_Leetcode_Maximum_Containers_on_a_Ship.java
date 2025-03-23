package org.example.contests.weekly_contest_442;

/**
 * _Q1_Leetcode_Maximum_Containers_on_a_Ship
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/23/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/23/2025    NhanDinhVan    Create
 */

public class _Q1_Leetcode_Maximum_Containers_on_a_Ship {
    public int maxContainers(int n, int w, int maxWeight) {
        int totalSpaces = n * n;

        int maxByWeight = maxWeight / w;

        return Math.min(totalSpaces, maxByWeight);
    }
}
