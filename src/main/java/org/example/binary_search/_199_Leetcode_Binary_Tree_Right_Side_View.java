package org.example.binary_search;

import org.example.data_structures.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * _199_Leetcode_Binary_Tree_Right_Side_View
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/29/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/29/2024    NhanDinhVan    Create
 */

public class _199_Leetcode_Binary_Tree_Right_Side_View {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                if(i==size-1) ans.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
        }
        return ans;
    }
}
