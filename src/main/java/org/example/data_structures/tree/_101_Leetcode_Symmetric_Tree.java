package org.example.data_structures.tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * _101_Leetcode_Symmetric_Tree
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/18/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/18/24   NhanDinhVan    Create
 */
public class _101_Leetcode_Symmetric_Tree {
    List<Integer> lBranch = new ArrayList<>();
    List<Integer> rBranch = new ArrayList<>();

    public boolean isSymmetric(TreeNode root) {
        leftTraversal(root);
        rightTraversal(root);
        return lBranch.equals(rBranch);
    }
    public List<Integer> leftTraversal(TreeNode root){
        if(root == null){
            lBranch.add(null);
            return lBranch;
        }

        lBranch.add(root.val);
        leftTraversal(root.left);
        leftTraversal(root.right);
        return lBranch;
    }
    public List<Integer> rightTraversal(TreeNode root){
        if(root == null){
            rBranch.add(null);
            return rBranch;
        }
        rBranch.add(root.val);
        rightTraversal(root.right);
        rightTraversal(root.left);
        return rBranch;
    }

}
