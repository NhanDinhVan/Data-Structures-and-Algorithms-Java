package org.example.breadth_first_search;

import org.example.data_structures.tree.TreeNode;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * _2583_Leetcode_Kth_Largest_Sum_in_a_Binary_Tree
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/22/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/22/2024    NhanDinhVan    Create
 */

public class _2583_Leetcode_Kth_Largest_Sum_in_a_Binary_Tree {
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        PriorityQueue<Long> queue = new PriorityQueue<>(Comparator.reverseOrder());
        q.add(root);
        if(root == null)
            return -1;
        while (!q.isEmpty()){
            int size = q.size();
            long sum = 0;
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                sum += node.val;
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
            }
            queue.add(sum);
        }
        while (k > 0){
            if(queue.isEmpty())
                return -1;
            if(k == 1)
                return queue.poll();
            queue.poll();
            k--;
        }
        return -1;
    }
}
