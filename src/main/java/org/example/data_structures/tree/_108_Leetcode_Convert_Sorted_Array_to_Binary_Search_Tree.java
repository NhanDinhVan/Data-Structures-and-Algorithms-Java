package org.example.data_structures.tree;

/**
 * _108_Leetcode_Convert_Sorted_Array_to_Binary_Search_Tree
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/21/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/21/24   NhanDinhVan    Create
 */
public class _108_Leetcode_Convert_Sorted_Array_to_Binary_Search_Tree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return divide(nums, 0, nums.length-1);
    }
    public TreeNode divide(int[] nums, int l, int r){
        if(l>r)
            return null;
        int m = l + (r-l)/2;
        TreeNode newNode = new TreeNode(nums[m]);
        newNode.left = divide(nums, m+1, r);
        newNode.right = divide(nums, l, m-1);
        return newNode;
    }
}
