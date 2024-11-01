package org.example.backtracking;

import org.example.data_structures.tree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * _113_Leetcode_Path_Sum_II
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/1/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/1/2024    NhanDinhVan    Create
 */

public class _113_Leetcode_Path_Sum_II {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return ans;
        backtrack(root, new ArrayList<Integer>(), 0, targetSum);
        return ans;
    }

    public void backtrack(TreeNode root, List<Integer> list, int sum, int target){
        if(root == null)
            return;
        list.add(root.val);
        sum += root.val;
        if(root.right == null && root.left == null && sum == target){
            ans.add(new ArrayList<>(list));
        }else{
            backtrack(root.left, list, sum, target);
            backtrack(root.right, list, sum, target);
        }
        list.remove(list.size() - 1);
    }
}
