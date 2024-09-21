package org.example.data_structures.tree;

/**
 * _938_Leetcode_Range_Sum_of_BST
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/21/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/21/24   NhanDinhVan    Create
 */
public class _938_Leetcode_Range_Sum_of_BST {
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null)
            return sum;

        if(root.val >= low && root.val <= high)
            sum+=root.val;

        rangeSumBST(root.left, low, high);
        rangeSumBST(root.right, low, high);

        return sum;
    }

}
