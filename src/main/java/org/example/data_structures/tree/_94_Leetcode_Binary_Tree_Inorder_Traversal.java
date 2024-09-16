package org.example.data_structures.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * _94_Leetcode_Binary_Tree_Inorder_Traversal
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
public class _94_Leetcode_Binary_Tree_Inorder_Traversal {
    List<Integer> resultList = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null)
            return resultList;
        inorderTraversal(root.left);
        resultList.add(root.val);
        inorderTraversal(root.right);

        return resultList;
    }
}
