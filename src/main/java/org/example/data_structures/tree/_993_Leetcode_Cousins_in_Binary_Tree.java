package org.example.data_structures.tree;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * _993_Leetcode_Cousins_in_Binary_Tree
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/24/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/24/2024    NhanDinhVan    Create
 */

public class _993_Leetcode_Cousins_in_Binary_Tree {
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false; // Kiểm tra nếu cây rỗng

        Queue<Pair<TreeNode, TreeNode>> q = new LinkedList<>();
        q.add(new Pair<>(root, null)); // Lưu nút root với cha là null

        while (!q.isEmpty()) {
            int size = q.size();
            boolean checkX = false;
            boolean checkY = false;
            TreeNode xPar = null; // Lưu trữ cha của x
            TreeNode yPar = null; // Lưu trữ cha của y

            for (int i = 0; i < size; i++) {
                Pair<TreeNode, TreeNode> node = q.poll(); // Lấy cặp (nút, cha)
                TreeNode currentNode = node.getKey();
                TreeNode parent = node.getValue();

                // Kiểm tra xem có phải là nút x không
                if (currentNode.val == x) {
                    checkX = true;
                    xPar = parent;
                }
                // Kiểm tra xem có phải là nút y không
                if (currentNode.val == y) {
                    checkY = true;
                    yPar = parent;
                }

                // Thêm con trái vào hàng đợi
                if (currentNode.left != null) {
                    q.add(new Pair<>(currentNode.left, currentNode));
                }

                // Thêm con phải vào hàng đợi
                if (currentNode.right != null) {
                    q.add(new Pair<>(currentNode.right, currentNode));
                }
            }

            // Nếu cả hai nút đều được tìm thấy cùng cấp
            if (checkX && checkY) {
                // Kiểm tra nếu chúng có cùng cha
                return xPar != yPar;
            }

            // Nếu chỉ tìm thấy 1 trong 2 nút tại cùng cấp, trả về false
            if (checkX || checkY) {
                return false;
            }
        }
        return false;
    }
}
