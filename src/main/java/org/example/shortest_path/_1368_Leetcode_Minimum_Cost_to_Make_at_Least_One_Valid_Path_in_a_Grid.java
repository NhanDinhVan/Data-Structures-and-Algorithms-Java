package org.example.shortest_path;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * _1368_Leetcode_Minimum_Cost_to_Make_at_Least_One_Valid_Path_in_a_Grid
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/19/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/19/2025    NhanDinhVan    Create
 */

public class _1368_Leetcode_Minimum_Cost_to_Make_at_Least_One_Valid_Path_in_a_Grid {
    public int minCost(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; // phải, trái, xuống, lên
        int[][] cost = new int[m][n];
        for (int[] row : cost) Arrays.fill(row, Integer.MAX_VALUE); // Gán chi phí ban đầu là vô cùng

        Deque<int[]> deque = new ArrayDeque<>();
        deque.add(new int[]{0, 0, 0}); // {x, y, cost}
        cost[0][0] = 0;

        while (!deque.isEmpty()) {
            int[] cur = deque.poll();
            int x = cur[0], y = cur[1], curCost = cur[2];

            // Nếu đến đích thì dừng
            if (x == m - 1 && y == n - 1) return curCost;

            for (int i = 0; i < 4; i++) {
                int nx = x + directions[i][0];
                int ny = y + directions[i][1];
                int newCost = curCost + (grid[x][y] == i + 1 ? 0 : 1);

                if (nx >= 0 && nx < m && ny >= 0 && ny < n && newCost < cost[nx][ny]) {
                    cost[nx][ny] = newCost;

                    // Nếu chi phí là 0 -> thêm vào đầu hàng đợi
                    if (grid[x][y] == i + 1) {
                        deque.addFirst(new int[]{nx, ny, newCost});
                    } else {
                        deque.addLast(new int[]{nx, ny, newCost});
                    }
                }
            }
        }

        return -1; // Không thể tới đích
    }
}
