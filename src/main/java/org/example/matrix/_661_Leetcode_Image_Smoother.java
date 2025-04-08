package org.example.matrix;

/**
 * _661_Leetcode_Image_Smoother
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/8/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/8/2025    NhanDinhVan    Create
 */

public class _661_Leetcode_Image_Smoother {
    public int[][] imageSmoother(int[][] img) {
        int[][] directions = new int[][]{
                {-1, 1}, {0, 1}, {1, 1},
                {-1, 0}, {0, 0}, {1, 0},
                {-1, -1}, {0, -1}, {1, -1}
        };
        int m = img.length;
        int n = img[0].length;
        int[][] ans = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int count = 0;
                int sum = 0;
                for(int d = 0; d < directions.length; d++){
                    int x = i + directions[d][0];
                    int y = j + directions[d][1];

                    if(x >= 0 && x < m && y >= 0 && y < n){
                        count++;
                        sum += img[x][y];
                    }
                }
                ans[i][j] = sum/count;
            }
        }
        return ans;
    }
}
