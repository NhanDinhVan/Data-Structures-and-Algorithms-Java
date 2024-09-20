package org.example.data_structures.tree;

/**
 * _222_Leetcode_Count_Complete_Tree_Nodes
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/20/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/20/24   NhanDinhVan    Create
 */
public class _222_Leetcode_Count_Complete_Tree_Nodes {
    int count = 0;
    public int countNodes(TreeNode root) {
        if(root == null)
            return count;
        countNodes(root.left);
        count++;
        countNodes(root.right);
        return count;
    }
}
