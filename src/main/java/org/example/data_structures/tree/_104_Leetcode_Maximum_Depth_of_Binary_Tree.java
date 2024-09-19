package org.example.data_structures.tree;

/**
 * _104_Leetcode_Maximum_Depth_of_Binary_Tree
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/19/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/19/24   NhanDinhVan    Create
 */
public class _104_Leetcode_Maximum_Depth_of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return Math.max(l,r) + 1;
    }
}
