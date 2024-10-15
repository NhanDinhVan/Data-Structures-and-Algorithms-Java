package org.example.data_structures.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * _783_Minimum_Distance_Between_BST_Nodes
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/15/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/15/2024    NhanDinhVan    Create
 */

public class _783_Minimum_Distance_Between_BST_Nodes {
    private List<Integer> values = new ArrayList<>();

    public int minDiffInBST(TreeNode root) {
        inOrderTraversal(root);
        int minDiff = Integer.MAX_VALUE;

        // Tính toán hiệu số giữa các giá trị liền kề
        for (int i = 1; i < values.size(); i++) {
            minDiff = Math.min(minDiff, values.get(i) - values.get(i - 1));
        }

        return minDiff;
    }

    private void inOrderTraversal(TreeNode node) {
        if (node == null) return;

        // Duyệt trái
        inOrderTraversal(node.left);
        // Thêm giá trị của nút vào danh sách
        values.add(node.val);
        // Duyệt phải
        inOrderTraversal(node.right);
    }
}
