package org.example.data_structures.tree;

import java.util.HashMap;
import java.util.HashSet;

/**
 * _653_Leetcode_Two_Sum_IV_Input_is_a_BST
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/23/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/23/2025    NhanDinhVan    Create
 */

public class _653_Leetcode_Two_Sum_IV_Input_is_a_BST {
    HashSet<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        if(set.contains(k - root.val)) return true;

        set.add(root.val);

        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
