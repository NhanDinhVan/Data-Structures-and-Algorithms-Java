package org.example.data_structures.stack_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * _429_Leetcode_N_ary_Tree_Level_Order_Traversal
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/4/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/4/2024    NhanDinhVan    Create
 */
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class _429_Leetcode_N_ary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return new ArrayList<>(); // Trả về danh sách rỗng nếu cây là null
        }

        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        queue.add(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> tmp = new ArrayList<>();

            for(int i = 0; i < size; i++){
                Node current = queue.poll(); // Lấy nút đầu tiên ra khỏi hàng đợi
                tmp.add(current.val); // Thêm giá trị của nút vào danh sách tạm thời
                for (Node child : current.children) { // Duyệt qua các con của nút
                    queue.add(child); // Thêm các con vào hàng đợi
                }
            }
            ans.add(tmp);
        }
        return ans;
    }
}
