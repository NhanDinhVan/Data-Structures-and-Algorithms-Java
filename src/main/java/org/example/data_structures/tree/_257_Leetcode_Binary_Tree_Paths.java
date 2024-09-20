package org.example.data_structures.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * _257_Leetcode_Binary_Tree_Paths
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
public class _257_Leetcode_Binary_Tree_Paths {
    List<String> result = new ArrayList<>();
    StringBuilder s = new StringBuilder();

    public boolean isLeaf(TreeNode root){
        return root.right == null && root.left == null;
    }
    public List<String> traversal(TreeNode root, StringBuilder s){
        if(root == null)
            return result;
        if(isLeaf(root)){
            s.append("->"+root.val);
            result.add(s.toString());
            return result;
        }

            s.append("->"+root.val);

        traversal(root.left, new StringBuilder(s.toString()));
        traversal(root.right, new StringBuilder(s.toString()));
        return result;
    }
    public List<String> binaryTreePaths(TreeNode root) {
        s.append(root.val);

        if(isLeaf(root))
            result.add(s.toString());
        traversal(root.right,new StringBuilder(s.toString()));
        traversal(root.left,new StringBuilder(s.toString()));
        return result;
    }
}
