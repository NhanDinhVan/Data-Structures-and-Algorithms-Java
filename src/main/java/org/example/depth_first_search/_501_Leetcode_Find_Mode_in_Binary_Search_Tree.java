package org.example.depth_first_search;

import org.example.data_structures.tree.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * _501_Leetcode_Find_Mode_in_Binary_Search_Tree
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/16/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/16/2025    NhanDinhVan    Create
 */

public class _501_Leetcode_Find_Mode_in_Binary_Search_Tree {
    HashMap<Integer, Integer> dict = new HashMap<>();
    int max = 1;
    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrderTraversal(root);
        for(Map.Entry<Integer, Integer> entry : dict.entrySet()){
            if(entry.getValue() == max) list.add(entry.getKey());
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public void inOrderTraversal(TreeNode root){
        dict.put(root.val, dict.getOrDefault(root.val, 0)+1);
        max = Math.max(max, dict.get(root.val));
        if(root.left!=null) inOrderTraversal(root.left);
        if(root.right!=null) inOrderTraversal(root.right);
    }
}
