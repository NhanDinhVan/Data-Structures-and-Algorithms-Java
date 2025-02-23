package org.example.data_structures.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * _2049_Leetcode_Count_Nodes_With_the_Highest_Score
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/23/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/23/2025    NhanDinhVan    Create
 */

public class _2049_Leetcode_Count_Nodes_With_the_Highest_Score {
        int maxScore = 0;
        int count = 0;
        int totalNodes;
        List<Integer>[] tree;
        int[] subtreeSize;

        public int countHighestScoreNodes(int[] parents) {
            int n = parents.length;
            totalNodes = n;
            tree = new ArrayList[n];
            subtreeSize = new int[n];

            // Khởi tạo danh sách kề
            for (int i = 0; i < n; i++) {
                tree[i] = new ArrayList<>();
            }

            int root = -1;
            for (int i = 0; i < n; i++) {
                if (parents[i] == -1) {
                    root = i;
                } else {
                    tree[parents[i]].add(i);
                }
            }

            // Tính kích thước subtree của từng node
            dfsSubtree(root);
            findHighest(root);

            return count;
        }

        private int dfsSubtree(int node) {
            int size = 1;
            for (int child : tree[node]) {
                size += dfsSubtree(child);
            }
            subtreeSize[node] = size;
            return size;
        }

        private void findHighest(int node) {
            long score = 1;
            int remaining = totalNodes - subtreeSize[node];

            if (remaining > 0) score *= remaining;

            for (int child : tree[node]) {
                score *= subtreeSize[child];
            }

            if (score > maxScore) {
                maxScore = (int) score;
                count = 1;
            } else if (score == maxScore) {
                count++;
            }

            for (int child : tree[node]) {
                findHighest(child);
            }
        }
    }
