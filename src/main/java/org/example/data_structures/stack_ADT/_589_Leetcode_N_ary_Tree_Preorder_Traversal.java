package org.example.data_structures.stack_ADT;

import org.example.data_structures.linked_list.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * _589_Leetcode_N_ary_Tree_Preorder_Traversal
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

public class _589_Leetcode_N_ary_Tree_Preorder_Traversal {
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root!=null)
            traversal(root);
        return result;
    }
    public void traversal(Node root){
        result.add(root.val);
        for(Node r : root.children){
            if(r!=null){
                traversal(r);
            }
        }
    }

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
}
