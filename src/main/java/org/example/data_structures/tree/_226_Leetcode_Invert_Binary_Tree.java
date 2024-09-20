package org.example.data_structures.tree;

/**
 * _226_Leetcode_Invert_Binary_Tree
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/20/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/20/24   NhanDinhVan    Create
 */
public class _226_Leetcode_Invert_Binary_Tree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
