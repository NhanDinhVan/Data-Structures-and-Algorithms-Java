package org.example.data_structures.tree;

import com.sun.source.tree.Tree;

/**
 * TreeNode
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
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
    TreeNode() {}
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
