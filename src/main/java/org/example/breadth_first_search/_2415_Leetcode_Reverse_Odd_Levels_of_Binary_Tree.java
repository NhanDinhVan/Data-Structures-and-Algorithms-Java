package org.example.breadth_first_search;

import java.util.*;

public class _2415_Leetcode_Reverse_Odd_Levels_of_Binary_Tree {
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }
//    public TreeNode reverseOddLevels(TreeNode root) {
//        Queue<TreeNode> queue = new LinkedList<>();
//        int level = 0;
//        queue.add(root);
//        while(!queue.isEmpty()){
//            int size = queue.size();
//            List<TreeNode> currentLevelNodes = new ArrayList<>();
//
//            for (int i = 0; i < size; i++) {
//                TreeNode node = queue.poll();
//                currentLevelNodes.add(node);
//                if (node.left != null) queue.add(node.left);
//                if (node.right != null) queue.add(node.right);
//            }
//
//            if (level % 2 != 0) {
//                int left = 0, right = currentLevelNodes.size() - 1;
//                while (left < right) {
//                    int temp = currentLevelNodes.get(left).val;
//                    currentLevelNodes.get(left).val = currentLevelNodes.get(right).val;
//                    currentLevelNodes.get(right).val = temp;
//                    left++;
//                    right--;
//                }
//            }
//            level++;
//        }
//        return root;
//    }
    public TreeNode reverseOddLevels(TreeNode root) {
        dfs(root.left, root.right, 1);
        return root;
    }
    public void dfs(TreeNode left, TreeNode right, int level){
        if(left == null && right == null) return;

        if(level%2!=0){
            int tmp = left.val;
            left.val = right.val;
            right.val = tmp;
        }
        dfs(left.left, right.right, level+1);
        dfs(left.right, right.left, level+1);
    }
}
