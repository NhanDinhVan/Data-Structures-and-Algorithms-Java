package org.example.data_structures.tree;

/**
 * _404_Leetcode_Sum_of_Left_Leaves
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

public class _404_Leetcode_Sum_of_Left_Leaves {
    int sum = 0;
    public boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }
    public void Traversal(boolean isLeft, TreeNode root){
        if(root == null)
            return;
        if(isLeft && isLeaf(root))
            sum+=root.val;
        Traversal(true, root.left);
        Traversal(false, root.right);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        Traversal(true, root.left);
        Traversal(false, root.right);
        return sum;
    }
}
