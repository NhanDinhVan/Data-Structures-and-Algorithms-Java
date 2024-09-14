package org.example.data_structures.tree;

import com.sun.source.tree.Tree;

/**
 * MyBinarytree
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/14/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/14/24   NhanDinhVan    Create
 */
public class MyBinaryTree {
    private TreeNode root;

    public MyBinaryTree(){

    }

    public void init(){
        TreeNode n0 = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        n0.left = n1; n0.right= n2;
        n1.left = n3; n1.right = n4;
        n2.right = n5;

        this.root = n0;
    }

}
