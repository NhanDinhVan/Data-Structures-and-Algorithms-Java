package org.example.data_structures.tree;

/**
 * _1339_Leetcode_Maximum_Product_of_Splitted_Binary_Tree
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/22/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/22/2025    NhanDinhVan    Create
 */

public class _1339_Leetcode_Maximum_Product_of_Splitted_Binary_Tree {
    int MOD = 1_000_000_007;
    long sum = 0;
    long maxProduct = 0;

    public long DFS(TreeNode root){
        if(root == null) return 0;
        long subTreeSum = root.val + DFS(root.left) + DFS(root.right);

        if(sum > 0){
            long remainSum = sum - subTreeSum;
            maxProduct = Math.max(maxProduct, subTreeSum * remainSum);
        }

        return subTreeSum;
    }

    public int maxProduct(TreeNode root){
        sum = DFS(root);
        DFS(root);

        return (int) (maxProduct % MOD);
    }
}
