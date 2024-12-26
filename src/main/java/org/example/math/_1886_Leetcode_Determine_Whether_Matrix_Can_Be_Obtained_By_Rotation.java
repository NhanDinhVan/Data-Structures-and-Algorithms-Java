package org.example.math;

/**
 * _1886_Leetcode_Determine_Whether_Matrix_Can_Be_Obtained_By_Rotation
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/26/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/26/2024    NhanDinhVan    Create
 */

public class _1886_Leetcode_Determine_Whether_Matrix_Can_Be_Obtained_By_Rotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        for (int k = 0; k < 4; k++) {
            if (isSameMatrix(mat, target)) return true;
            mat = rotate90(mat);
        }

        return false;
    }
    private boolean isSameMatrix(int[][] mat1, int[][] mat2) {
        int n = mat1.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat1[i][j] != mat2[i][j]) return false;
            }
        }
        return true;
    }

    private int[][] rotate90(int[][] mat) {
        int n = mat.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = mat[i][j];
            }
        }
        return rotated;
    }
}
