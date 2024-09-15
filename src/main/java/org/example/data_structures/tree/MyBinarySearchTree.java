package org.example.data_structures.tree;

/**
 * MyBinarySearchTree
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
public class MyBinarySearchTree {
    public TreeNode root;

    public MyBinarySearchTree(){}

    public TreeNode insert(TreeNode root, int value) {
        TreeNode newNode = new TreeNode(value);
        if (root == null) {
            root = newNode;
            return root;
        }
        TreeNode tmp = root;
        while(true){

            if (value > tmp.val ){
                if(tmp.right == null){
                    tmp.right = newNode;
                    break;
                }else{
                    tmp = tmp.right;
                }
            }else{
                if(tmp.left == null){
                    tmp.left = newNode;
                    break;
                }else{
                    tmp = tmp.left;
                }
            }
        }
        return root;
    }
}
