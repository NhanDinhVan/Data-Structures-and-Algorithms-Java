package org.example.binary_search;

import javax.sound.midi.Track;
import java.util.LinkedList;
import java.util.Queue;

/**
 * _116_Leetcode_Populating_Next_Right_Pointers_in_Each_Node
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/30/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/30/2024    NhanDinhVan    Create
 */

public class _116_Leetcode_Populating_Next_Right_Pointers_in_Each_Node {
    // Definition for a Node.
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public Node connect(Node root) {
        if (root == null) return null;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node node = q.poll();

                if (i < size - 1) {
                    node.next = q.peek();
                }

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
        }
        return root;
    }
}
