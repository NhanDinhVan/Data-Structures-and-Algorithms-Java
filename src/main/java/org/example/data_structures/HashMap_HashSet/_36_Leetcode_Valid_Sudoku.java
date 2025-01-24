package org.example.data_structures.HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * _36_Leetcode_Valid_Sudoku
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/24/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/24/2025    NhanDinhVan    Create
 */

public class _36_Leetcode_Valid_Sudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[][] cellSetArr = new HashSet[3][3];
        Set<Character>[] rowSetArr = new HashSet[9];
        Set<Character>[] colSetArr = new HashSet[9];
        int m = board.length;
        int n = board[0].length;

        // Khởi tạo từng Set trong mảng
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cellSetArr[i][j] = new HashSet<>();
            }
        }
        for (int i = 0; i < 9; i++) {
            rowSetArr[i] = new HashSet<>();
            colSetArr[i] = new HashSet<>();
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                char c = board[i][j];
                if(c == '.') continue;
                // get 9-cell position
                int x = i/3;
                int y = j/3;
                if(cellSetArr[x][y].contains(c) || rowSetArr[i].contains(c) || colSetArr[j].contains(c))
                    return false;
                cellSetArr[x][y].add(c);
                rowSetArr[i].add(c);
                colSetArr[j].add(c);
            }
        }
        return true;
    }


}
