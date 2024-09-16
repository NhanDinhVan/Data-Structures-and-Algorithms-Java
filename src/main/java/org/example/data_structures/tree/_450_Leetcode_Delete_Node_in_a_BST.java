package org.example.data_structures.tree;

import com.sun.source.tree.Tree;

/**
 * _450_Leetcode_Delete_Node_in_a_BST
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
public class _450_Leetcode_Delete_Node_in_a_BST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return null;
        if(key > root.val){
            root.right = deleteNode(root.right, key);
        }else if(key < root.val){
            root.left = deleteNode(root.left, key);
        }else{
            if(root.left == null && root.right == null)
                return null;
            if(root.right == null && root.left != null)
                return root.left;
            if(root.right != null && root.left == null)
                return root.right;

            TreeNode leftModeNode = findLeftNode(root.right);
            root.val = leftModeNode.val;
            root.right = deleteNode(root.right, leftModeNode.val);
        }
        return root;
    }
    public static TreeNode findLeftNode(TreeNode root){
        if(root == null) return null;

        while(root.left != null)
            root = root.left;
        return root;
    }
    public static TreeNode findRightNode(TreeNode root){
        if(root == null) return null;

        while(root.right != null)
            root = root.right;
        return root;
    }
}
