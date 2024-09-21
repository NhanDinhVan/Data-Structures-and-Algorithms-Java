package org.example.data_structures.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * _637_Leetcode_Average_of_Levels_in_Binary_Tree
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/21/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/21/24   NhanDinhVan    Create
 */
public class _637_Leetcode_Average_of_Levels_in_Binary_Tree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            double sum = 0.0;
            for(int i = 0; i < size; i++){
                TreeNode tmp = q.poll();
                if(tmp.left != null) {
                    q.add(tmp.left);
                }
                if(tmp.right != null) {
                    q.add(tmp.right);
                }
                sum += tmp.val;
            }
            result.add((sum/size));
        }
        return result;
    }
}
