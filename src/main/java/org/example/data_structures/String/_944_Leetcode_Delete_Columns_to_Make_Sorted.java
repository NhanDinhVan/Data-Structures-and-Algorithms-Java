package org.example.data_structures.String;

/**
 * _944_Leetcode_Delete_Columns_to_Make_Sorted
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

public class _944_Leetcode_Delete_Columns_to_Make_Sorted {
    public int minDeletionSize(String[] strs) {
        int ans = 0;
        int row = strs.length;
        int col = strs[0].length();

        for(int i = 0; i < col; i++){
            for(int j = 0; j < row-1; j++){
                if(strs[j].charAt(i) > strs[j+1].charAt(i)){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
