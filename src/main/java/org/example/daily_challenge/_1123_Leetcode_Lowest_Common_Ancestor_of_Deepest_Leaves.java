package org.example.daily_challenge;

import javafx.util.Pair;
import org.example.data_structures.tree.TreeNode;

/**
 * _1123_Leetcode_Lowest_Common_Ancestor_of_Deepest_Leaves
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/5/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/5/2025    NhanDinhVan    Create
 */

public class _1123_Leetcode_Lowest_Common_Ancestor_of_Deepest_Leaves {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return dfs(root).getKey();
    }

    public static Pair<TreeNode, Integer> dfs(TreeNode root){
        if(root == null) return new Pair<>(null, 0);

        Pair<TreeNode, Integer> left = dfs(root.left);
        Pair<TreeNode, Integer> right = dfs(root.right);

        if(left.getValue() > right.getValue()){
            return new Pair<>(left.getKey(), left.getValue()+1);
        }else if( left.getValue() < right.getValue()){
            return new Pair<>(right.getKey(), right.getValue()+1);
        }else{
            return new Pair<>(root, left.getValue()+1);
        }
    }
}
