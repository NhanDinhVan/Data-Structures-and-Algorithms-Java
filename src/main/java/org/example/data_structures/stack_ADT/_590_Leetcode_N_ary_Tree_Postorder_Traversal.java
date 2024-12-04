package org.example.data_structures.stack_ADT;

import java.util.ArrayList;
import java.util.List;

/**
 * _590_Leetcode_N_ary_Tree_Postorder_Traversal
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

public class _590_Leetcode_N_ary_Tree_Postorder_Traversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        return traversal(root, list);
    }

    public List<Integer> traversal(Node root, List<Integer> list){
        if(root == null) return list;
        for(Node r : root.children){
            traversal(r, list);
        }
        list.add(root.val);
        return list;
    }
}
