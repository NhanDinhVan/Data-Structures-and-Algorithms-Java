package org.example.matrix;

/**
 * _733_Leetcode_Flood_Fill
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/16/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/16/2025    NhanDinhVan    Create
 */

public class _733_Leetcode_Flood_Fill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;

        dfs(image, color, sr, sc, image[sr][sc]);
        return image;
    }
    public void dfs(int[][] image, int color, int r, int c, int orgColor){
        if(image[r][c] != orgColor) return;
        image[r][c] = color;
        if(r > 0) dfs(image, color, r - 1, c, orgColor);
        if(r < image.length - 1) dfs(image, color, r + 1, c, orgColor);
        if(c > 0) dfs(image, color, r, c - 1, orgColor);
        if(c < image[r].length - 1) dfs(image, color, r, c + 1, orgColor);
    }
}
