package org.example.data_structures.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * _1022_Leetcode_Sum_of_Root_To_Leaf_Binary_Numbers
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/13/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/13/2024    NhanDinhVan    Create
 */

public class _1022_Leetcode_Sum_of_Root_To_Leaf_Binary_Numbers {
//    int sum = 0;
//    public int sumRootToLeaf(TreeNode root) {
//        helper(new ArrayList<>(), root);
//        return sum;
//    }
//
//    public void helper(List<Integer> s, TreeNode root){
//        if(root == null){
//            return;
//        }
//        s.add(root.val);
//        if(root.right == null && root.left == null){
//            System.out.println(s.toString());
//            double tmp = 0 ;
//            for(int i = s.size() - 1; i >= 0; i--){
//                tmp += Math.pow(2, s.size() - i - 1)*s.get(i);
//            }
//            sum += tmp;
//            System.out.println(sum);
//
//        }
//        helper(new ArrayList<>(s), root.left);
//        helper(new ArrayList<>(s), root.right);
//    }


    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int sum){
        if(root == null) return 0;
        sum = sum*2 + root.val;
        if(root.left == null && root.right == null) return sum;
        return dfs(root.right, sum) + dfs(root.left, sum);
    }
}
