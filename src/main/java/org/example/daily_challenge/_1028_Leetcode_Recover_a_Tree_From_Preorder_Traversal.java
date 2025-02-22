package org.example.daily_challenge;

import org.example.data_structures.tree.TreeNode;

import java.util.Stack;

/**
 * _1028_Leetcode_Recover_a_Tree_From_Preorder_Traversal
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/22/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/22/2025    NhanDinhVan    Create
 */

public class _1028_Leetcode_Recover_a_Tree_From_Preorder_Traversal {
    public TreeNode recoverFromPreorder(String traversal) {
        Stack<TreeNode> stack = new Stack<>();
        int len = traversal.length();
        int i = 0;

        while(i < len){
            int depth = 0;
            while(i < len && traversal.charAt(i) == '-'){
                depth++;
                i++;
            }

            int value = 0;
            while(i < len && Character.isDigit(traversal.charAt(i))){
                value = value*10 + (traversal.charAt(i) - '0');
                i++;
            }

            TreeNode node = new TreeNode(value);

            while(stack.size() > depth){
                stack.pop();
            }

            if(!stack.isEmpty()){
                if(stack.peek().left == null){
                    stack.peek().left = node;
                }else {
                    stack.peek().right = node;
                }
            }

            stack.push(node);
        }
        while (stack.size() > 1) {
            stack.pop();
        }
        return stack.peek();
    }
}
