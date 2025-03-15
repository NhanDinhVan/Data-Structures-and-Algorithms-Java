package org.example.dynamic_programing;

import org.example.data_structures.tree.TreeNode;

import java.util.HashMap;

/**
 * _337_Leetcode_House_Robber_III
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/15/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/15/2025    NhanDinhVan    Create
 */

public class _337_Leetcode_House_Robber_III {
    HashMap<TreeNode, Integer> memo = new HashMap<>();
    public int rob(TreeNode root) {
        if(root == null) return 0;
        if(memo.containsKey(root)) return memo.get(root);

        int robNode = root.val;
        if(root.left != null) robNode += rob(root.left.left) + rob(root.left.right);
        if(root.right != null) robNode += rob(root.right.left) + rob(root.right.right);

        int notRobNode = rob(root.left) + rob(root.right);

        int max = Math.max(robNode, notRobNode);
        memo.put(root, max);
        return max;
    }
}
