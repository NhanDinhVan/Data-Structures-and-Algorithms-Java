package org.example.data_structures.tree;

/**
 * _701_Leetcode_Insert_into_a_Binary_Search_Tree
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/16/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/16/24   NhanDinhVan    Create
 */
public class _701_Leetcode_Insert_into_a_Binary_Search_Tree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if(root == null){
            root = newNode;
            return root;
        }
        if(val > root.val)
            root.right = insertIntoBST(root.right, val);
        else
            root.left = insertIntoBST(root.left, val);

        return root;
    }
}
