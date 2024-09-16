package org.example.data_structures.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * _144_Leetcode_Binary_Tree_Preorder_Traversal
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/16/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/16/24   NhanDinhVan    Create
 */
public class _144_Leetcode_Binary_Tree_Preorder_Traversal {
    List<Integer> resultList = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null)
            return resultList;
        resultList.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return resultList;
    }
}
