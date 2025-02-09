package org.example.backtracking;

/**
 * _79_Leetcode_Word_Search
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/8/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/8/2025    NhanDinhVan    Create
 */

public class _79_Leetcode_Word_Search {
    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (backtrack(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean backtrack(char[][] board, String word, int index, int i, int j) {
        if (index == word.length()) return true;

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        // Đánh dấu ô hiện tại đã được sử dụng
        char temp = board[i][j];
        board[i][j] = '#';

        for (int[] dir : directions) {
            int x = i + dir[0];
            int y = j + dir[1];
            if (backtrack(board, word, index + 1, x, y)) {
                return true;
            }
        }

        // Khôi phục lại giá trị ô đã đánh dấu
        board[i][j] = temp;

        return false;
    }
}
