package org.example.matrix;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * _542_Leetcode_01_Matrix
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/20/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/20/2025    NhanDinhVan    Create
 */

public class _542_Leetcode_01_Matrix {
    Map<Pair<Integer, Integer>, Integer> map = new HashMap<>();
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 0){
                    queue.offer(new int[] {i, j});
                }else{
                    mat[i][j] = Integer.MAX_VALUE;
                }
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

                if(nx >= 0 && nx < m && ny >= 0 && ny < n && mat[nx][ny] > mat[x][y]+1){
                    mat[nx][ny] = mat[x][y]+1;
                    queue.offer(new int[] {nx, ny});
                }
            }
        }
        return mat;
    }
}
