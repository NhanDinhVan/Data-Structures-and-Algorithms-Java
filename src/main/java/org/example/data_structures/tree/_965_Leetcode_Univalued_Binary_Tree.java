package org.example.data_structures.tree;

/**
 * _965_Leetcode_Univalued_Binary_Tree
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/12/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/12/2024    NhanDinhVan    Create
 */

public class _965_Leetcode_Univalued_Binary_Tree {
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        return helper(root, root.val);
    }

    public boolean helper(TreeNode root, int val){
        if(root == null) return true;
        if(root.val != val) return false;

        return helper(root.left,val) && helper(root.right, val);
    }
}
