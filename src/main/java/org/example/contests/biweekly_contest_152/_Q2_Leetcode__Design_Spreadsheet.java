package org.example.contests.biweekly_contest_152;

/**
 * _Q2_Leetcode__Design_Spreadsheet
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/15/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/15/2025    NhanDinhVan    Create
 */

public class _Q2_Leetcode__Design_Spreadsheet {
    private int[][] grid;
    private int rows;

    public _Q2_Leetcode__Design_Spreadsheet(int rows) {
        this.rows = rows;
        this.grid = new int[rows][26];
    }

    public void setCell(String cell, int value) {
        int col = cell.charAt(0) - 'A';
        int row = Integer.parseInt(cell.substring(1)) - 1;
        grid[row][col] = value;
    }

    public void resetCell(String cell) {
        int col = cell.charAt(0) - 'A';
        int row = Integer.parseInt(cell.substring(1)) - 1;
        grid[row][col] = 0;
    }

    public int getValue(String formula) {
        String expr = formula.substring(1);
        int plusIndex = expr.indexOf('+');
        String x = expr.substring(0, plusIndex);
        String y = expr.substring(plusIndex + 1);

        int valX = isCellReference(x) ? getCellValue(x) : Integer.parseInt(x);
        int valY = isCellReference(y) ? getCellValue(y) : Integer.parseInt(y);

        return valX + valY;
    }

    private boolean isCellReference(String s) {
        return s.length() >= 2 && s.charAt(0) >= 'A' && s.charAt(0) <= 'Z';
    }

    private int getCellValue(String cell) {
        int col = cell.charAt(0) - 'A';
        int row = Integer.parseInt(cell.substring(1)) - 1;
        return grid[row][col];
    }
}
/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */
