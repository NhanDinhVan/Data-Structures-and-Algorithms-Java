package org.example.data_structures.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * _145_Leetcode_Binary_Tree_Postorder_Traversal
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
public class _145_Leetcode_Binary_Tree_Postorder_Traversal {
    List<Integer> resultList = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return resultList;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        resultList.add(root.val);

        return resultList;
    }
}
