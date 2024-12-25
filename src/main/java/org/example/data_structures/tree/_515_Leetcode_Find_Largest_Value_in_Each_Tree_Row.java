package org.example.data_structures.tree;

import java.util.*;

/**
 * _515_Leetcode_Find_Largest_Value_in_Each_Tree_Row
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/25/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/25/2024    NhanDinhVan    Create
 */

public class _515_Leetcode_Find_Largest_Value_in_Each_Tree_Row {
    public List<Integer> largestValues(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < size; i++){
                TreeNode n = q.poll();
                max = Math.max(max, n.val);
                if(n.right != null) q.add(n.right);
                if(n.left != null) q.add(n.left);
            }
            ans.add(max);
        }
        return ans;
    }
}
