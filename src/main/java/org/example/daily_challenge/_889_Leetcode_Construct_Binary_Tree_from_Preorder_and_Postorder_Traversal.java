package org.example.daily_challenge;

import org.example.data_structures.tree.TreeNode;

import java.util.Stack;

/**
 * _889_Leetcode_Construct_Binary_Tree_from_Preorder_and_Postorder_Traversal
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/23/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/23/2025    NhanDinhVan    Create
 */

public class _889_Leetcode_Construct_Binary_Tree_from_Preorder_and_Postorder_Traversal {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        Stack<TreeNode> stack = new Stack<>();
        int postIdx = 0;

        TreeNode root = new TreeNode(preorder[0]);
        stack.add(root);
        for(int i = 1; i < preorder.length; i++){
            TreeNode newNode = new TreeNode(preorder[i]);

            if(stack.peek().left == null){
                stack.peek().left = newNode;
            }else{
                stack.peek().right = newNode;
            }

            stack.push(newNode);

            while(!stack.isEmpty() && postorder[postIdx] == stack.peek().val){
                stack.pop();
                postIdx++;
            }
        }
        return root;
    }
}
