package org.example.data_structures.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * _98_Leetcode_Validate_Binary_Search_Tree
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/13/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/13/2024    NhanDinhVan    Create
 */

public class _98_Leetcode_Validate_Binary_Search_Tree {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }

        // Check the current node value against the min and max constraints.
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }

        // Recur to the left and right children with updated bounds.
        return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
    }
}
