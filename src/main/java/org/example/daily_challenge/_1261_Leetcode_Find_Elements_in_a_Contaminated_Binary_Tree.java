package org.example.daily_challenge;

import org.example.data_structures.tree.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * _1261_Leetcode_Find_Elements_in_a_Contaminated_Binary_Tree
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/21/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/21/2025    NhanDinhVan    Create
 */

public class _1261_Leetcode_Find_Elements_in_a_Contaminated_Binary_Tree {
    class FindElements {
        Set<Integer> dict;
        public FindElements(TreeNode root) {
            dict = new HashSet<>();
            root.val = 0;
            dict.add(0);
            defineTree(root);
        }

        public void defineTree(TreeNode root){
            if(root == null) return;

            if(root.left != null){
                root.left.val = root.val*2+1;
                dict.add(root.left.val);
                defineTree(root.left);
            }
            if(root.right != null){
                root.right.val = root.val*2+2;
                dict.add(root.right.val);
                defineTree(root.right);
            }
        }

        public boolean find(int target) {
            return dict.contains(target);
        }
    }
}
