package org.example.data_structures.tree;

/**
 * _112_Leetcode_Path_Sum
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
public class _112_Leetcode_Path_Sum {
//    public boolean isLeaf(TreeNode root){
//        return root.right == null && root.left == null;
//    }
//    public boolean traversal(TreeNode root, int sum, int target){
//        if(root == null)
//            return false;
//        sum+= root.val;
//        if(isLeaf(root))
//            return target == sum;
//        boolean lResult = traversal(root.left, sum, target);
//        boolean rResult = traversal(root.right, sum, target);
//        return lResult || rResult;
//    }
//    public boolean hasPathSum(TreeNode root, int targetSum) {
//        return traversal(root, 0, targetSum);
//    }
//
    boolean check = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        System.out.println(targetSum);

        if(root == null)
            return check;
        if(root.left == null && root.right == null && targetSum - root.val == 0){
            check = true;
            return check;
        }
        hasPathSum(root.left, targetSum - root.val);
        hasPathSum(root.right, targetSum - root.val);

        return check;
    }
}
