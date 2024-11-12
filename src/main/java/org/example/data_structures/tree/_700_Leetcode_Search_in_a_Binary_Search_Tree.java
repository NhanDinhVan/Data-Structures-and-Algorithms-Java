package org.example.data_structures.tree;

/**
 * _700_Leetcode_Search_in_a_Binary_Search_Tree
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

public class _700_Leetcode_Search_in_a_Binary_Search_Tree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if(root.val == val)
            return root;
        if(root.val > val)
            return searchBST(root.left, val);
        return searchBST(root.right, val);
    }
}
