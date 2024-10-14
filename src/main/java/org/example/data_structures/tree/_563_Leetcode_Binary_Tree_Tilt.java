package org.example.data_structures.tree;

/**
 * _563_Leetcode_Binary_Tree_Tilt
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/14/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/14/2024    NhanDinhVan    Create
 */

public class _563_Leetcode_Binary_Tree_Tilt {
    int sum = 0;
    public int traversal(TreeNode root){
        if(root == null)
            return 0;
        int leftSum = traversal(root.left);
        int rightSum = traversal(root.right);
        sum += Math.abs(leftSum - rightSum);
        return root.val + leftSum + rightSum;
    }
    public int findTilt(TreeNode root) {
        traversal(root);
        return sum;
    }
}
