package org.example.depth_first_search;

import org.example.data_structures.tree.TreeNode;

import java.util.*;

/**
 * _230_Leetcode_Kth_Smallest_Element_in_a_BST
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

public class _230_Leetcode_Kth_Smallest_Element_in_a_BST {
    List<Integer> memo = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return -1;
        traversal(root);
        return memo.get(k-1);
    }
    public void traversal(TreeNode root){
        if (root == null) return;
        traversal(root.left);
        memo.add(root.val);
        traversal(root.right);
    }
}
