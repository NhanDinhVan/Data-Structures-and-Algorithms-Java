package org.example.matrix;

/**
 * _289_Leetcode_Game_of_Life
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/1/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/1/2025    NhanDinhVan    Create
 */

public class _289_Leetcode_Game_of_Life {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] directions = {{0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0}, {-1, 1}};

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int cell = board[i][j];
                int live = 0;

                for(int k = 0; k < directions.length; k++){
                    int x = i + directions[k][0];
                    int y = j + directions[k][1];
                    if(x >= 0 && x < m && y >= 0 && y < n && Math.abs(board[x][y]) == 1){
                        live++;
                    }
                }

                if (board[i][j] == 1 || board[i][j] == -1) { // If the cell is currently live
                    // Rule: Live cell dies if it has fewer than 2 or more than 3 live neighbors
                    if (live < 2 || live > 3) {
                        board[i][j] = -1; // Mark as a cell that was live but will die
                    }
                } else { // If the cell is currently dead
                    // Rule: Dead cell becomes live if it has exactly 3 live neighbors
                    if (live == 3) {
                        board[i][j] = -2; // Mark as a cell that was dead but will become live
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == -1) { // If marked as live → dead
                    board[i][j] = 0; // Finalize as dead
                } else if (board[i][j] == -2) { // If marked as dead → live
                    board[i][j] = 1; // Finalize as live
                }
            }
        }
    }
}
