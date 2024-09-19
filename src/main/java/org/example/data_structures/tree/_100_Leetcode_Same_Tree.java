package org.example.data_structures.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * _100_Leetcode_Same_Tree
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/19/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/19/24   NhanDinhVan    Create
 */
public class _100_Leetcode_Same_Tree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> qList = new ArrayList<>();
        List<Integer> pList = new ArrayList<>();

        List<Integer> qResult = preOrderTraversal(q, qList);
        List<Integer> pResult = preOrderTraversal(p, pList);
        return qResult.equals(pResult);
    }
    public List<Integer> preOrderTraversal(TreeNode root, List<Integer> l){
        if(root == null) {
            l.add(null);
            return l;
        }
        l.add(root.val);
        preOrderTraversal(root.left,l);
        preOrderTraversal(root.right,l);

        return l;
    }
}
