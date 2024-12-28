package org.example.data_structures.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * _872_Leetcode_Leaf_Similar_Trees
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/29/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/29/2024    NhanDinhVan    Create
 */

public class _872_Leetcode_Leaf_Similar_Trees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        collectLeaves(root1, l1);
        collectLeaves(root2, l2);

        return l1.equals(l2);
    }

    private void collectLeaves(TreeNode root, List<Integer> leaves) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            leaves.add(root.val);
            return;
        }
        collectLeaves(root.left, leaves);
        collectLeaves(root.right, leaves);
    }
}
