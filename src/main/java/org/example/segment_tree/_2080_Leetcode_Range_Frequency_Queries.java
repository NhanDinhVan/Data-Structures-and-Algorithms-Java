package org.example.segment_tree;

import java.util.HashMap;
import java.util.Map;

/**
 * _2080_Leetcode_Range_Frequency_Queries
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/11/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/11/2025    NhanDinhVan    Create
 */

public class _2080_Leetcode_Range_Frequency_Queries {
    class RangeFreqQuery {
        private Map<Integer, Integer>[] tree;
        int arrLength;

        public RangeFreqQuery(int[] arr) {
            this.arrLength = arr.length;
            this.tree = new Map[arrLength*4];

            for(int i = 0; i < this.tree.length; i++){
                tree[i] = new HashMap<>();
            }
            buildTree(arr, 0, 0, arrLength - 1);
        }
        public void buildTree(int[] arr, int node, int start, int end){
            if(start == end){
                tree[node].put(arr[start], 1);
                return;
            }

            int mid = start + (end-start)/2;
            int leftNode = 2*node + 1;
            int rightNode = 2*node + 2;

            buildTree(arr, leftNode, start, mid);
            buildTree(arr, rightNode, mid+1, end);

            merge(tree[node], tree[leftNode]);
            merge(tree[node], tree[rightNode]);
        }

        public void merge(Map<Integer, Integer> parent, Map<Integer, Integer> child){
            for(Map.Entry<Integer, Integer> entry : child.entrySet()){
                parent.put(entry.getKey(), parent.getOrDefault(entry.getKey(), 0)+entry.getValue());
            }
        }

        public int query(int left, int right, int value) {
            return queryTree(0, 0, arrLength - 1, left, right, value);
        }

        public int queryTree(int node, int start, int end, int left, int right, int value){
            if(start > right || end < left) return 0;

            if(start >= left && end <= right){
                return tree[node].getOrDefault(value, 0);
            }

            int mid = start + (end - start)/2;
            int leftNode = 2 * node + 1;
            int rightNode = 2 * node + 2;

            return queryTree(leftNode, start, mid, left, right, value)
                    + queryTree(rightNode, mid+1, end, left, right, value);
        }
    }
}
