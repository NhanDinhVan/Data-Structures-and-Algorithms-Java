package org.example.daily_challenge;

import java.util.LinkedList;
import java.util.Queue;

/**
 * _1765_Leetcode_Map_of_Highest_Peak
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/22/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/22/2025    NhanDinhVan    Create
 */

public class _1765_Leetcode_Map_of_Highest_Peak {
    public int[][] highestPeak(int[][] isWater) {
//        int m = isWater.length;
//        int n = isWater[0].length;
//
//        for(int i = 0; i < m; i++){
//            for(int j = 0; j < n; j++){
//                isWater[i][j] = (isWater[i][j] == 0) ? 1 : 0;
//            }
//        }
//
//        for(int i = 0; i < m; i++){
//            for(int j = 0; j < n; j++){
//                if(isWater[i][j] == 0) continue;
//                int min = Integer.MAX_VALUE;
//                if(i > 0) min = Math.min(min, isWater[i - 1][j]);
//                if(j < n - 1) min = Math.min(min, isWater[i][j+1]);
//                if(j > 0) min = Math.min(min, isWater[i][j-1]);
//                if(i < m - 1) min = Math.min(min, isWater[i+1][j]);
//
//                isWater[i][j] = min + 1;
//            }
//        }
//        return isWater;

        int m = isWater.length;
        int n = isWater[0].length;
        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(isWater[i][j] == 1){
                    queue.offer(new int[] {i, j});
                    isWater[i][j] = 0;
                    continue;
                }
                isWater[i][j] = -1;
            }
        }

        int[][] directions = new int[][] {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        while(!queue.isEmpty()){
            int[] cell = queue.poll();
            int x = cell[0];
            int y = cell[1];

            for(int i = 0; i < directions.length; i++){
                int nx = x + directions[i][0];
                int ny = y + directions[i][1];

                if(nx >= 0 && nx < m && ny >= 0 && ny < n && isWater[nx][ny] == -1){
                    isWater[nx][ny] = isWater[x][y] + 1;
                    queue.offer(new int[] {nx, ny});
                }
            }
        }
        return isWater;
    }
}
