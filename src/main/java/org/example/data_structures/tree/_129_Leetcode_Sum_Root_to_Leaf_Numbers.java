package org.example.data_structures.tree;

/**
 * _129_Leetcode_Sum_Root_to_Leaf_Numbers
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/13/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/13/2024    NhanDinhVan    Create
 */

public class _129_Leetcode_Sum_Root_to_Leaf_Numbers {
    public int sumNumbers(TreeNode root) {
        return DFS(0, root);
    }

    public int DFS(int sum, TreeNode root){
        if(root == null) return 0;
        sum = sum*10 + root.val;
        if(root.left == null && root.right == null){
            return sum;
        }

        return DFS(sum, root.left) + DFS(sum, root.right);
    }
}
