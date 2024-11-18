package org.example.depth_first_search;

import org.example.data_structures.tree.TreeNode;

import java.util.*;

/**
 * _671_Leetcode_Second_Minimum_Node_In_a_Binary_Tree
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/18/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/18/2024    NhanDinhVan    Create
 */

public class _671_Leetcode_Second_Minimum_Node_In_a_Binary_Tree {
    Set<Integer> memo = new HashSet<>();
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null) return -1;
        traversal(root);
        Integer[] results = memo.toArray(new Integer[0]);
        if(results.length == 1) return -1;
        Arrays.sort(results);
        return results[1];
    }

    public void traversal(TreeNode root){
        if (root == null) return;
        traversal(root.left);
        memo.add(root.val);
        traversal(root.right);
    }
}
