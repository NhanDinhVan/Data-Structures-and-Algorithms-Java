package org.example.data_structures.tree;

/**
 * _111_Leetcode_Minimum_Depth_of_Binary_Tree
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/13/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/13/2024    NhanDinhVan    Create
 */

public class _111_Leetcode_Minimum_Depth_of_Binary_Tree {
    int min = Integer.MAX_VALUE;
    public boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }
    public void traversal(TreeNode root, int curDepth){
        if(root == null) {
            return;
        }

        if(isLeaf(root)){
            if(curDepth < min)
                min = curDepth;
            return;
        }
        traversal(root.left, curDepth + 1);
        traversal(root.right, curDepth + 1);
    }
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        traversal(root, 1);
        return min;
    }
}
