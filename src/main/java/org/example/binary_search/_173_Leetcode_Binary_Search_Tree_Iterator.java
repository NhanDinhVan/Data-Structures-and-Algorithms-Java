package org.example.binary_search;

import org.example.data_structures.tree.TreeNode;

import java.util.Stack;

/**
 * _173_Leetcode_Binary_Search_Tree_Iterator
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/27/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/27/2025    NhanDinhVan    Create
 */

public class _173_Leetcode_Binary_Search_Tree_Iterator {
    class BSTIterator {
        Stack<TreeNode> stack;
        public BSTIterator(TreeNode root) {
            stack = new Stack<>();
            pushLeft(root);
        }

        public int next() {
            TreeNode node = stack.pop();
            if(node.right != null){
                pushLeft(node.right);
            }
            return node.val;
        }

        public boolean hasNext() {
            return stack.isEmpty();
        }

        public void pushLeft(TreeNode root){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
        }
    }
}
