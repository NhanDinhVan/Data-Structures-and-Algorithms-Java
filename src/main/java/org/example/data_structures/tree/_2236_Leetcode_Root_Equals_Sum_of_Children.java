package org.example.data_structures.tree;

/**
 * _2236_Leetcode_Root_Equals_Sum_of_Children
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/23/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/23/2025    NhanDinhVan    Create
 */

public class _2236_Leetcode_Root_Equals_Sum_of_Children {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
